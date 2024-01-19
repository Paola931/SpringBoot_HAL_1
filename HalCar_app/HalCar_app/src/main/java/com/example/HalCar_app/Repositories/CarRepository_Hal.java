package com.example.HalCar_app.Repositories;

import com.example.HalCar_app.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository_Hal extends JpaRepository<Car,Long> {
}
