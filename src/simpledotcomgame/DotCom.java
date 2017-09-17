package simpledotcomgame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;
    String name;
    public void setName(String name) {this.name = name;}
    
    public void setLocationCells (ArrayList<String> cellLocations){
        locationCells = cellLocations;
    }
    
    public String checkYourself(String inputUserGuess){
        String result = "miss";
        
        int index = locationCells.indexOf(inputUserGuess);
        
        if (index >= 0){
            locationCells.remove(index);    
            if (locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        
        return result;
           
        
        
        /*int guessInt = Integer.parseInt(inputUserGuess);
        
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
        return "You missed, bitch!";*/
    }
    

}
