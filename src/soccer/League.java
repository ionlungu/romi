package soccer;
import java.util.ArrayList;
import java.util.Random;
public class League {
    
    public static void main(String[] args) {
        ArrayList Greens = new ArrayList();
        ArrayList Reds = new ArrayList();
        ArrayList Blue = new ArrayList();
        ArrayList Yellow = new ArrayList();
        String player=null;
        //String team=null;
        String ranTeam=null;
        
        Team t1 = new Team();
        t1.teamsList = new String[] {"Greens","Reds","Blue","Yellow"};
        
        Player pl = new Player();
        pl.pNames = new String []{
           "Juan Mata",
           "Gerard Pique",
           "Iker Casillas",
           "Cesc Fabregas",
           "Radamel Falcao",
           "Robin Van Persie",
           "Wayne Rooney",
           "Neymar Da Silva",
           "Zlatan Ibrahimovic",
           "Andres Iniesta",
           "Lionel Messi",
           "Christiano Ronaldo",
           "Xavi Xavi",
           "Thiago Silva",
           "Bastian Schweinsteiger",
           "Luis Suarez",
           "Sergio Ramos",
           "Vincent Kompany",
           "Marco Reus",
           "Franck Ribery",
           "Thomas Muller",
           "Karim Benzema",
           "Fernandinho",
           "Angel Di Maria"
        };
    
        for (int i = 0 ;i<pl.pNames.length/4;i++){
            Greens.add(pl.pNames[i]);
        }
        
        for (int i =pl.pNames.length/4; i <pl.pNames.length/2;i++){
            Reds.add(pl.pNames[i]);
        }
        
        for(int i = pl.pNames.length/2; i < pl.pNames.length - 6; i++){
            Blue.add(pl.pNames[i]);
        }
        
        for(int i = pl.pNames.length - 6; i < pl.pNames.length; i++){
            Yellow.add(pl.pNames[i]);
        }

            System.out.println("Greens:\n"+Greens);
            System.out.println("Reds:\n"+Reds);
            System.out.println("Blue:\n"+Blue);
            System.out.println("Yellow:\n"+Yellow);
            
        Random ranTime= new Random();
        double goalTime = 0.0;
        
            for (int i = 0; i < 6 ; i++){
                ranTeam = t1.teamsList[new Random().nextInt(t1.teamsList.length)];    
                if(ranTeam.equals("Greens"))player = (String)Greens.get(i);
                if(ranTeam.equals("Reds"))player = (String)Reds.get(i);
                if(ranTeam.equals("Blue"))player = (String)Blue.get(i);
                if(ranTeam.equals("Yellow"))player = (String)Yellow.get(i);
            goalTime = (ranTime.nextInt(90) + 1.0)/1.25;
            System.out.println("Goal scored after " + goalTime
              + " mins by " + player +  " of the " + ranTeam+" team");

        }
        

    }  
}
