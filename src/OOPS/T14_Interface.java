package OOPS;

interface A {
    int a = 0;
    void print();
}

interface B{
    void print();
}
class C{
    void print(){
        System.out.println("Hello C");
    }
}
public class T14_Interface extends C implements A, B {
    @Override
    public void print() {
        System.out.println("Hello T14");
    }

    public static void main(String[] args) {
        T14_Interface obj = new  T14_Interface();
        obj.print();
    }
}
