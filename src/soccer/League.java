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

            System.out.println("Greens:\n"+Greens);
            System.out.println("Reds:\n"+Reds);
            System.out.println("Blue:\n"+Blue);
            System.out.println("Yellow:\n"+Yellow);
            
        Random ranTime= new Random();
        double goalTime = 0.0;
        
        System.out.println("\n=====================================================\n"
                + "Game: Visitors "+team.teamVisitors+" vs Locals "+team.teamLocals+
                            "\n=====================================================\n");
        
            for (int i = 0; i < 6 ; i++){
                   
                if(team.teamVisitors.equals("Greens"))player = (String)Greens.get(i);
                if(team.teamVisitors.equals("Reds"))player = (String)Reds.get(i);
                if(team.teamVisitors.equals("Blue"))player = (String)Blue.get(i);
                if(team.teamVisitors.equals("Yellow"))player = (String)Yellow.get(i);
                
                if(team.teamLocals.equals("Greens"))player = (String)Greens.get(i);
                if(team.teamLocals.equals("Reds"))player = (String)Reds.get(i);
                if(team.teamLocals.equals("Blue"))player = (String)Blue.get(i);
                if(team.teamLocals.equals("Yellow"))player = (String)Yellow.get(i);
                
                String[] teamLvsV = new String[]{team.teamVisitors,team.teamLocals};
                ranTeam = teamLvsV[new Random().nextInt(teamLvsV.length)];
                
            goalTime = (ranTime.nextInt(90) + 1.0)/1.25;
            
            System.out.println("Goal scored after " + goalTime
              + " mins by " + player +  " of the " + ranTeam+" team");

        }
        
            
    }  
}
