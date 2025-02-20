import java.util.*;
class rectangle {
    int l,b;
    void getvalues(int x,int y){
        l=x;
        b=y;
    }
    void area(int x,int y){
        l=x;
        b=y;
        int c;
        c=l*b;
        System.out.print("c="+c);
    }

    }
    class rectanglemain{
        public static void main(String[] args)
        {
            rectangle obj=new rectangle();
            Scanner sc=new Scanner(System.in);
            System.out.print("enter length and breadth ");
            int l=sc.nextInt();
            int b=sc.nextInt();
            obj.area(l,b);
            
        }

    }


