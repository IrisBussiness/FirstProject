package src;

class A{
    void getA(){
        System.out.println("src.A method");
    }
}
class B extends A{
    void getA(){
        System.out.println("src.B method");
    }
    void getB(){
        System.out.println("src.B b method");
    }
}
public class InheritanceEx {
    public static void main(String args[]){
        B b=new B();
        b.getA();
    }
}
