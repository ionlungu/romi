package soccer;
import java.util.Random;

public class Goal {   
    int score;
    double time;
    public int ranScore(){
        //random score
        Random ranScore = new Random();
        score = ranScore.nextInt(6) + 1;
        return this.score;
    }
    
    public double ranTime(){
        //random time
        Random ranTime = new Random();
        time = (ranTime.nextInt(90) + 1.0)/1.25;
        return this.time;
    }
    
    String player,team,teamsList[]={"Greens","Reds","Blue","Yellow"};

    public void scoreGoal(){
        
        for (int i = 0; i < 6 ; i++){
            String ranTeam = teamsList[new Random().nextInt(teamsList.length)];    
            if(ranTeam.equals("Greens"))player = (String)Team.Greens.get(i);
            if(ranTeam.equals("Reds"))player = (String)Team.Reds.get(i);
            if(ranTeam.equals("Blue"))player = (String)Team.Blue.get(i);
            if(ranTeam.equals("Yellow"))player = (String)Team.Yellow.get(i);
   
      Goal time = new Goal();
      double gTime = time.ranTime();
      System.out.println("Goal scored after " + gTime + " mins by " + player +  " of the " + ranTeam+" team");
     }  
    }
    
}