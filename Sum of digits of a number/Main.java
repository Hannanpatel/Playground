import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp=0;
      while(n>0)
      {
        int rem = n%10;
         temp = temp + rem;
        n = n/10;
      }
      System.out.print(temp);
	}
}