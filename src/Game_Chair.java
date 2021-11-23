public class Game_Chair {

    public static void main(String[] args)  {
        BetMore_Game b=new BetMore_Game();

        Player Computer=new Player();
        Computer.user_selected=true;
        Computer.Start();


        Player Player_2=new Player();
        Player_2.user_selected=false;
        Player_2.Start();

        b.Find_Winner(Computer, Player_2);




    }
}
