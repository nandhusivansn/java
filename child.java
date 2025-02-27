public class parent
{
   
    parent()
    { System.out.println("Parent Class");}

}
public class child extends parent
{
    child(){
    System.out.println("child Class");
    }
}


public class t1{
    public static void main(String[] args){
    child c1=new child();
}
}
