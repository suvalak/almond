package FloodSim;

public class TimeManager {
	final int HOURTIME= 60; // minute 
	final int DURATION = 24; // 1 day is 12 hour - no need to simulate night time
	final int WEEKDURATION = 7; // 1 day = 12 hour, 1 week = 7 day =  7 * 12

	public int currentHour(int currentStep ){
        int h = 1;
        int t = (currentStep) %HOURTIME;
        int m = (currentStep - (t)) / HOURTIME;
        
       if(m <= DURATION){
           h = m;
        }
       
       else h = m % DURATION;
       
       return h;
   }

    public int currentDayInWeek(int currentStep){
        
        int t = currentStep  % (HOURTIME * DURATION);
        int da =   (currentStep  - (t))/(HOURTIME * DURATION);
        int w =0;
        if(da <= WEEKDURATION){
         w =da;
        }
        else 
        w = da % WEEKDURATION;
        
        return w;
    }
    
    public int dayCount(int currentStep){
        
        int h = this.currentHour(currentStep);
        
        int t = currentStep  % (HOURTIME * DURATION);
        int da =   (currentStep  - (t))/(HOURTIME * DURATION);
 
      return da;
  }
    
}
