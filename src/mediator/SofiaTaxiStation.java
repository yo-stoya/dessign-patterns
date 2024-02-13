package mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SofiaTaxiStation implements TaxiStation {
    private List<Taxi> taxis;

    public SofiaTaxiStation() {
        taxis = new ArrayList<>();
    }

    @Override
    public void dispatchTaxi(String address) {
        final Optional<Taxi> availableTaxi =
                taxis.stream().filter(taxi -> !taxi.isBusy() && taxi.getCapacity() == 0).findFirst();

        availableTaxi.ifPresent(t -> {
            t.pickupClient(address);

        });

    }
}
