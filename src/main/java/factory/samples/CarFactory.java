package factory.samples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author umut.bayram
 */
public abstract class CarFactory {
    private List<Car> cars;

    public CarFactory() {
        cars = new ArrayList<Car>();
        createAuto();
    }

    public abstract void createAuto();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
