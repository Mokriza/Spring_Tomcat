package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value="/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Volga", 6080, 1050));
        carsList.add(new Car("Volvo", 1050, 36000));
        carsList.add(new Car("Mercedes", 990, 100000));
        carsList.add(new Car("BMW", 330, 5000));
        carsList.add(new Car("Lada", 125, 9678));

        model.addAttribute("carsList", carService.getCars(carsList, count));

        return "cars";
    }
}
