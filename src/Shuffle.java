public class Shuffle {
    public int random;

    public Shuffle(){
        this.random=pick_Card();
    }

    public int pick_Card(){
        int a=(int)  (100*Math.random());
        this.random=a;
        return this.random;
    }

}
