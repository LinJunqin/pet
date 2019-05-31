package com.lin.pet.service;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.CommentDTO;
import com.lin.pet.entity.dto.input.OrderDTO;

/**
 * @author lin
 */
public interface OrderService {
    ServerResponse getGoods();
    ServerResponse getGoodsDetail(Long goodsId);
    ServerResponse getGoodsOfSearch(String key);
    ServerResponse generateOrder(OrderDTO orderDTO);
    ServerResponse getOrders(Long userId);
    ServerResponse deleteOrder(Long orderId);
    ServerResponse getOrderDetail(Long orderId);
    ServerResponse sureOfGot(Long orderId);

}
