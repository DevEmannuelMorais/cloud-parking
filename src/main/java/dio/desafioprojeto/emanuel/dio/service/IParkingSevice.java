package dio.desafioprojeto.emanuel.dio.service;

import dio.desafioprojeto.emanuel.dio.model.Car;
import dio.desafioprojeto.emanuel.dio.model.Parking;

import java.time.LocalDateTime;
import java.util.List;

public interface IParkingSevice {
    Parking addCar(String license, LocalDateTime entry);

    Parking exitCar(String license, LocalDateTime exit);

    Double end(List<Car> cars);


}
