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
        String ranTeam=null;
        
        Team allTeams = new Team();
        allTeams.teamsList = new String[] {"Greens","Reds","Blue","Yellow"};
        
        Team team = new Team();
        //set Visitors team
        team.teamVisitors = allTeams.teamsList[new Random().nextInt(allTeams.teamsList.length)];
        //set Locals team
        team.teamLocals = allTeams.teamsList[new Random().nextInt(allTeams.teamsList.length)];
        //run again if Visitors name is same as Locals'
        while(team.teamLocals.equalsIgnoreCase(team.teamVisitors))
        team.teamLocals = allTeams.teamsList[new Random().nextInt(allTeams.teamsList.length)];
        
        Player pl = new Player();
        pl.pNames = new String []{//all football players divisible by 4
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
    
        for (int i = 0 ;i<pl.pNames.length/4;i++){//set Greens team
            Greens.add(pl.pNames[i]);
        }
        
        for (int i =pl.pNames.length/4; i <pl.pNames.length/2;i++){//set Reds team
            Reds.add(pl.pNames[i]);
        }
        
        for(int i = pl.pNames.length/2; i < pl.pNames.length - 6; i++){//set Blue team
            Blue.add(pl.pNames[i]);
        }
        
        for(int i = pl.pNames.length - 6; i < pl.pNames.length; i++){//set Yellow team
            Yellow.add(pl.pNames[i]);
        }
            
            System.out.println("\n=====================================================\n");
            System.out.println("Greens team:\n"+Greens);
            System.out.println("\n=====================================================\n");
            System.out.println("Reds team:\n"+Reds);
            System.out.println("\n=====================================================\n");
            System.out.println("Blue team:\n"+Blue);
            System.out.println("\n=====================================================\n");
            System.out.println("Yellow team:\n"+Yellow);
            System.out.println("\n=====================================================\n");
            
        Random ranTime= new Random();
        double goalTime = 0.0;
        
        Game aGame = new Game();
        Random ranScore = new Random();
        
        int maxGameTime = 92;
        double minGameTime = 0.0;
        
        Goal aGoal = new Goal();
        aGoal.scoredGoals = 0;
        
        System.out.println("\n=====================================================\n"
                + "Game: Visitors "+team.teamVisitors+" vs Locals "+team.teamLocals+
                            "\n=====================================================\n");
        
            do {
                int goalScorer = ranScore.nextInt(6) + 0;
                if(team.teamVisitors.equals("Greens")||
                        team.teamLocals.equals("Greens"))player = (String)Greens.get(goalScorer);
                if(team.teamVisitors.equals("Reds")||
                        team.teamLocals.equals("Reds"))player = (String)Reds.get(goalScorer);
                if(team.teamVisitors.equals("Blue")||
                        team.teamLocals.equals("Blue"))player = (String)Blue.get(goalScorer);
                if(team.teamVisitors.equals("Yellow")||
                        team.teamLocals.equals("Yellow"))player = (String)Yellow.get(goalScorer);
                
                String[] teamLvsV = new String[]{team.teamVisitors,team.teamLocals};//put the 2 teams in an array
                ranTeam = teamLvsV[new Random().nextInt(teamLvsV.length)];//random select scoring team
                
            goalTime = (ranTime.nextInt(maxGameTime) + minGameTime)/1.25;//setting random goal time
            minGameTime = goalTime;//increasing minimum game time
            
            aGame.scored = ranScore.nextInt(2) + 0;
            if(aGame.scored>0 && goalTime<maxGameTime){//sout only if there is a goal
                aGoal.scoredGoals++;
                System.out.println(aGame.scored+" goal scored after " + goalTime
                  + " mins by " + player +  " of the " + ranTeam+" team");
            }
        }while(goalTime<maxGameTime && minGameTime<=maxGameTime);
        if(aGoal.scoredGoals<1)System.out.println("No goals were scored");
        else{System.out.println("Total goals scored: "+aGoal.scoredGoals);}
    }  
}
