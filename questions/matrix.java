import java.util.Scanner;
public class matrix {
    int m,n;
    int[][] mt;
    Scanner sc=new Scanner(System.in);
    matrix(int m,int n)
    {
        this.m=m;
        this.n=n;
        mt = new int[m][n]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mt[i][j] = sc.nextInt();
            }
        } 
    }
}
class m1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size: ");
        int m=sc.nextInt();
        System.out.println("Enter column size: ");
        int n=sc.nextInt();
        
        System.out.println("Enter first matrix: ");
        matrix m1=new matrix(m, n);
        
        System.out.println("Enter second matrix: ");
        matrix m2=new matrix(m, n);
        System.out.println("Enter 1 for add, 2 for mult");
        int x =sc.nextInt();
        switch (x) 
        {
            case 1:
                addMat(m1, m2);
                break;
            case 2:
                multMat(m1, m2);
                break;
            default:
                break;
        }
    }
    static void dispMat(matrix m)
    {
        for (int i = 0; i < m.m; i++) 
        {
            for (int j = 0; j < m.n; j++) 
            {
                System.out.print(m.mt[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void addMat(matrix a1,matrix a2)
    {
        for (int i = 0; i < a1.m; i++) 
        {
            for (int j = 0; j < a1.n; j++) 
            {
                System.out.print(a1.mt[i][j]+a2.mt[i][j]+"\t");
            }
        }
        System.out.println("\n");
    }
    static void multMat(matrix a1,matrix a2)
    {
        int C[][] = new int[a1.m][a1.n];

        // Multiply the two matrices
        for (int i = 0; i < a1.m; i++) {
            for (int j = 0; j < a1.n; j++) {
                for (int k = 0; k < a1.m; k++)
                    C[i][j] += a1.mt[i][k] * a2.mt[k][j];
            }
        }
        for (int i = 0; i < a1.m; i++) 
        {
            for (int j = 0; j < a1.n; j++) 
            {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
