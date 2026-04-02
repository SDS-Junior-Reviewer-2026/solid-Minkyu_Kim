package vehicle;

public class GasStation {

    public void reFuel(Vehicle vehicle) {
       vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }

}
