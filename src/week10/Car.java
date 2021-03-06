package week10;

/**
 * Created by Mike Plucker
 * Date: 4/10/2016
 * Class: CSCI 1933-12
 */

// Priority Queue and Simulation

// Car class the represents cars in the carwash simulation
// Car objects contain the time they were created and their service time.
// Car objects are immediately queued in the washer queue.
// Car objects are passive except in constructor (creation)
public class Car {

    // constructor

    public Car(double t, double servTime) {
        arrivalTime = t;
        serviceTime = servTime;
        Washer.enter(this);
        if (!Washer.isBusy())
            new Washer().run();  // wake-up washer if idle
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getServiceTime() {
        return serviceTime;
    }

    // private variables

    private double arrivalTime;
    private double serviceTime;

} // Car class
