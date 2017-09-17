package simpledotcomgame;
import java.util.ArrayList;
public class DotComBust {
    
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    int numOfGuesses = 0;

    public void setUpGame(){
        DotCom dotCom1 = new DotCom();
        DotCom dotCom2 = new DotCom();
        DotCom dotCom3 = new DotCom();
        dotCom1.setName("Pets.com");
        dotCom2.setName("Aol.com");
        dotCom3.setName("Yahoo.com");
        dotComsList.add(dotCom1);
        dotComsList.add(dotCom2);
        dotComsList.add(dotCom3);
        
        for(DotCom dotComObjects: dotComsList){
            helper.getUserInput(prompt);
            dotComObjects.setLocationCells(cellLocations);
                 
        }
    }
    
    public void startPlaying(){
        
    }
    
    public void checkUserGuess(){
    
    }
    
    public void finishGame(){
    
    }
            
    public static void main(String[] args) {
        
    }
    
    
    
}
