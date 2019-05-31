package com.lin.pet.controller;

import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.OrderDTO;
import com.lin.pet.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lin
 */
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping(value = "/goods/list")
    public ServerResponse getGoods(){
        return orderService.getGoods();
    }
    @PostMapping(value = "/goods/goods/detail")
    public ServerResponse getGoodsDetail(@RequestParam("goodsId") Long goodsId){
        return orderService.getGoodsDetail(goodsId);
    }
    @PostMapping(value = "/goods/search")
    public ServerResponse getGoodsOfSearch(@RequestParam("key")String key){
        return orderService.getGoodsOfSearch(key);
    }
    @PostMapping(value = "/goods/order")
    public ServerResponse generateOrder(@RequestBody OrderDTO orderDTO){
        return orderService.generateOrder(orderDTO);
    }

    @GetMapping(value = "/person/orders")
    public ServerResponse getOrders(@RequestParam("userId")Long userId){
        return orderService.getOrders(userId);
    }
    @DeleteMapping(value = "/person/order")
    public ServerResponse deleteOrder(@RequestParam("orderId")Long orderId){
        return orderService.deleteOrder(orderId);
    }
    @GetMapping(value = "/person/order/detail")
    public ServerResponse getOrderDetail(@RequestParam("orderId")Long orderId){
        return orderService.getOrderDetail(orderId);
    }
    @PutMapping(value = "/person/order/sure")
    public ServerResponse sureOfGot(@RequestParam("orderId")Long orderId){
        return orderService.sureOfGot(orderId);
    }
}
