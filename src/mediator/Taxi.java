package mediator;

public abstract class Taxi {
    private int capacity;
    private boolean isBusy;

    private TaxiStation taxiStation;

    public Taxi(int capacity, TaxiStation taxiStation) {
        this.capacity = capacity;
        this.taxiStation = taxiStation;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public int getCapacity() {
        return capacity;
    }

    public void pickupClient(String address) {
        taxiStation.dispatchTaxi(address);
        capacity++;
    }

}
