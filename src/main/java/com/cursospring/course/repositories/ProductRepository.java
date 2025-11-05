package com.cursospring.course.repositories;

import com.cursospring.course.entities.Category;
import com.cursospring.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
