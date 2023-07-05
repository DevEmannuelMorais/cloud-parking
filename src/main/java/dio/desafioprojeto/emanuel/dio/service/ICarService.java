package dio.desafioprojeto.emanuel.dio.service;

import dio.desafioprojeto.emanuel.dio.DTO.CarDTO;
import dio.desafioprojeto.emanuel.dio.model.Car;

import java.util.List;

public interface ICarService {
    Car create(CarDTO form);

    List<Car> findAll();

    Car findById(String id);
    Car update(CarDTO form);

    void delete(String id);
}
