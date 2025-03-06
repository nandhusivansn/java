class A{
    int a;int b;
    A(int x,int y)
    {
        a=x;
        b=y;
    }
    void display(){
        System.out.print(a);
        System.out.print(b);
    }
}
    class B extends A{
        int z;
        B(int x,int y,int z)
        {
            super(x,y);
            z=z;
            System.out.println(z);
        }
        void display(){
            super.display();
            
            System.out.print("this is a derived class display function");
            
        }
        public static void main(String[] args){
                B obj=new B(5,6,7);
                obj.display();
        }
    }

