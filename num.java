
public class num {
   public int mid, value, upperLim, lowerLim = 0;
   public num(){
	   newPoint(1000);
   }
   public void newPoint(int l){
	   value = (int) (Math.random()*(l));
	   upperLim = l;
	   lowerLim = 0;
   }
   public void upperLim(int u){
	   upperLim = u;
   }
   public void lowerLim(int u){
	   lowerLim = u;
   }
   public int range(){
	   return upperLim - lowerLim;
   }
   public int mid(){
	   return (int)(0.5*this.range());
   }
}
