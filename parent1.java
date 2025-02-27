public   class parent1{
    int l,b;
    parent1(int x,int y){
        
        l=x;
        b=y;
        
    }
    void area(){
        System.out.println("area is "+l*b);
    }
    
}
class child1 extends parent1{
        int h;
        child1(int m,int n,int z){
            super(m,n);
            
            h=z;
            System.out.println(h);

        }
        void vol(){

            System.out.println("Volume is "+l*b*h);
    
        }
        public static void main(String[] args){
            child1 c = new child1(2,3,5);
            c.area();
            c.vol();
            
        }

    }
    
