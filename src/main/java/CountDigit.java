
public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Algorithm
//We need to divide the value by 10 and increase the count till it become 0
		
		/*int num=124567;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
				
	}*/
		//to count the digit we need to divide by 10 and increase the count
		int num=234568;
		int count=0;
		
		while(num>0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);
		
		
	}
}
