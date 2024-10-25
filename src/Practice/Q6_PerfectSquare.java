package Practice;

public class Q6_PerfectSquare {
    public static void main(String[] args) {
        double n = 9;
        double ans = Math.sqrt(n);
        System.out.println(n % ans == 0 ? "Perfect sq." : "Not Perfect sq.");
//        boolean isPerfectSquare = false;
//        for(int i = 1; i <= n/2; i++){
//            if(i * i > n) break;
//            System.out.println(0);
//            if(i * i == n){
//                isPerfectSquare = true;
//                break;
//            }
//        }
//        System.out.println(isPerfectSquare ? "Yes" : "No");
    }
}
