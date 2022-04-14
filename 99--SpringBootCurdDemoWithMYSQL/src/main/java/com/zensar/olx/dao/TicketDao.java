package com.zensar.olx.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zensar.olx.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

 

}
