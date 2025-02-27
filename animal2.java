public class animal2
{
    String color="red";

}
class animal1 extends animal2
{
    String color="orange";
    void colorDisp()
    {
        System.out.println(color);
        System.out.println(super.color);

    }
    public static void main(String[] args)
    {
        animal1 an1 = new animal1();
        an1.colorDisp();
        
    }
}
    