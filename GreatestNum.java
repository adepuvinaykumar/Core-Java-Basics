import java.util.*;
public class GreatestNum {
  public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter 1 st num: ");
  int a=sc.nextInt();
  System.out.println("Enter 2 st num: ");
  int b=sc.nextInt();
  if(a>b){
    System.out.println(a +"is maximum");
  }
  else {
    System.out.println(b +"is maximum");
  }
  }
}
