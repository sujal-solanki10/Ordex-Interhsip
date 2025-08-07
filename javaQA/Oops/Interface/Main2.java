
interface  playable{
    void play();
}

class FootBall implements playable{
    public void play(){
        System.out.println("PLaying Footbale");
    }
}

class ValleyBall implements  playable{
    public void play(){
        System.out.println("Playing ValleyBall");

    }
}
public class Main2 {

    public static void main(String[] args) {
        playable fb = new FootBall();
        playable vb = new ValleyBall();

        fb.play();
        vb.play();
    }
}
