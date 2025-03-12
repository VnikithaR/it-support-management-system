package com.itsupport.controller;

import com.itsupport.model.Ticket;
import com.itsupport.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public String showTicketList(Model model) {
        model.addAttribute("tickets", ticketService.getAllTickets());
        return "ticket_list";
    }

    @PostMapping("/createTicket")
    public String createTicket(Ticket ticket, Model model) {
        ticketService.createTicket(ticket);
        return "redirect:/tickets";
    }
}
