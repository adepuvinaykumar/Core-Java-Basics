public class Fibonnaci {
  public static void main(String[] args) {
    int a=0,b=1,c, count=5;
    System.err.println(a);
    System.out.println(b);
    for(int i=1;i<=count;i++){
      c=a+b;
      a=b;
      b=c;
      System.out.println(c);
  }
    }
    
}
