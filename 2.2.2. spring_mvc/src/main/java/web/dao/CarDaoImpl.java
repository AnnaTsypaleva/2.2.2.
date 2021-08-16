package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "X1", 2017));
        cars.add(new Car("Toyota", "Camry", 2018));
        cars.add(new Car("Opel", "Crossland", 2020));
        cars.add(new Car("Mazda", "CX-9", 2021));
        cars.add(new Car("Audi", "Q8", 2016));
    }

    @Override
    public List<Car> getCars(Integer count) {
        return count != null && count < 5 && count > 0 ? cars.subList(0, count) : cars;
    }
}