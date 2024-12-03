package String;

public class Q77_FindPrefInArray {
    public static boolean startsWith(String str, String pref){
        if(str.length() < pref.length()) return false;

        for (int i = 0; i < pref.length(); i++) {
            if(pref.charAt(i) != str.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] str = {"pay", "practice", "attend", "attempt"};
        int count = 0;
        String pref = "at";
        for(String j : str){
            if(j.startsWith(pref)){
                count++;
            }
        }
        System.out.println(count);
    }
}
