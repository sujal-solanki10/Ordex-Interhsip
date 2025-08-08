
import java.time.LocalTime;


class Airplane{
    private String flightNumber;
    private String destination;
    private  LocalTime scheduledDeparture;
    private int delayTime;

    public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
    }

   public void DelayTime(int minutes){
        this.delayTime = minutes;
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
   }

   public void chechStatus(){
    if(delayTime == 0){
        System.out.println("Flight " + flightNumber + " is on time.");
    }else{
        System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes.");

    }

   }

    
}
public class AirplaneMain {
    public static void main(String[] args) {

        Airplane flight1 = new Airplane("CDE345", "Gujarat", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("CDE346", "Mumbai", LocalTime.of(10, 30));
        Airplane flight3 = new Airplane("CDE347", "Pune", LocalTime.of(10, 30));

        System.out.println("Flight Status:");
        System.out.println();
        flight1.chechStatus();
        flight2.chechStatus();
        flight3.chechStatus();

        
        flight1.DelayTime(40);
        flight3.DelayTime(140);

        System.out.println();
        System.out.println("Flight Status:");
        System.out.println();
        flight1.chechStatus();
        flight2.chechStatus();
        flight3.chechStatus();


        
    }
}
