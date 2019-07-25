import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        for (int present_row=1;present_row<=n;present_row++)
        {
           for (int present_col=1;present_col<=present_row;present_col++)
           {
             System.out.print(present_row);
           }
           System.out.println();
        }
        }
}
	