package com.zensar.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.dao.TicketDao;
import com.zensar.olx.model.Ticket;

@RestController
@RequestMapping
public class TicketController {

	@Autowired
	private TicketDao dao;
	
	
	@PostMapping("/bookTicket")
	public String bookTicket(@RequestBody List<Ticket> tickets) 
	{
	//	return repository.save(ti);
	 
	dao.saveAll(tickets);
	return "ticket booked"+tickets.size();
		
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets()
	{
		return (List<Ticket>) dao.findAll();
		
	}
	
	
	
}
