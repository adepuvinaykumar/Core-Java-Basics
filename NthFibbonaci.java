import java.util.*;
public class NthFibbonaci {
  public static void main(String[] args) {
    int t1=0,t2=1;
    System.out.print("Enter the nth fibonnaci number:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print("Fibonnaci series of "+n+" is:");
    for(int i=1;i<=n;i++){
      System.out.print(t1+" ");
      int sum=t1+t2;
      t1=t2;
      t2=sum;
    }
  }
}
