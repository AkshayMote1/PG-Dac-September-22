class Pat16{

public static void main(String args[]){
	
    for(int i=1;i<=5;i++)
	{
		for (int j =1; j <= 5-i; j++)
			{
				System.out.print(" ");
			}	
				
		for(int j=0;j<i;j++)
	    {			
			if (i != 5)
			{
				if (j == 0 || j == i-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}       
			else
				{
        
				System.out.print("*");
				}
		}		
		System.out.println();	
	}	
}
}