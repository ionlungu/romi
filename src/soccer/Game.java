package soccer;

import java.util.ArrayList;

public class Game {

    public Team visitorTeam;
    public Team localTeam;
    public ArrayList<Goal> goals = new ArrayList<>(5);

    public void scoreGoal(Goal goal) {
        goals.add(goal);
    }
}
