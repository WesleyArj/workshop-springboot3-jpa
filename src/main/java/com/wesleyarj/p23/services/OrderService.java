package com.wesleyarj.p23.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesleyarj.p23.entities.Order;
import com.wesleyarj.p23.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	
	public Order findById (Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	

}
