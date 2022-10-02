package web.dao;
import web.model.Car;
import java.util.List;

public interface CarDao {

    List<Car> listCars();
    List<Car> listAnyCars(int count);

}