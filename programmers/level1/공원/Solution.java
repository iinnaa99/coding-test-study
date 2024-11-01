import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        Arrays.sort(mats);
        
        for (int i = mats.length - 1; i >= 0; i--){
            if (checkSize(mats[i], park)) {
                answer = mats[i];
                break;
            }
        }
        return answer;
    }
    
    private boolean checkSize(int mat, String[][] park) {
        for (int i = 0; i <= park.length - mat; i++) {
            for (int j = 0; j <= park[i].length - mat; j++) {
                
                boolean canPlace = true;
                for (int k = 0; k < mat; k++) {
                    for (int l = 0; l < mat; l++) {
                        if (!park[i + k][j + l].equals("-1")) {
                            canPlace = false;
                            break;
                        }
                    }
                    if (!canPlace) break;
                }
                if (canPlace) return true;
            }
        }
        return false;
    }
}