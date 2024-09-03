import java.util.Arrays;
import java.util.Collections;

public class SortAscendingbuiltin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {10,67,98,34,16};
  
      Arrays.sort(a);
      System.out.println("Ascending order "+Arrays.toString(a));
      
      
      Integer b[]={10,67,98,34,16};
      Arrays.sort(b,Collections.reverseOrder());
      System.out.println("Descending order  "+Arrays.toString(b));
      
      
	}

}
