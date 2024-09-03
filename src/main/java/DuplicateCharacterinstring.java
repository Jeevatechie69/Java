
public class DuplicateCharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="JeevaaJ";
		char[] c=s.toCharArray();
	  Boolean flag=true;
		
		for(int i=0;i<=c.length-1;i++)
		{
			
			for(int j=i+1;j<=c.length-1;j++)
			{
				if(c[i]==c[j]) {
					System.out.println("Duplicate character found   "+c[j]);
					flag=true;
					break;
					
				}
				if(flag==false) {
					
					System.out.println("Duplicate character not found");
					break;
				}
				
			}
		}*/
		
		String a="Jeeva";
		
		
		for(int i=0;i<=a.length()-1;i++) {
			
		char ch=a.charAt(i);
		switch (ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':	
		case 'u':
			
			System.out.println(ch);
		
		
		}
				
				
			
		}

	}

}
