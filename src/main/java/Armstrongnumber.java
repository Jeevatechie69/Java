
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153
		//1*1*1+5*5*5+3*3*3=1+125+27=153
		
		int n=153;
	int temp=n;// we are performing operation on n so we don't want to loose the orginal value  temp=n
		int sum=0;
		int r;
		
		
		
		
		while(n>0)
		{
			
		r=n%10;
		n=n/10;
			sum=sum+ r*r*r;
			
			
		}
		if(temp == sum) {
			
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not an armstrong number");
		}
		}

	

}
