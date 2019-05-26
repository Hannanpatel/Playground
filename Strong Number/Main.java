import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      	int first,last,mid;
      	first = n/100;
      	last = n%10;
      	mid = ((n%100)/10);
      
      	int sum1 = 1;
       for(int i=1;i<=first;i++)
       {
         sum1 = sum1 * i; 
       }
      	int sum2 = 1;
       for(int i=1;i<=mid;i++)
       {
         sum2 = sum2 * i; 
       }
      	int sum3 = 1;
       for(int i=1;i<=last;i++)
       {
         sum3 = sum3 * i; 
       }
      	int sum = sum1 + sum2 + sum3;
      if(n==sum)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}