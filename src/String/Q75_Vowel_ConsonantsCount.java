package String;

public class Q75_Vowel_ConsonantsCount {
    public static void main(String[] args) {
        String s = "ytfcvbnkaeio";
        int vCount = 0, cCount = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u' -> vCount++;
                default -> cCount++;
            }
        }
        System.out.println("vowels : " + vCount);
        System.out.println("consonants : " + cCount);
    }
}
