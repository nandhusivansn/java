import java.util.*;
public class arraysample{
    public static void main(String[] args){
        int arr[]=new int[10];
        for(int i=0;i<5;i++){
            Scanner scanner=new Scanner(System.in);
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("array is ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
}