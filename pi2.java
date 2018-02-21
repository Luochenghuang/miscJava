import java.util.Scanner;

public class pi2 

{
	
    public static void main(String[]args) 
    {
    	
    Scanner Reader = new Scanner(System.in);
    double input = 1;
    do{
    System.out.print("Enter the number of iterations:");
    input = Reader.nextInt();
    double output = 0.0;
    boolean positive = true;
    for (int i=0; i<input; i++) { 
       double contribution = 1.0/(2.0*((double)i) + 1.0);
       if (positive) 
          output += contribution;
       else 
          output -= contribution;
       positive = !positive;
    }
    System.out.println("Pi is "+output*4.0);
    }
    	while(input!=0);
    }

}