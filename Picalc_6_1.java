public class Picalc_6_1 {
    public static void main(String[] args){
        System.out.println("How many digits of Pi do you want to calculate?");
        int n = TextIO.getInt()/9+1;
  	    TextIO.writeUserSelectedFile();
        int j = (int)((Math.floor(10*((double)n)/3))*9+1);
        long[] A = new long[j];
        long[] Pi = new long[n];
        long q;
        long r;
        long time = System.nanoTime();
        for(int i = 0; i <j; i++ ){ 
            A[i] = 200000000;
        }//initialization of the array A
        for(int i2 = 0; i2 < n; i2++){       //repeat for n times
          for(int i = 0; i <j; i++ ){
              A[i] *= (1000000000); 
          }
          for(int i = j ; i > 1; i-- ){
              q = A[i-1]/(2*i - 1);
              r = A[i-1]%(2*i - 1);
           A[i-1] = r;
           A[i-2] += q*(i - 1);
          }
          Pi[i2] = A[0]/(1000000000);
          A[0]  %=      (1000000000);
        }
          for(int i = Pi.length-1; i >= 1; i--){
        	  if(Pi[i]   >=       (1000000000)){
        		 Pi[i]   %=       (1000000000);
        	     Pi[i-1] += Pi[i]/(1000000000);
        	  }
          }
          int group = 0;
    	  time = System.nanoTime()-time;
    	  double seconds = (double)time/(1000000000.0);
    	  

    	  TextIO.putln("Picalc verson 6.1");
    	  TextIO.putln();
    	  TextIO.putln("Author : Luocheng Huang");
    	  TextIO.putln();
    	  TextIO.putln("Date : Jan 14 2012");
    	  TextIO.putln();
    	  TextIO.putln(9*n+" digits of Pi are generated");
    	  TextIO.putln();
    	  TextIO.putln("the calculation took "+seconds+" seconds");
    	  TextIO.putln();
    	  TextIO.putln();

    	  
    	  System.out.println("the calculation took "+seconds+" seconds");
          System.out.println();
    	  
          for(int i = 0; i < Pi.length; i++){
        	  if (group == 10){
                  System.out.println();
                  System.out.println();
                  group = 0;
        	  }
              print(Pi[i]);
              group++;
          }

          TextIO.putln();
          TextIO.writeStandardOutput();
          System.out.println("Done");
    	  TextIO.putln("the calculation took "+seconds+" seconds");
          System.out.println();
          System.out.println();
          System.out.println();
    }
    private static void print(long digits){
    	int d = (int)Math.log10(digits) + 1;
    	int zeros = 9-d;
    	for(int i = 0; i < zeros; i++){
    		TextIO.put("0");
    	}
		System.out.print(digits+" ");
    }
}