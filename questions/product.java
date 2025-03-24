public class product
{
    int pcode;
    String pname;
    int price;
    product(int pcode, String pname,int price)
    {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }

}
class p1
{
    public static void main(String[] args) {
        product p1=new product(111,"Car",1200);
        product p2=new product(222,"Bike",800);
        product p3=new product(333,"Bus",3300);
        if(p1.price<p2.price && p1.price<p3.price)
        {
            System.out.println("Cheapest is "+p1.pname);
        }
        else if(p2.price<p3.price && p2.price<p1.price)
        {
            System.out.println("Cheapest is "+p2.pname);
        }
        else
        {
            System.out.println("Cheapest is "+p3.pname);
        }
    }
}