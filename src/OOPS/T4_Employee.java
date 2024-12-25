package OOPS;

import java.util.Scanner;

public class T4_Employee {
    String name;
    int salary;

    // constructor
    T4_Employee(int salary, String name){
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "T4_Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        // declaring array of obj
        T4_Employee[] arr = new T4_Employee[size];

        for (int i = 0; i<size;i++){
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter salary: ");
            int salary = sc.nextInt();
            arr[i] = new T4_Employee(salary,name);

        }

        for (T4_Employee emp : arr){
            System.out.println(emp);
        }

    }

}
