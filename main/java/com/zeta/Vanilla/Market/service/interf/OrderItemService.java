package com.zeta.Vanilla.Market.service.interf;

import com.zeta.Vanilla.Market.dto.OrderRequest;
import com.zeta.Vanilla.Market.dto.Response;
import com.zeta.Vanilla.Market.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
