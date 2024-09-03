import java.util.Arrays;

import org.checkerframework.checker.units.qual.Length;

public class FirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String a="Jeeva";
		char find='J';
		Boolean flag;
		
		for(int i=0;i<=a.length()-1;i++) {
			
			char c=a.charAt(i);
			if(c==find) {
				
				System.out.println("Character found  "+c);
				break;
			}
			if(flag=false) {
				
				System.out.println("Character not found");
				break;
			}
		}*/
		
		int a[]= {10,20,30,60};
		
		int find=10;
		Boolean flag;
		String ch=Arrays.toString(a);
		for(int i=0;i<=a.length-1;i++) {
			
			
			char c1=ch.charAt(i);
		
			if(c1==find) {
				
				System.out.println();
				break;
			}
			if(flag=false) {
				System.out.println("Not found");
			}
			
		}
		
		
		

	}

}
