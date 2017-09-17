package simpledotcomgame;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
import java.util.Arrays;

public class SimpleDotComGame {

    /*public static void main(String[] args) {

        int numOfGuesses = 0; 
        GameHelper helper = new GameHelper();
        
        SimpleDotCom simple = new SimpleDotCom();
        int randomNum = (int)(Math.random() * 5);
        
        int [] locations = {randomNum, randomNum+1, randomNum+2};
        simple.setLocationCells(locations);
        boolean isAlive = true;
        
        System.out.println(Arrays.toString(simple.locationCells));
        while (isAlive) {
            String guess = helper.getUserInput("Enter a number");
            String result = simple.checkYourself(guess);
            numOfGuesses++;
            System.out.println(result);
            if (result.equals("Kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }*/
    
}
