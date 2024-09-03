
public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Enter the string
		//Find is there any duplicate or not
		//{Kohli,Neymar,Ronaldo,Hardik,Kohli}
		//take one string and compare with all
		//Use for loop
		//Take two elements i and j compare i and j are same or not
		
		/*String[] players={"Kohli","Neymar","Ronaldo","Hardik","Kohli"};
		
		boolean flag=true;
		
		for(int i=0;i<=players.length;i++)
		{
			
			for(int j=i+1;j<=players.length;j++)
			{
				
				if(players[i]==players[j])
				{
					System.out.println("Duplicate"+players[i]);
					flag=true;
					
				}
				
				
				if(flag=false)
				{
					System.out.println("no duplicate");
				}
		}
		}
	}
	/	String[] players={"Kohli","Neymar","Ronaldo","Hardik","Kohli"};
		boolean flag=false;
		for(int i=0;i<=players.length-1;i++)
		{
			for(int j=i+1;j<=players.length-1;j++)
				
				if(players[i]==players[j]) {
					System.out.println("Duplicate"   +  players[i]);
					flag=true;
					break;
				}
			if(flag==false)
				 {
					System.out.println("Not duplicate");
					break;
				}
		}*/
		
		String[] players= {"Jeeva","Hardik","Japan","Rahul","Kohli","Kohli"};
		
		
		boolean flag=true;
		for(int i=0;i<=players.length-1;i++) {
			
			for(int j=i+1;j<=players.length-1;j++) {
				
				if(players[i]==players[j]) {
					
					System.out.println("It is duplicate:  "  +players[i]);
					flag=true;
					break;
			}
				if(players[i]!=players[j]) {
					
					System.out.println("It is not duplicate");
					break;
					
					
				}
			
		}
		}
		
		
		
		
	}
}
