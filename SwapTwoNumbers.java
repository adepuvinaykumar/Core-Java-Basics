import java.util.*;
public class SwapTwoNumbers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st number: ");
    int a=sc.nextInt();
    System.err.println("enter 2nd number: ");
    int b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swapping: "+a+" "+b);
  }
}
