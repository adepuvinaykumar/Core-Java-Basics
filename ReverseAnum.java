import java.util.*;
public class ReverseAnum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number: ");
    int num=sc.nextInt();
    int rev=0,rem;
    while(num!=0){
      rem=num%10;
      num=num/10;
      rev=rev*10+rem;
    }
    System.out.println("reverse of the number is: "+rev);
  }
}
