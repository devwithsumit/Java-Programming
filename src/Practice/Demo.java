package Practice;

import java.util.*;

public class Demo {
    public static int percentageLetter(String s, char letter) {
        int charCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter) charCount++;
        }
        System.out.println(charCount);
        System.out.println(((float)charCount/s.length()) * 100 );
        int percentage = (int) (((float)charCount/s.length()) * 100);
        return percentage;
    }

    public static void main(String[] args) {

        System.out.println(percentageLetter("foobar", 'o'));

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
