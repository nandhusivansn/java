public class parnt
{
   
    parnt()
    { System.out.println("Parent Class");}

}
public class chld extends parent
{
    chld(){
    System.out.println("child Class");
    }
}


public class t1{
    public static void main(String[] args){
    child c1=new child();
}
}
