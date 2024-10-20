package Practice;

public class Q3_ISBN {
    public static void main(String[] args) {
        long n = 4238156123L;
        long temp = n;
        long count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        if(count != 10){
            System.out.println("illegal ISBN");
        }else{
            long sum = 0;
            while (count > 0){
                sum = sum + ((temp % 10) * count);
                count--;
                temp /= 10;
            }
            System.out.println(sum % 11 == 0 ? "Legal ISBN" : "illegal ISBN");
        }
    }
}
