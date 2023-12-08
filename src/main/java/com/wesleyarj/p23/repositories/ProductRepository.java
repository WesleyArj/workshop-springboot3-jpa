package com.wesleyarj.p23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleyarj.p23.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
