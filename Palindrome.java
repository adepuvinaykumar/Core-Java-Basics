import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number: ");
  
   int num=sc.nextInt();
    int rev=0,rem,temp=num;
    while(num!=0){
      rem=num%10;
      num=num/10;
      rev=rev*10+rem;
    }
   if (temp == rev) {
    System.out.println("given number is a palindrome");
   }
   else {
    System.out.println("it is not a palindrome");
   }
  }
}
