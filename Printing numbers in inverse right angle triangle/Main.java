import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
      int val=n;
	    for(int pre_row = 1; pre_row <= n; pre_row++)
	    {
	        for(int pre_col = val; pre_col >= 1; pre_col--)
	        {
	            System.out.print(pre_col);
            }
          val--;
          System.out.println();
         }
	   }
}