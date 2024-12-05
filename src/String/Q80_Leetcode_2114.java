package String;

public class Q80_Leetcode_2114 {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 1;
        for (String sentence : sentences) {
            max = Math.max(sentence.split(" ").length, max);
        }
        System.out.println(max);
    }
}
