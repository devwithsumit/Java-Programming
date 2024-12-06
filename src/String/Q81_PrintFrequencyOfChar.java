package String;

public class Q81_PrintFrequencyOfChar {
    public static void main(String[] args) {
        String str = "asdfghszxasredsxd";
        int[] charBitMap = new int[26];

        for (int i = 0; i < str.length(); i++) {
            charBitMap[str.charAt(i) - 97]++;
        }

        for (int i = 0; i < charBitMap.length; i++) {
            if (charBitMap[i] > 0) {
                System.out.println((char) (i + 97) + " -> " + (charBitMap[i]));
            };
        }
    }
}
