package soccer;

import java.util.Random;

public class Game {
    int scored;
        public int ranScore(int scored){
        //random score
        Random ranScore = new Random();
        scored = ranScore.nextInt(6) + 1;
        return this.scored;
    }
    public void scoreGoal(){
  
    }
}
