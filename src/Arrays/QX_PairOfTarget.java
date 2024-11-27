package Arrays;

import java.util.HashSet;

public class QX_PairOfTarget {
    static void findPairs(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            int complement = target - num;
            if(set.contains(complement)){
                System.out.println("Pair found : (" + complement + ", " + num + ")" );
            }
            set.add(num);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        findPairs(arr, target);
    }
}
