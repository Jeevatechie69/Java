
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mention the string  ABCD
		//Find the length of the character
		//use the charat method concept
		//create for loop 
		//first i value should be  the char at value 3 
		//Print the i value 
		
		/*String name="ABCD";
		String rev="";
		
	int	length=name.length();
	System.out.println(length);
	
	for(int i=length-1;i>=0;i--) 
	{		
		
		rev=rev+name.charAt(i);
	}
		
		System.out.println(rev);

	}*/
		
		String name="Jeeva";
		String rev="";
		
		for(int i=4;i>=0;i--)
		{
			
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}
