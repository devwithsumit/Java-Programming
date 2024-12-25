package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class T3Q4_StudentManagement {
    public static class Student{
        int studentId;
        String name;
        int age;
        String grade;
        HashMap<String, Integer> marks = new HashMap<>();
        double percentage;
        void accept() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter student id: ");
            studentId = Integer.parseInt(br.readLine());
            System.out.println("Enter name: ");
            name = br.readLine();
            System.out.println("Enter age: ");
            age = Integer.parseInt(br.readLine());
            System.out.println("Enter grade: ");
            grade = br.readLine();
            System.out.println("Enter marks of Maths: ");
            int mathsMarks = Integer.parseInt(br.readLine());
            System.out.println("Enter marks of English: ");
            int englishMarks = Integer.parseInt(br.readLine());
            System.out.println("Enter marks of Science: ");
            int scienceMarks = Integer.parseInt(br.readLine());
            marks.put("Maths: ", mathsMarks);
            marks.put("English: ", englishMarks);
            marks.put("Science: ", scienceMarks);
        }

        void calculate(){
            int sum = 0;
            int noOfSubs = 0;
            for (Map.Entry<String, Integer> e: marks.entrySet()){
                sum += e.getValue();
                noOfSubs++;
            }
            percentage = (double) sum /noOfSubs;
        }
        void display(){
            System.out.println("T2_Student Id: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
            System.out.println("Marks :-");
            for(var e: marks.entrySet()){
                System.out.println(e.getKey() + ": " + e.getValue());
            }
            System.out.printf("percentage: %.2f", percentage);
        }
    }
    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        s1.accept();
        s1.calculate();
        s1.display();
    }
}
