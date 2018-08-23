
public class StrickWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 5, i = 1, j = 1;

        while(i <= rows)
        {
            while(j <= i)
            {
                System.out.print("*");
                j++;

            }
            System.out.print("\n");
            i++;
            j=1;

        }
		

	}

}
