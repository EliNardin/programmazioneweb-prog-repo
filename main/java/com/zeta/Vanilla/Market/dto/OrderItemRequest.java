package com.zeta.Vanilla.Market.dto;

import lombok.Data;

@Data
public class OrderItemRequest {
    private Long productId;
    private int quantity;
}
