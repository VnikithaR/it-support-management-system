package com.itsupport.service;

import com.itsupport.model.Ticket;
import com.itsupport.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public void createTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
