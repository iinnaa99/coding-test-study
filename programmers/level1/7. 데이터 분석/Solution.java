import java.util.ArrayList; 
import java.util.List;      
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        
        int filterIdx = -1;  
        int sortIdx = -1;    
        
        if (ext.equals("code")) {
            filterIdx = 0;
        } else if (ext.equals("date")) {
            filterIdx = 1;
        } else if (ext.equals("maximum")) {
            filterIdx = 2;
        } else if (ext.equals("remain")) {
            filterIdx = 3;
        }

        if (sort_by.equals("code")) {
            sortIdx = 0;
        } else if (sort_by.equals("date")) {
            sortIdx = 1;
        } else if (sort_by.equals("maximum")) {
            sortIdx = 2;
        } else if (sort_by.equals("remain")) {
            sortIdx = 3;
        }
        
        ArrayList<int[]> filteredList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i][filterIdx] < val_ext) { 
                filteredList.add(data[i]);
            }
        }
        
        int finalSortIdx = sortIdx; 
        filteredList.sort((o1, o2) -> Integer.compare(o1[finalSortIdx], o2[finalSortIdx]));
        
        answer = new int[filteredList.size()][];
        for (int i = 0; i < filteredList.size(); i++) {
            answer[i] = filteredList.get(i);
        }
        
        return answer;
    }
}
