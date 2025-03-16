package com.ambrose.helpdesk.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ambrose.helpdesk.model.Status;

@Repository
@Transactional
public interface StatusRepository extends JpaRepository<Status, Integer> {

}
