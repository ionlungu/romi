package soccer;

import java.util.ArrayList;
import java.util.Random;

public class League {

    public static void main(String[] args) {
        // all players
        ArrayList<Player> allPlayers = new ArrayList<>(24);
        allPlayers.add(new Player("Juan Mata"));
        allPlayers.add(new Player("Gerard Pique"));
        allPlayers.add(new Player("Iker Casillas"));
        allPlayers.add(new Player("Cesc Fabregas"));
        allPlayers.add(new Player("Radamel Falcao"));
        allPlayers.add(new Player("Robin Van Persie"));
        allPlayers.add(new Player("Wayne Rooney"));
        allPlayers.add(new Player("Neymar Da Silva"));
        allPlayers.add(new Player("Zlatan Ibrahimovic"));
        allPlayers.add(new Player("Andres Iniesta"));
        allPlayers.add(new Player("Lionel Messi"));
        allPlayers.add(new Player("Christiano Ronaldo"));
        allPlayers.add(new Player("Xavi Xavi"));
        allPlayers.add(new Player("Thiago Silva"));
        allPlayers.add(new Player("Bastian Schweinsteiger"));
        allPlayers.add(new Player("Luis Suarez"));
        allPlayers.add(new Player("Sergio Ramos"));
        allPlayers.add(new Player("Vincent Kompany"));
        allPlayers.add(new Player("Marco Reus"));
        allPlayers.add(new Player("Franck Ribery"));
        allPlayers.add(new Player("Thomas Muller"));
        allPlayers.add(new Player("Karim Benzema"));
        allPlayers.add(new Player("Fernandinho"));
        allPlayers.add(new Player("Angel Di Maria"));

        Team green = new Team();
        green.teamName = "Greens";

        Team red = new Team();
        red.teamName = "Reds";

        Team blue = new Team();
        blue.teamName = "Blue";

        Team yellow = new Team();
        yellow.teamName = "Yellow";

        for (int i = 0; i < allPlayers.size() / 4; i++) {//set Greens team
            green.players.add(allPlayers.get(i));
        }

        for (int i = allPlayers.size() / 4; i < allPlayers.size() / 2; i++) {//set Reds team
            red.players.add(allPlayers.get(i));
        }

        for (int i = allPlayers.size() / 2; i < (3 * allPlayers.size()) / 4; i++) {//set Blue team
            blue.players.add(allPlayers.get(i));
        }

        for (int i = (3 * allPlayers.size()) / 4; i < allPlayers.size(); i++) {//set Yellow team
            yellow.players.add(allPlayers.get(i));
        }

        Teams allTeams = new Teams();
        allTeams.teams.add(green);
        allTeams.teams.add(red);
        allTeams.teams.add(blue);
        allTeams.teams.add(yellow);

        boolean markers[] = new boolean[allTeams.teams.size()];
        int allTeamSize = allTeams.teams.size();

        while ((allTeams.teamVisitors.size() + allTeams.teamLocals.size()) < allTeamSize) {
            int index = new Random().nextInt(allTeamSize);

            // add locals teams
            if (!markers[index] && allTeams.teamLocals.size() < 2) {
                allTeams.teamLocals.add(allTeams.teams.get(index));
                markers[index] = true;
            }

            // add visitors teams
            if (!markers[index] && allTeams.teamVisitors.size() < 2) {
                allTeams.teamVisitors.add(allTeams.teams.get(index));
                markers[index] = true;
            }
        }

        System.out.println("\n=====================================================\n");
        System.out.println("Greens team:\n" + green.players);
        System.out.println("\n=====================================================\n");
        System.out.println("Reds team:\n" + red.players);
        System.out.println("\n=====================================================\n");
        System.out.println("Blue team:\n" + blue.players);
        System.out.println("\n=====================================================\n");
        System.out.println("Yellow team:\n" + yellow.players);
        System.out.println("\n=====================================================\n");

        Random ranTime = new Random();
        double goalTime = 0.0;

        Game game1 = new Game();
        game1.localTeam = allTeams.teamLocals.get(0);
        game1.visitorTeam = allTeams.teamVisitors.get(1);

        Game game2 = new Game();
        game2.localTeam = allTeams.teamLocals.get(1);
        game2.visitorTeam = allTeams.teamVisitors.get(0);

        System.out.println("=============================================================================");
        System.out.println("        GAME 1 : " + game1.localTeam.teamName + " vs " + game1.visitorTeam.teamName);
        System.out.println("        GAME 2 : " + game2.localTeam.teamName + " vs " + game2.visitorTeam.teamName);
        System.out.println("=============================================================================");


        Random ranScore = new Random();

        int maxGameTime = 92;
        double minGameTime = 0.0;

        Goal aGoal = new Goal();

        System.out.println("\n=====================================================\n"
                + "Game: Visitors " + allTeams.teamVisitors + " vs Locals " + allTeams.teamLocals +
                "\n=====================================================\n");

        do {

            int gameGoal = ranScore.nextInt(2) + 0;
            int teamScoredGoal = ranScore.nextInt(2) + 0;
            int goalScorer = ranScore.nextInt(6) + 0;

            goalTime = (ranTime.nextInt(maxGameTime) + minGameTime) / 1.25;//setting random goal time
            minGameTime = goalTime;//increasing minimum game time

            Goal goal = new Goal();
            goal.gTime = goalTime;

            if (gameGoal == 1) {
                if (teamScoredGoal == 1) {
                    goal.scoredTeam = game2.visitorTeam;
                    goal.scoredPlayer = game2.visitorTeam.players.get(goalScorer);
                } else {
                    goal.scoredTeam = game2.localTeam;
                    goal.scoredPlayer = game2.localTeam.players.get(goalScorer);
                }
                game2.goals.add(goal);
            } else {
                if (teamScoredGoal == 1) {
                    goal.scoredTeam = game1.visitorTeam;
                    goal.scoredPlayer = game1.visitorTeam.players.get(goalScorer);
                } else {
                    goal.scoredTeam = game1.localTeam;
                    goal.scoredPlayer = game1.localTeam.players.get(goalScorer);
                }
                game1.goals.add(goal);
            }

        } while (goalTime < maxGameTime && minGameTime <= maxGameTime);

        // print statistics
    }
}
