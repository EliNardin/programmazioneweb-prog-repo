package com.zeta.Vanilla.Market.repository;

import com.zeta.Vanilla.Market.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>  {
}
