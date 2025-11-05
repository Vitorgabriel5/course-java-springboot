package com.cursospring.course.repositories;

import com.cursospring.course.entities.OrderItem;
import com.cursospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
