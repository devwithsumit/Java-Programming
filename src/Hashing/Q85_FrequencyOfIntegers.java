package Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q85_FrequencyOfIntegers {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,3,4,1,5,5,6};
        Map<Integer, Integer> freqMap = new TreeMap<>(Collections.reverseOrder());
        for(int j: arr){
            freqMap.put(j, freqMap.getOrDefault(j, 0) + 1);
        }
        String[] ans = new String[5];
        for(Map.Entry<Integer, Integer> e: freqMap.entrySet())
//        for(int j: arr){
//            if(freqMap.containsKey(j)){
//                freqMap.put(j, freqMap.get(j) + 1);
//            }else{
//                freqMap.put(j, 1);
//            }
//        }

        System.out.println(freqMap);
    }
}
