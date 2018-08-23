
public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 1289;
		int reverse =0, reminder;
		
		for ( int i=1;i<=4;i++)
		{
			reminder = number %10;
			reverse = reverse *10 + reminder;
			number = number/10;
		}

		System.out.println(reverse);
	}

}
