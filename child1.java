class Base{
    Base()
    {
        System.out.println("Base class consc");
    }
    void disp(){
        System.out.println("Base class display");

    }
}
public class child1 extends Base{
    int x;
    child1()
    {
        System.out.println("child class consc");
    }
    void disp(int m){
        x=m;
        System.out.println("Value is "+x);

    }
    public static void main(String[] args){
        child1 obj=new child1();
        obj.disp();
        obj.disp(2);
    }
}