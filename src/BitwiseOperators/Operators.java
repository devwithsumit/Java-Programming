package BitwiseOperators;

public class Operators {
    /**
     * Operators that work directly on BINARY representations of numbers.
     * • AND - & (return true only when both of the symbols are 1.
     * [ 0,0 :- 0; 0,1 :- 0 ; 1,0 :- 0; 1,1 :- 1])
     * • OR - |  (return true even if one of the symbol is 1.
     * [1,0 :- 1; 0,1 :- 1 ; 1,0 :- 1; 0,0 :- 0])
     * • XOR - ^ (return true only when one of the symbol is different.
     * [0,0 :- 0; 0,1 :- 1 ; 1,0 :- 1; 1,1 :- 0])
     * • Not - ~ (return true when both the bits are equal.
     * [0,0 :- 1; 0,1 :- 0 ; 1,0 :- 0; 1,1 :- 1])
     * • LeftShift - << (Shifts the bits of a number to the left by a specified number of positions.)
     * • RightShift - >> (Shifts the bits of a number to the right by a specified number of positions.)
     */
    public static void main(String[] args) {
        System.out.println("5 & 3: " + (5 & 3));
        /* 1 0 1 -> 5
           0 1 1 -> 3
        -----------
           0 0 1 -> 1 (output)
           */
        System.out.println("5 | 3: " + (5 | 3));
        /* 1 0 1 -> 5
           0 1 1 -> 3
        -----------
           1 1 1 -> 7 (output)
           */
        System.out.println("5 ^ 3: " + (5 ^ 3));
        /* 1 0 1 -> 5
           0 1 1 -> 3
        -----------
           1 1 0 -> 6 (output)
           */
        System.out.println("10 << 2 :" + (10 << 2)); //(input << positions) shift the bits to left and add 2 bits to the right
        /*
           1 0 1 0  -> 10 (input)
       _ _ _ _ _ _
       1 0 1 0 0 0  -> 40 (output) */

        System.out.println("10 >> 2 :" + (10 >> 2)); //(input >> positions) shift the bits to right means simply remove 2 bits from right.
        /*
           1 0 1 0  -> 10 (input)
           _ _ _ _
               1 0  -> 2 (output)
    dropped bits - 1 0 */

    }
}
