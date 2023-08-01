package com.example.repository;

import com.example.entity.CarEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface CarEntityRepository extends JpaRepository<CarEntity, Long> {
}
