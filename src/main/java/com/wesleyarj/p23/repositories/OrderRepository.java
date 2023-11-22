package com.wesleyarj.p23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleyarj.p23.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
