import java.util.*;
import java.io.*;

class Solution {
    public String solution(String new_id) {
        // 1�ܰ�
        String answer = new_id.toLowerCase()
            // 2�ܰ�
            .replaceAll("[^\\.\\-_0-9a-z]", "")
            // 3�ܰ�
            .replaceAll("\\.{2,}", "\\.");
        // 4�ܰ�
        if(answer.charAt(0) == '.') answer = answer.substring(1);
        if(answer.length() >= 1 && answer.charAt(answer.length() - 1) == '.') answer = answer.substring(0, answer.length() - 1);
        // 5�ܰ�
        if(answer.length() == 0) answer = "a";
        // 6�ܰ�
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            if(answer.charAt(answer.length() - 1) == '.') answer = answer.substring(0, 14);
        }
        // 7�ܰ�
        if(answer.length() <= 2){
            while(answer.length() != 3){
                String[] split = answer.split("");
                answer = answer + split[answer.length() - 1];
            }
        }
        return answer;
    }
}