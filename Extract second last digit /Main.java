import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first= n%100;
      int last= first/10;
      System.out.println(last);
      
	}
}