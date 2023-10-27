
class A{
    void getA(){
        System.out.println("A method");
    }
}
class B extends A{
    void getA(){
        System.out.println("B method");
    }
    void getB(){
        System.out.println("B b method");
    }
}
public class InheritanceEx {
    public static void main(String args[]){
        B b=new B();
        b.getA();
    }
}
