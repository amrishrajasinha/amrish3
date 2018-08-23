
public class Class2 {

	
	int i = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class2 w = new Class2 ();
		w.week();

	}
	
	
	void week ()
	{
		if (i < 8)
		{
		
		    if (i == 1) {
			System.out.println("Today is Monday");
		    }else if (i==2) 
			{
			System.out.println("Today is tuesday"); 
			}else if (i==3) 
			{
				System.out.println("Today is wed");
			}else if (i==4) 
			{
				System.out.println("Today is thurs");
			}else if (i==5) 
			{
				System.out.println("Today is friday");
			}else if (i==6) 
			{
				System.out.println("Today is saturday");
			}else if (i ==7)
			{
				System.out.println("Today Is sunday ");
			}
			
		} else 
			System.out.println("you enter wrong number :");
		}
	

}