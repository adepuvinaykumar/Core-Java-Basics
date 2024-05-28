import java.util.*;;
public class MaxAmongThree {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st number a:");
		int a=sc.nextInt();
    System.out.println("enter 2nd number b:");
    int b=sc.nextInt();
    System.out.println("enter 3rd number c:");
    int c=sc.nextInt();
    sc.close();
		int max= (a>b)?a:b;
	    if(max>c){
	        System.out.println(max +" is the max number among three");
	    }
	        else{
	            System.out.println(c +" is the max Number among three");
	        }
	    
		
	}
}

