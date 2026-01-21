public class Lasagna {
    
    public int expectedMinutesInOven ( ){
        return 40;
    }
    
    public int remainingMinutesInOven (int actuelMinute) {
        return expectedMinutesInOven() - actuelMinute ;
        
    }
   
    public int preparationTimeInMinutes (int numLayer) {
        return numLayer * 2 ;
    }
   
    public int totalTimeInMinutes (int numLayer , int prepTime) {
        return prepTime + preparationTimeInMinutes(numLayer)  ;
        
    }
}
