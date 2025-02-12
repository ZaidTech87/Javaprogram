import java.util.Scanner;
public class ComInter{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter principal : ");
double p =  sc.nextDouble();
System.out.println("rate: ");
double r = sc.nextDouble();
System.out.println("time: ");
double t = sc.nextDouble();
double cp =p*(Math.pow(1+(r/100), t));
System.out.println("Compound Interest: "+cp);
sc.close();
}
}
