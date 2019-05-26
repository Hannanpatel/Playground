import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = sc.nextInt();
    }
    print_perf_batch(list, n);
	}

	public static void print_perf_batch(int list[], int n)
	{
		  int p1=0;
		  for(int index = 0; index <= (n-1); index++)
		  {
		    p1=list[0]+list[1]+list[2];;
		  }
		  // Print even position elements
      	int p2=0;
		  for(int index = 0; index <= (n-1); index++)
		  {
		   p2=list[3]+list[4]+list[5];
		  }
      if(p1==p2)
      {
        System.out.print("Perfect Batch");
      }
      else
      {
        System.out.print("Not a Perfect Batch");
      }
	}
} 