import java.util.Scanner;
public class Chapter2Test {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter two numbers: ");
    double numberone = scan.nextDouble();
    double numbertwo = scan.nextDouble();

    System.out.println("The average is " + (numberone + numbertwo) / 2);


  
  }
}