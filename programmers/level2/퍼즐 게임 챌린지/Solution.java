class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int start = 1;
        int end = 100000;
        int answer = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            long totalTime = getTotalTime(diffs, times, mid, limit);

            if (totalTime <= limit) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }
    
    private long getTotalTime(int[] diffs, int[] times, int level, long limit) {
        long totalTime = 0;
        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int timeCur = times[i];
            int timePrev = (i > 0) ? times[i - 1] : 0;
            
            if (diff <= level) {
                totalTime += timeCur;
            } else {
                int mistakes = diff - level;
                totalTime += (long) (timeCur + timePrev) * mistakes + timeCur;
            }

            if (totalTime > limit) {
                return totalTime;
            }
        }
        return totalTime;
    }
}