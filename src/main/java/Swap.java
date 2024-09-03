
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Logic1 third variable
		/*int a=10;
		int b=20;
		
		/*int t=a;//t value is 10 
		a=b;  //a value is 20
		b=t;  //b value is 10
		System.out.println("After swapping values are"+a+"    "+b);
		*/
		/*//Logic2 without using third variable
		int a=10;
		int b=20;
		a=a+b; //10+20=30
		b=a-b;  //30-20=10
		a=a-b;  //20-10=20
		
		System.out.println("After swapping values are"+a+"    "+b);*/
		
		int a=10;
		int b=20;
		int t;
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping"+a+"  "+ b);
	
		
		

	}

}
