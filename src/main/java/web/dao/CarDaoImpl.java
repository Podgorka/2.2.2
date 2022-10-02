package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    public CarDaoImpl(){}
    private List<Car> cars ;
    {
        cars = new ArrayList<>();
        cars.add(new Car("model1", "color1", 1));
        cars.add(new Car("model2", "color2", 2));
        cars.add(new Car("model3", "color3", 3));
        cars.add(new Car("model4", "color4", 4));
        cars.add(new Car("model5", "color5", 5));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }

    @Override
    public List<Car> listAnyCars(int count) {
        return cars.stream().limit(count).toList();
    }

}
