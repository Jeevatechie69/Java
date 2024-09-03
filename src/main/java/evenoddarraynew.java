
public class evenoddarraynew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {99,88,00,33,55,77};
		System.out.println("even numbers are");
		for(int i=0;i<=a.length-1;i++) 
		{
			
			if(a[i]%2==0) {
				System.out.println(a[i]);
				
			}
		}
			System.out.println("odd numbers are");
			for(int j=0;j<=a.length-1;j++) 
			{
				
				if(a[j]%2!=0) {
					System.out.println(a[j]);
					
				}
			}
	}
			
		
	}

		
