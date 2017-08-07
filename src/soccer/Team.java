package soccer;
import java.util.ArrayList;

public class Team{
        Player pl = new Player();
        ArrayList Greens = new ArrayList();
        ArrayList Reds = new ArrayList();
        
    public void SetTeams(){

        
        for (int i=0;i<pl.pNames.length/2;i++)
        {
            Greens.add(pl.pNames[i]);
        }
        
        for (int i=pl.pNames.length/2;i<pl.pNames.length;i++)
        {
            Reds.add(pl.pNames[i]);
        }

            System.out.println("Greens: \n"+Greens);
            System.out.println("Reds:\n"+Reds.clone());
    }
    
}
