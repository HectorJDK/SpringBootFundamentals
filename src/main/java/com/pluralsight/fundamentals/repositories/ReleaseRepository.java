package com.pluralsight.fundamentals.repositories;

import com.pluralsight.fundamentals.models.Release;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<Release, Long> {
}
