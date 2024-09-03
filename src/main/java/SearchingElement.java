import org.checkerframework.checker.units.qual.Length;

public class SearchingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Linear search or sequential search
		//Algorithm
		//Define the search value
		//1.Extract the value from the array and compare it
		
	/*	int a[]= {11,22,33,44,55};
		int search=33;
		boolean flag=false;//
		for(int i=1;i<a.length;i++)

		{
			if (a[i]==search) {
				System.out.println("Value found:"+search);
				flag=true;//as sson a i found this element making flag value as true
				break;
			}
			
		}
		if (flag==false) {
		System.out.println("value not found");
		}*/
		
		int a[]= {2,3,4,5};
		int search=0;
		boolean flag=false;
		for(int i=1;i<a.length;i++)
		{
			
			if(search==a[i]) {
				
				System.out.println("Value found");
				flag=true;
				break;
				
			}
			if(flag==false) {
				
				System.out.println("Value not found");
				break;
				
			}
		}
		

	}

}
