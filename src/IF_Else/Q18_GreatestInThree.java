package IF_Else;

public class Q18_GreatestInThree {
    public static void main(String[] args) {
        int a = 1, b = 24, c = 19;
        if(a == b || a == c || b == c)
            System.out.println("Kuch toh gadbad hai dayaa...");
        else if(a > b && a > c) {
            System.out.println("A is greatest: "+ a);
        }else if( b > c && b > a){
            System.out.println("B is greatest: "+ b);
        }else{
            System.out.println("C is greatest: "+ c);
        }
    }
}
