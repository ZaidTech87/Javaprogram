import java.util.Scanner;
public class countnum {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number ");
     int n=sc.nextInt();
     int count=0;
     while(n>0){
        n/=10;
        count++;
     }
     
     System.out.println("number of digit"+count);
     }
    
}
