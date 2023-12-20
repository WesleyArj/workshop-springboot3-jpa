package com.wesleyarj.p23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleyarj.p23.entities.OrderItem;


public interface OrderItenRepository extends JpaRepository<OrderItem, Long> {

}
