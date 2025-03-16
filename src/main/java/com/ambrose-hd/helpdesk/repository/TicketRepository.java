package com.ambrose.helpdesk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ambrose.helpdesk.model.Ticket;

@Repository
@Transactional
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    Ticket findById(int id);

    List<Ticket> findByAssignedToId(int id);
}
