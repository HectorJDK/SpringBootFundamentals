package com.pluralsight.fundamentals.repositories;

import com.pluralsight.fundamentals.models.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
