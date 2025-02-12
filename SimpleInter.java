import java.util.Scanner;
public class SimpleInter{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter principal : ");
double p =  sc.nextDouble();
System.out.println("rate: ");
double r = sc.nextDouble();
System.out.println("time: ");
double t = sc.nextDouble();
double si = (p*r*t)/100;
System.out.println("Simple interest is : "+si);
sc.close();
}
}
