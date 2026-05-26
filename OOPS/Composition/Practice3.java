package OOPS.Composition;
class Player {
    String playerName ;
    int jerseyNumber ;

    void showDetails(){
        System.out.println("Name: "+ playerName);
        System.out.println("Jersey Number: " + jerseyNumber);
    }
}

class Team {
    Player player;

    void addTeamPlayer(Player newPlayer){
        player = newPlayer;
    }
    void showPlayerDetails(){
        player.showDetails();
    }
}
public class Practice3 {
    public static void main(String[] args) {
        Player p = new Player();
        p.playerName = "Mahi";
        p.jerseyNumber = 07;

        Team t = new Team();
        t.addTeamPlayer(p);
        t.showPlayerDetails();
    }
}
