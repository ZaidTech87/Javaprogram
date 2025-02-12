import java.util.Scanner;
public class QuoRem{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("divident :  ");
int D = sc.nextInt();
System.out.println("divisor :  ");
int d= sc.nextInt();
int rem = D%d;
int quo = D/d;
System.out.println("The value of Remender:  "+rem);
System.out.println("the value of Quotent: "+quo);
sc.close();
}
}