public class Reverse {
  public static void main(String[] args) {
    int num=123,rev=0,rem;
  while(num>0){
    rem=num%10;
    num=num/10;
    rev=10*rev+rem;
  }
  System.out.println(rev);
  }
 
}
