import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);	
	//This will accept the value from the user at runtime
      System.out.println("Enter a number");
      //1.Using algorithm
      
    int num=sc.nextInt();
    //To accept the value from the user using scanner object to accept the value from the user
     /* int rev=0;
    
     
      while(num!=0) {
    	  rev=rev*10+num%10;
    	  
    	  num=num/10;
    	  
    			  
      }
     
      System.out.println("Reverse number is:"+rev);
     */
//Using String buffer class
   /* StringBuffer sb=new StringBuffer(String.valueOf(num));
    //String.value of method will convert into string format
    StringBuffer rev=sb.reverse();
      
    System.out.println("Reverse number is:"+rev);*/
    
    //Using StringBuilderClass
    
    StringBuilder sb1=new StringBuilder();
    sb1.append(num);
    //to get the number an store it in sb1 variable
    StringBuilder rev=sb1.reverse();
    System.out.println("Reverse number is:"+rev);
      
   
      
	}

}
