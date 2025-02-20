public class shape {
    void area (int radius){
        System.out.print(3.14*radius*radius);
    }
    void area(int length,int breadth){
        System.out.print(length*breadth);
    }
    public static void main(String[] args){
        shape shape1=new shape();
        shape1.area(10);
        shape1.area(2,4);

    }
}