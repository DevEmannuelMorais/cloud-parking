package dio.desafioprojeto.emanuel.dio.service;

import dio.desafioprojeto.emanuel.dio.DTO.CarDTO;
import dio.desafioprojeto.emanuel.dio.model.Car;
import dio.desafioprojeto.emanuel.dio.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car create(CarDTO form) {
        Car car = new Car();
        car.setLicense(form.license());
        car.setModel(form.model());
        car.setColor(form.color());
        car.setState(form.state());
        return carRepository.save(car);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(String id) {
        return carRepository.findById(id).get();
    }

    @Override
    public Car update(CarDTO form) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
