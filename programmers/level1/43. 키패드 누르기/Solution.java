class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 12;
        
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                right = num;
            } else {
                if (num == 0) num = 11;
                
                int leftDistance = Math.abs(num - left) / 3 + Math.abs(num - left) % 3;
                int rightDistance = Math.abs(num - right) / 3 + Math.abs(num - right) % 3;

                if (leftDistance < rightDistance) {
                    sb.append("L");
                    left = num;
                } else if (leftDistance > rightDistance) {
                    sb.append("R");
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = num;
                    } else {
                        sb.append("R");
                        right = num;
                    }
                }
            }
        }
        return sb.toString();
    }
}