package Practice;

import java.util.*;

public class Demo {
    public int countAsterisks(String s) {
        int count = 0;
        boolean isOutside = true;
        for (char ch : s.toCharArray()) {
            if (ch == '|')
                isOutside = !isOutside;

            if (isOutside && ch == ('*'))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);
        list1.add(100);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(30);
        list2.add(100);

        list2.remove((Integer) 100);

        list2.set(1, 33);
//        list2.clear();

        System.out.println(list1);
        System.out.println(list2);

        list1.forEach(System.out::println);
    }
}
