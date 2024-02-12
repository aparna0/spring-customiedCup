package com.gift.customizedcup.repository;
import com.gift.customizedcup.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}
