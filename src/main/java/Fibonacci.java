
public class Fibonacci {

	
	//Logic
	//n1=0;
	//n2=1;
	//n3=sum
		//The logic behind fibonacci series is n1+n2=n3
		//here the n1 is 1 n2 is 1 n3 will be 1
		//add the preceding numbers 0+1=1 1+1=2 1+2=3 2+3=5
	//Main logic is make n2 as n1 n3 as n2
			
	public static void main(String[] args) {
		
		/*int n1=0;
		int n2=1;
		int sum=0;
		
		
		
		
		 for (int i=2;i<10;i++)
		 {
			 sum=n1+n2;
			 //0+1=1 n1=0 n2=1 sum=1
			 System.out.println(sum);
			
			 n1=n2;
			 n2=sum;*/
			 
			//0 1  2  3   5  8   13  21
		
		int n1=0;
		int n2=1;
		
		int sum;
		
		for (int i=2;i<=5;i++)
		{
			
			sum=n1+n2;
			System.out.println(sum);
			
			n1=n2;
			n2=sum;
			
		}
		}
			
		
		
	

}
