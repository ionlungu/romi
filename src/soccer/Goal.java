package soccer;
import java.util.Random;

public class Goal {
    
    public double gTime;
    public int score;
    Random ranTime;
    
        public Goal(){
            ranTime = new Random();
            gTime = (ranTime.nextInt(90) + 1.0)/1.25;
        }
        
        public double ranTime(double gTime){
            //random time
            ranTime = new Random();
            gTime = (ranTime.nextInt(90) + 1.0)/1.25;
            return this.gTime;
        }    
}