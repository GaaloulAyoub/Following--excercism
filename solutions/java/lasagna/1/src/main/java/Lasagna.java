public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven ( ){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven (int actuelMinute) {
        return 40 - actuelMinute ;
        
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes (int numLayer) {
        return numLayer * 2 ;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes (int numLayer , int prepTime) {
        return prepTime + numLayer *2 ;
        
    }
}
