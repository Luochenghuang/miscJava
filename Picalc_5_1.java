public class Picalc_5_1 {
    public static void main(String[] args){
        System.out.println("How many digits of Pi do you want to calculate? (>4)");
        int n = TextIO.getInt()/4;
  	    TextIO.writeUserSelectedFile();
        int j = (int)((Math.floor(10*((double)n)/3))*4+1);
        int[] A = new int[j];
        int[] Pi = new int[n];
        int q;
        int r;
        long time = System.nanoTime();
        for(int i = 0; i <j; i++ ){ 
            A[i] = 2000;
        }//initialization of the array A
        for(int i2 = 0; i2 < n; i2++){       //repeat for n times
          for(int i = 0; i <j; i++ ){
              A[i] *= 10000; 
          }
          for(int i = j ; i > 1; i-- ){
              q = A[i-1]/(2*i - 1);
              r = A[i-1]%(2*i - 1);
           A[i-1] = r;
           A[i-2] += q*(i - 1);
          }
          Pi[i2] = A[0]/10000;
          A[0] %= 10000;
        }
          for(int i = Pi.length-1; i >= 1; i--){
        	  if(Pi[i] >=  10000){
        		  Pi[i] %= 10000;
        		  Pi[i-1] += Pi[i]/10000;
        	  }
          }
          int group = 0;
    	  time = System.nanoTime()-time;
    	  double seconds = (double)time/(1000000000.0);
    	  

    	  TextIO.putln("Picalc verson 5.1");
    	  TextIO.putln();
    	  TextIO.putln("Author : Luocheng Huang");
    	  TextIO.putln();
    	  TextIO.putln("Date : Jan 14 2012");
    	  TextIO.putln();
    	  TextIO.putln(4*n+" digits of Pi are generated");
    	  TextIO.putln();
    	  TextIO.putln("the calculation took "+seconds+" seconds");
    	  TextIO.putln();
    	  TextIO.putln();

          for(int i = 0; i < Pi.length; i++){
        	  if (group == 20){
                  TextIO.putln();
                  TextIO.putln();
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
    }
    private static void print(int digits){
    	int d = (int)Math.log10(digits) + 1;
    	switch(d){
    	case 1:TextIO.put("000"+digits+" "); break;
    	case 2:TextIO.put("00"+digits+" "); break;
    	case 3:TextIO.put("0"+digits+" "); break;
    	case 4:TextIO.put(""+digits+" "); break;
    	}
    }
}