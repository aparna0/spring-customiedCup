package com.gift.customizedcup.repository;
import com.gift.customizedcup.model.Gift;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface GiftRepository extends JpaRepository<Gift,Integer>{
    
}
