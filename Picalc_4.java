public class Picalc_4 {
    public static void main(String[] args){
        System.out.println("How many digits of Pi do you want to calculate?");
        int n = TextIO.getInt();
  	    TextIO.writeUserSelectedFile();
        int j = (int)(Math.floor(10*((double)n)/3)+1);
        int[] A = new int[j];
        int[] Pi = new int[n];
        int q;
        int r;
        long time = System.nanoTime();
        for(int i = 0; i <j; i++ ){ 
            A[i] = 2;
        }//initialization of the array A
        for(int i2 = 0; i2 < n; i2++){       //repeat for n times
          for(int i = 0; i <j; i++ ){
              A[i] *= 10; 
          }
          for(int i = j ; i > 1; i-- ){
              q = A[i-1]/(2*i - 1);
              r = A[i-1]%(2*i - 1);
           A[i-1] = r;
           A[i-2] += q*(i - 1);
          }
          Pi[i2] = A[0]/10;
          A[0] %= 10;
        }
          for(int i = Pi.length-1; i >= 1; i--){
        	  if(Pi[i] >=  10){
        		  Pi[i] %= 10;
        		  Pi[i-1] += 1;
        	  }
          }
          int group = 0;
          int line = 0;
    	  time = System.nanoTime()-time;
    	  double seconds = (double)time/(1000000000.0);

    	  TextIO.putln("Picalc verson 4.0");
    	  TextIO.putln();
    	  TextIO.putln("Author : Luocheng Huang");
    	  TextIO.putln();
    	  TextIO.putln("Date : Jan 13 2012");
    	  TextIO.putln();
    	  TextIO.putln(n+" digits of Pi are generated");
    	  TextIO.putln();
    	  TextIO.putln("the calculation took "+seconds+" seconds");
    	  TextIO.putln();
    	  
          for(int i = 0; i < Pi.length; i++){
        	  if (group == 4){
        		  TextIO.put(" ");
                  group = 0;
                  line++;
        	  }
        	  if (line == 20){
        		  TextIO.putln();
        		  TextIO.putln();
                  line = 0;
        	  }
        	  TextIO.put(Pi[i]);
              group++;
          }
          TextIO.putln();
          TextIO.writeStandardOutput();
          System.out.println("Done");
    	  TextIO.putln("the calculation took "+seconds+" seconds");
    }
}