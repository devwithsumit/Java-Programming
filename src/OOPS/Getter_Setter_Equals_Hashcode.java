package OOPS;

import java.util.Arrays;
import java.util.Objects;



public class Getter_Setter_Equals_Hashcode {
    static class Demo {
        private String name;
        int age;

        //constructor
        public Demo(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //getter for age
        public int getAge() {
            return age;
        }
        //setter for age
        public void setAge(int age) {
            this.age = age;
        }
        //getter for name
        public String getName() {
            return name;
        }
        //setter for name
        public void setName(String name) {
            this.name = name;
        }

        //equals method
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Demo demo = (Demo) o;
            return age == demo.age && Objects.equals(name, demo.name);
        }

        // hashCode method
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
        // toString method
        @Override
        public String toString() {
            return STR."Demo{\n\tname: \{name},\n\tage: \{age},\n}";
        }
    }
    public static void main(String[] args) {
        Demo obj = new Demo("Sumit", 20);
        obj.setName("sumit");
        System.out.println(obj.getName());
        System.out.println(obj.hashCode());
    }
}
