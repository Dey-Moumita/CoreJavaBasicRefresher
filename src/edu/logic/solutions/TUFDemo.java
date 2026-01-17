package edu.logic.solutions;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public void frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int maxFreq = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            if(maxFreq<freq){
                maxFreq = freq;
            }
        }
        System.out.println(maxFreq);
    }
}


public class TUFDemo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.frequencySort("Mooou");

    }
}
