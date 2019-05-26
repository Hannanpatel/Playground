import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(square_of_numbers(n));
	}
	public static int square_of_numbers(int y)
	{
	    int sum = y*y;
	    return sum;
	}
} // End of Main class