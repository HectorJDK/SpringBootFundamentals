package com.pluralsight.fundamentals.services;

import com.pluralsight.fundamentals.models.Ticket;
import com.pluralsight.fundamentals.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return ticketRepository.findAll();
    }
}
