package com.lin.pet.service.impl;
import com.lin.pet.dao.GoodsImageMapper;
import com.lin.pet.dao.GoodsMapper;
import com.lin.pet.dao.OrderMapper;
import com.lin.pet.dao.ReceiverAddressMapper;
import com.lin.pet.entity.Order;
import com.lin.pet.entity.ReceiverAddress;
import com.lin.pet.entity.ServerResponse;
import com.lin.pet.entity.dto.input.OrderDTO;
import com.lin.pet.entity.dto.output.GoodsDetailDTO;
import com.lin.pet.entity.dto.output.GoodsSampleDTO;
import com.lin.pet.entity.dto.output.OrderDetailDTO;
import com.lin.pet.entity.dto.output.OrderSampleDTO;
import com.lin.pet.service.OrderService;
import com.lin.pet.util.IdWorker;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author lin
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    GoodsImageMapper goodsImageMapper;
    @Autowired
    IdWorker idWorker;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    ReceiverAddressMapper receiverAddressMapper;
    @Override
    public ServerResponse getGoods() {
        List<GoodsSampleDTO> goodsSampleDTOS = goodsMapper.selectSampleAll();
        return ServerResponse.createBySuccess(goodsSampleDTOS);
    }

    @Override
    public ServerResponse getGoodsDetail(Long goodsId) {
        GoodsDetailDTO goodsDetailDTO = goodsMapper.selectByGoodsId(goodsId);
        List<String> avatars = goodsImageMapper.selectUrlsByGoodsId(goodsId);
        goodsDetailDTO.setAvatar(avatars);
        return ServerResponse.createBySuccess(goodsDetailDTO);
    }

    @Override
    public ServerResponse getGoodsOfSearch(String key) {
        List<GoodsSampleDTO> goodsSampleDTOS = goodsMapper.selectSampleAllByKey(key);
        return ServerResponse.createBySuccess(goodsSampleDTOS);
    }

    @Override
    public ServerResponse generateOrder(OrderDTO orderDTO) {
        Order order  = new Order();
        BeanUtils.copyProperties(orderDTO, order);
        order.setOrderId(idWorker.nextId());
        order.setCreateTime(new Date());
        order.setIsDeleted((byte)0);
        order.setModifiedTime(new Date());
        order.setStatus((byte)0);
        order.setLogisticsCompany("");
        order.setLogisticsNum("");
        orderMapper.insert(order);
        ReceiverAddress receiverAddress = new ReceiverAddress();
        BeanUtils.copyProperties(orderDTO,receiverAddress);
        receiverAddress.setOrderId(order.getOrderId());
        receiverAddress.setReceiverAddressId(idWorker.nextId());
        receiverAddress.setCreateTime(new Date());
        receiverAddress.setModifiedTime(new Date());
        receiverAddressMapper.insert(receiverAddress);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse getOrders(Long userId) {
        List<OrderSampleDTO> orderSampleDTOS = orderMapper.selectByUserId(userId);
        return ServerResponse.createBySuccess(orderSampleDTOS);
    }

    @Override
    public ServerResponse deleteOrder(Long orderId) {
        Order order = new Order();
        order.setOrderId(orderId);
        order.setModifiedTime(new Date());
        order.setIsDeleted((byte)1);
        orderMapper.updateByPrimaryKeySelective(order);
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse getOrderDetail(Long orderId) {
        OrderDetailDTO orderDetailDTO = orderMapper.selectByOrderId(orderId);
        return ServerResponse.createBySuccess(orderDetailDTO);
    }

    @Override
    public ServerResponse sureOfGot(Long orderId) {
        Order order = new Order();
        order.setOrderId(orderId);
        order.setModifiedTime(new Date());
        order.setStatus((byte)2);
        orderMapper.updateByPrimaryKeySelective(order);
        return ServerResponse.createBySuccess();
    }


}
