package soccer;
import java.util.ArrayList;

public class Team{

    Player pl = new Player();

    static ArrayList Greens = new ArrayList();
    static ArrayList Reds = new ArrayList();
    static ArrayList Blue = new ArrayList();
    static ArrayList Yellow = new ArrayList();
            
    public void displayTeams(){

        
        for (int i = 0 ;i<pl.pNames.length/4;i++)
        {
            Greens.add(pl.pNames[i]);
        }
        
        for (int i =pl.pNames.length/4; i <pl.pNames.length/2;i++)
        {
            Reds.add(pl.pNames[i]);
        }
        
        for(int i = pl.pNames.length/2; i < pl.pNames.length - 6; i++) {
            Blue.add(pl.pNames[i]);
        }
        
        for(int i = pl.pNames.length - 6; i < pl.pNames.length; i++) {
            Yellow.add(pl.pNames[i]);
        }

            System.out.println("Greens: \n"+Greens);
            System.out.println("Reds:\n"+Reds);
            System.out.println("Blue:\n"+Blue);
            System.out.println("Yellow:\n"+Yellow);
    } 
}
