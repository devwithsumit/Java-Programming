package IF_Else;

public class Q0_GradeCalculator {
    public static void main(String[] args) {
        int maths = 33, english = 33, hindi = 33, science = 33;
        double percentage  = (double) (maths + english + hindi + science)/4;
        if(percentage > 90)
            System.out.println("A+");
        else if(percentage >= 80)
            System.out.println("A");
        else if(percentage >= 70)
            System.out.println("B+");
        else if(percentage >= 60)
            System.out.println("B");
        else if(percentage >= 50)
            System.out.println("C");
        else if(percentage >= 40)
            System.out.println("D");
        else if(percentage >= 33)
            System.out.println("E");
        else
            System.out.println("FAIL");
        System.out.println(percentage);
    }
}
