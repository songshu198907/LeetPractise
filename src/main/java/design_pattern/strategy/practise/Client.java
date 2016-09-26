package design_pattern.strategy.practise;

/**
 * Created by shu on 2016/9/18.
 */
public class Client {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Flight flight;
        flight = new Fighter();
        simulator.setFlight(flight);
        simulator.run();

    }
}
