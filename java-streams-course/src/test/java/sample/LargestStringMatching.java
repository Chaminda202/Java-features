package sample;

import java.util.*;


public class LargestStringMatching {
    public static void main(String[] args){
        System.out.println(solution("aabbbaccddddc"));
    }

    private static int solution(String text) {
        char [] characters = text.toCharArray();
        String matching = "";
        Set<String> matchingText = new HashSet<>();
        int maxLength = 0;
        for(int i=0; i< text.length(); i++){
            if(i >=2){
                if(characters[i-2] == characters[i-1] && characters[i-1] == characters[i]){
                    matchingText.add(matching);
                    maxLength = maxLength < matching.length() ? matching.length() : maxLength;
                    matching = "";
                    matching = String.valueOf(characters[i-1])+String.valueOf(characters[i]);
                }else{
                    matching+= String.valueOf(characters[i]);
                }
            }else{
                matching+= String.valueOf(characters[i]);
            }
            if(i == text.length() -1)
                matchingText.add(matching);
        }
        System.out.println("String matching  "+matchingText);
        return maxLength;
    }
}
