package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> list, Integer count) {
        if (count == null || count >= list.size()) {
            return list;
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
