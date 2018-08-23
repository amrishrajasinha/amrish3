
public class Class1 
{
	
	int userinput = 51; //Global
	
	public static void main (String [] args ) 
	{
		
		Class1 t1 = new Class1 ();
		t1.test1();
		
	}
	
	public void test1 ()
	{
		
		int b=1; //local
		
		if (userinput >=50) 
		{
			System.out.println("User Input value is :" + userinput);
		} else 
		{
			System.out.println("below 50 the  print :" +b);
		 }
		
		
	}
	

}

