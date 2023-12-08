package com.wesleyarj.p23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleyarj.p23.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
