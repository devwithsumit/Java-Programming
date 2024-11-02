package Loops;

public class Q42_Switch {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("MON");
            case 2 -> System.out.println("TUE");
            case 3 -> System.out.println("WED");
            case 4 -> System.out.println("THURS");
            case 5 -> System.out.println("FRI");
            case 6 -> System.out.println("SAT");
            default -> System.out.println("Invalid Input");
        }
//        Alternate Method
//        String ans = switch(day){
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
//            default -> "Invalid Input";
//        };
//        System.out.println(ans);
    }
}
