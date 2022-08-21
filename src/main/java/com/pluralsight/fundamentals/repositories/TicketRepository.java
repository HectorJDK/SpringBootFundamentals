package com.pluralsight.fundamentals.repositories;

import com.pluralsight.fundamentals.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
