import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");

int num=sc.nextInt();

//algorithm
//reverse a given number and check whether reversed number with orginal number it is palindrome or not 

/*int rev=0;
int orgnum=num;
while(num!=0) {
	rev=rev*10+num%10;   //0*10+1234%10=4    //40+3=43      //430+2=432  //4320+1=4321
	num=num/10;         //1234/10=123        //123/10=12    //12/10=1      /1/10=0

	}
System.out.println(rev);
	
if(orgnum==rev) {
	System.out.println("Given number is palindrome");
	
}
else {
	System.out.println("Given number is not palindrome");
}
	}*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int rev=0;
		int orgnum=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(orgnum==rev)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
		}
	
}
	
	
