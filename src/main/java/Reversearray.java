import java.util.Arrays;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declare array
		//swapping i and j by using the index
		
		int a[]= {10,80,90,78,90};
		
		int i=0;
		int j=a.length-1;
		int temp;
		
		while(i<j) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
			
		}
		System.out.println(Arrays.toString(a));
		

}
}