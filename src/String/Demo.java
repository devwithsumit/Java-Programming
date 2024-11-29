package String;

public class Demo {
    public static void main(String[] args) {

        //methods for initialising a String
        /*1*/String a = new String("method1");
        /*2*/String b = new String(new char[]{'m', 't', 'd'});
        /*3*/String c = "Hello";

        //compareTo && compareToIgnoreCase
        String str1 = "a";
        String str2 = "ABCDFG";

        //compareToIgnoreCase returns only the size difference
        System.out.println(str1.compareToIgnoreCase(str2));
        //compareTo returns the size difference as well as ASCII value difference
        // the UpperCase and the lowercase character are treated different;
        System.out.println(str1.compareTo(str2));

        //equals method to compare string ( str1 == str2 is not Allowed)
        System.out.println(str1.equals(str2));

    }
}
