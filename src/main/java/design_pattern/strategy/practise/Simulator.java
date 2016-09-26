package design_pattern.strategy.practise;

/**
 * Created by shu on 2016/9/18.
 */
public class Simulator {
    private Flight flight;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void run() {
        System.out.println("准备起飞！");
        flight.startFly();
        System.out.println("准备巡航！");
        flight.keepFly();

    }
}
