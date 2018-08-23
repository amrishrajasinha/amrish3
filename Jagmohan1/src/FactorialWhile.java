
public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5 , fact=1, i=1;
		
        while(i<= number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of 5 is: "+fact);
	}

}
