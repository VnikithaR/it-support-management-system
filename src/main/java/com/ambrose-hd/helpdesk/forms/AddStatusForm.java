package com.ambrose.helpdesk.forms;

import com.ambrose.helpdesk.model.Status;
import com.ambrose.helpdesk.model.Ticket;

import javax.validation.constraints.NotNull;

public class AddStatusForm {

    private Ticket ticket;

    private Status status;

    @NotNull
    private int ticketId;

    @NotNull
    private int statusId;

    public AddStatusForm(Ticket ticket, Status status){
        this.ticket = ticket;
        this.status = status;
    }

    public AddStatusForm(){}

    public Ticket getTicket() {
        return ticket;
    }

    public Status getStatus() {
        return status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int getStatusId() {
        return statusId;
    }
}
