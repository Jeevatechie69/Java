
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two types of initiating string
    //String s="welcome";
    
    String s1=new String("Jeeva");
    		
     //Methods in string
    //To find the length
    	int len=s1.length();
    	System.out.println(len);
    	System.out.println("Jeeva".length());
    	
    //concat in string
    	String a1="Welcome";
    	String a2="To Theni";
    	String a3="jeeva";
    	
    	System.out.println(a1+a2);
    	System.out.println(a1.concat(a2));
    	System.out.println(a1.concat(a2).concat(a3));
    	
   //trim() remove spaces right and left side
    	String b1="    jeeva     ";
    	
    	System.out.println(b1.trim());
    //charAt()It return specific character from the string based on the index
    	String b2="jeeva";
    	
    	System.out.println(b2.charAt(0));
    	
    //contains will check particular string is present or not.It is case sensitive
    	String b3="jeeva";
    System.out.println(b3.contains("jee"));
    System.out.println(a2.contains("Theni"));
    
    //equals equalIgnoreCase()-compare strings
    String c1="jeeva";
    String c2="Jeeva";
    String c3="jeeva";
    
    System.out.println(c1.equals(c3));
    System.out.println(c1.equalsIgnoreCase(c2));

	//replace()-replace single/multiple(sequence of characters in a string)
	String d1="Welcome Jeeva";
	System.out.println(d1.replace('e', 'a'));
	System.out.println(d1.replace("Welcome", "Hi"));
	
	//substring() extract substring from mainstring
	//ending index will be+1
	String p1="Welcome Jeeva";
	
	System.out.println(p1.substring(0,3));
	
	//toUpperCase() toLowerCase()
	p1="Welcome";
	System.out.println(p1.toUpperCase());
	System.out.println(p1.toLowerCase());
	
	//split()-split the string into multiple parts based on delimeter
	
	String l1="jeeva369@gmail.com";
	String a[]=l1.split("@");
	System.out.println(a[0]);//It should be stored in single dimensional array now both the string will stored in the array
	System.out.println(a[1]);//
	
	
	//ex1 by 
	String amount="$11,11,1";
	
	System.out.println(amount.replace("$",""));
	System.out.println(amount.replace("$","").replace(",",""));
	
	
	}

	
}
