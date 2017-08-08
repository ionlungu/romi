package soccer;

public class Goal {   
    Team teams = new Team();
    String player;
    String team;
    
    public void scoreGoal(){
      int score = (int)Math.random() * 5 + 1;
      int time = (int)Math.random() * 1 + 90;
      
        System.out.println(score);
      for (int i = 0; i < teams.pl.pNames.length; i++){
            player = teams.pl.pNames[i];
    }
      
      System.out.println("Goal scored after " + time + " mins by " + player +  " of the ");
      
      
    }
}