package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Volga", 6080, 1050));
        carsList.add(new Car("Volvo", 1050, 36000));
        carsList.add(new Car("Mercedes", 990, 100000));
        carsList.add(new Car("BMW", 330, 5000));
        carsList.add(new Car("Lada", 125, 9678));
        if (count == null || count >= carsList.size()) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
