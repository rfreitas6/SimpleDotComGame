package simpledotcomgame;

public class SimpleDotCom {
    int [] locationCells;
    private int numOfHits = 0;
    String kill;
    
    public void setLocationCells (int [] cellLocations){
        locationCells = cellLocations;
    }
    
    public String checkYourself(String inputUserGuess){
        int guessInt = Integer.parseInt(inputUserGuess);
        
        for(int locations: locationCells){
            if (guessInt == locations){
                numOfHits++;
                if (numOfHits == 3){
                    return "Kill";
                }
                else
                    return "Hit";
            }
        }
        return "You missed, bitch!";
    }
    

}
