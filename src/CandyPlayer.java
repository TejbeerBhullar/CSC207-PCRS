import java.util.Random;

public class CandyPlayer {
    private static int numOfCandies;
    private static int turn;
    private static int numOfPlayers;
    private int uniqueId;
    private int numOfPlayerCandies;

    public CandyPlayer(int numOfPlayerCandies){
        this.numOfPlayerCandies = numOfPlayerCandies;}

    public int getMyCandy(){ return this.numOfPlayerCandies;}
    public static int getMountainCandy(){return numOfCandies;}
    public static int getTurn(){return turn;}
    public static int getNumberOfPlayers(){return numOfPlayers;}
    public static void setTurn(int newturn){turn = newturn;}
    public static void setNumberOfPlayers(int newNumOfPlayers){
        numOfPlayers = newNumOfPlayers;}
    public boolean play(int numCandies){
        if (uniqueId != turn){return false;}
        if (numCandies > this.numOfPlayerCandies){return false;}
        else {if (numOfCandies > numCandies){
            numOfCandies -= numCandies;
            numOfPlayerCandies += numCandies;}
        else{numOfCandies += numCandies;
            numOfPlayerCandies -= numCandies;}
            if (turn == numOfPlayers){turn = 0;}
            else{turn +=1;}
            return true;
        }
    }

    private static int totalCandy = (new Random()).nextInt(100);

    public static void main(String[] arg){
        CandyPlayer.getMountainCandy();    // Suppose this returns 50
        CandyPlayer player = new CandyPlayer(80);
        player.play(100);    // this returns false
        player.play(20);    // this returns true
        CandyPlayer.getMountainCandy();    // this returns 30
        player.getMyCandy();    // this returns 100 since the player gave 20 to the Candy mountain and got 40 from the mountain

        player.play(50);    // this returns true
        CandyPlayer.getMountainCandy();    // this returns 80 because 100 > 80
        player.getMyCandy();    // this returns 50
    }
}

