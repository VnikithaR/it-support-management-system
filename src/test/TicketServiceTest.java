package com.itsupport.service;

import com.itsupport.model.Ticket;
import com.itsupport.repository.TicketRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TicketServiceTest {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private TicketRepository ticketRepository;

    @Test
    public void testCreateTicket() {
        Ticket ticket = new Ticket();
        ticket.setTicketId("T123");
        ticket.setDescription("Test ticket");
        ticket.setStatus("Open");
        ticket.setCreatedBy("User1");

        ticketService.createTicket(ticket);
        assertNotNull(ticketRepository.findById("T123"));
    }
}
