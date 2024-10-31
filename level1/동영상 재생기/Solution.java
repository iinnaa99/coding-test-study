class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        pos = skipOpening(op_start, op_end, pos);
        for (String command : commands) {
            if (command.equals("prev")) {
                pos = movePrev(pos);
            } else if (command.equals("next")) {
                pos = moveNext(video_len, pos);
            }
            pos = skipOpening(op_start, op_end, pos);
        }
        return pos;
    }

    private String skipOpening(String op_start, String op_end, String pos) {
        int opStart = convertToSeconds(op_start);
        int opEnd = convertToSeconds(op_end);
        int posSec = convertToSeconds(pos);

        if (posSec >= opStart && posSec <= opEnd) {
            pos = op_end; // 비디오의 끝으로 이동
        }
        return pos;
    }

    private int convertToSeconds(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    private String movePrev(String pos) {
        int mm = Integer.parseInt(pos.split(":")[0]);
        int ss = Integer.parseInt(pos.split(":")[1]) - 10;

        if (ss < 0) {
            mm -= 1;
            ss += 60;
        }

        if (mm < 0) {
            mm = 0;
            ss = 0;
        }

        return formatTime(mm, ss);
    }

    private String moveNext(String video_len, String pos) {
        int mm = Integer.parseInt(pos.split(":")[0]);
        int ss = Integer.parseInt(pos.split(":")[1]) + 10;

        if (ss >= 60) {
            mm += 1;
            ss -= 60;
        }

        String[] videoLen = video_len.split(":");
        int maxMM = Integer.parseInt(videoLen[0]);
        int maxSS = Integer.parseInt(videoLen[1]);

        if ((mm > maxMM) || (mm == maxMM && ss > maxSS)) {
            mm = maxMM;
            ss = maxSS;
        }

        return formatTime(mm, ss);
    }

    private String formatTime(int mm, int ss) {
        String m = mm < 10 ? "0" + mm : "" + mm;
        String s = ss < 10 ? "0" + ss : "" + ss;
        return m + ":" + s;
    }
}
