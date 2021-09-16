package exercise12;

import java.util.Scanner;

class SimpleDimple
{
    double p;
    double r;
    int y;

    public void scn()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        this.p = sc.nextDouble();

        System.out.print("Rate of Interest: ");
        this.r = sc.nextDouble();

        System.out.print("Number of Years: ");
        this.y = sc.nextInt();
    }
    public void prt()
    {
        int w = (int)Math.round(p * (1 + r * y * 0.01));

        System.out.println("After "+ y +" years at "+ r +"%, the investment will be worth $"+ w);

    }
}
public class solution12 {
    public static void main(String[] args) {

        SimpleDimple ca = new SimpleDimple();
        ca.scn();
        ca.prt();


    }
}
/* psuedocode: import the canner function. create class called simpledimple. inside of said
class declare the doubles for principal and interest rate as well as the int for number of
years. after that two public voids are made, one is scn which reads in everything to user
puts, and then prt which does the calculation for the simple interest and then prints the
statement. finally, the main body calls these two functions to run the code.
 */