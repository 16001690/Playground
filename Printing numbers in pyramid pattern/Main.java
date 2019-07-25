import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
      int val=1;
	    for(int pre_row = 1; pre_row <= n; pre_row++)
	    {
	        for(int space = 1; space <=(n - pre_row); space++)
	        {
	            System.out.print(" ");
	        }
	        for(int pre_col = 1; pre_col <=  pre_row; pre_col++)
	        {
               System.out.print(val+" ");
              val++;
            }
           System.out.println();
    }    
}
}