class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        
        answer = answer.replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("[.]+", ".") 
                .replaceAll("^[.]", "") 
                .replaceAll("[.]$", ""); 
        
        if (answer.length() == 0) { 
            answer += "a";
        }

        if (answer.length() >= 16) { 
            answer = answer.substring(0, 15).replaceAll("[.]$", "");
        }

        if (answer.length() <= 2) { 
            char c = answer.charAt(answer.length() - 1);

            while (answer.length() != 3) {
                answer += c;
            }
        }        
        return answer;
    }
}