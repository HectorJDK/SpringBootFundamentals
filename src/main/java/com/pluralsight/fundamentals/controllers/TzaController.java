package com.pluralsight.fundamentals.controllers;

import com.pluralsight.fundamentals.exceptions.ApplicationNotFoundException;
import com.pluralsight.fundamentals.models.Application;
import com.pluralsight.fundamentals.models.Ticket;
import com.pluralsight.fundamentals.services.ApplicationService;
import com.pluralsight.fundamentals.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class TzaController {

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> result = ticketService.listTickets();
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> result = applicationService.listApplications();
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }

    @GetMapping("/applications/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") Long id) {
        try {
            Application result = applicationService.findApplication(id);
            return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
        } catch (ApplicationNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }




}