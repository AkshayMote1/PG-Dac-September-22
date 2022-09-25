class Pat5{
public static void main(String args[]){

   for(int i=1;i<=5;i++)
   {
    
	for(int j=4;j>=i;j--)
	{
	  System.out.print(" ");
	}
	
	for(int j=1;i>=j;j++)
	{
	  System.out.print("*");
	}
	
	for(int j=2;i>=j;j++)
	{
	  System.out.print("*");
	}
     System.out.println(" ");
   }

}

}