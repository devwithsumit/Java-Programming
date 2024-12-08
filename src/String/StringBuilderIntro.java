package String;

public class StringBuilderIntro {
    public static void main(String[] args) {

        //-- Constructors
        /*2*///Creates an empty StringBuilder object with a default capacity of 16 characters.
        StringBuilder str =  new StringBuilder();/*Default length 16*/

        /*2*/// Creates a StringBuilder with an initial capacity of n characters.
        StringBuilder str1 =  new StringBuilder(50);

        /*3*///Creates a StringBuilder initialized with the given string, with a capacity of str.length() + 16.
        StringBuilder str2 =  new StringBuilder("Reverse");

        //---Manipulations
        str.append("Hello"); /*Append at the end*/
        str.insert(5, " World"); /*insert at specific index*/
        str.replace(5, str.length(), " Java");/*replace from "index" to "index-1"*/
        str.delete(6, 11); /*delete from "i" to "i - 1" */
        str.deleteCharAt(0); /*delete specific index character*/
        str2.reverse(); /*reverse full string with every character*/
        System.out.println(str);

        //---Special methods
        System.out.println(str1.capacity());/*returns the capacity of the StringBuilder*/

        System.out.println(str2.length());/*returns the length of the string inside StringBuilder*/

        str.ensureCapacity(50);/*Ensures that the capacity is at least equal to the specified value */
        System.out.println(str.capacity());
    }
}
