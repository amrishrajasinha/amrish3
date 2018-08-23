
public class FactorialDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 4 , fact=1, i=1;
		do {
			fact = fact * i;
            i++;
		}
		
        while(i<=number);
       
        System.out.println("Factorial of 4 is: "+fact);
	}

}
