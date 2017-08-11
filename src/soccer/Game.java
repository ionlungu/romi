package soccer;

import java.util.Random;

public class Game {
    int score;
        public int ranScore(int score){
        //random score
        Random ranScore = new Random();
        score = ranScore.nextInt(6) + 1;
        return this.score;
    }
    public void scoreGoal(){
  
    }
}
