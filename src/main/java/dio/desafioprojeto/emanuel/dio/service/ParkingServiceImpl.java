package dio.desafioprojeto.emanuel.dio.service;

import dio.desafioprojeto.emanuel.dio.model.Car;
import dio.desafioprojeto.emanuel.dio.model.Parking;

import dio.desafioprojeto.emanuel.dio.repository.EstacionamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ParkingServiceImpl implements IParkingSevice{

    @Autowired
    private EstacionamentoRepository parkingRepository;
    @Override
    public Parking addCar(String license, LocalDateTime entry) {
        return null;
    }

    @Override
    public Parking exitCar(String license, LocalDateTime exit) {
        return null;
    }

    @Override
    public Double end(List<Car> cars) {
        return null;
    }
}
