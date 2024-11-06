import java.util.Scanner;

public class sort2 {
    static void sortArray(int []arr){
        int n=arr.length;
        int x=-1; int y=-1;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;

                }
            }
        }
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter" +n+ "element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr);
        System.out.println("shorted array:  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
