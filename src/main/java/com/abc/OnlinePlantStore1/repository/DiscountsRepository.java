package com.abc.OnlinePlantStore1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.onlinestore.entity.Discounts;
@Repository
public interface DiscountsRepository extends JpaRepository<Discounts,Integer> {

}