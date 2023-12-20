package com.order.service;

import com.order.dto.OrderListItemsDTO;
import com.order.dto.OrderRequest;
import com.order.entity.Order;
import com.order.entity.OrderListItems;
import com.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void addOrder(OrderRequest orderRequest)
    {
        Order order = new Order();
        order.setOrdernumber(UUID.randomUUID().toString());
        List<OrderListItems> orderListItemsList = orderRequest.getOrderListItemsDTOList().stream()
                .map(this::mapToDto).toList();
        order.setOrderitems(orderListItemsList);
        orderRepository.save(order);
    }

    private OrderListItems mapToDto(OrderListItemsDTO orderListItemsDTO) {
        OrderListItems orderListItems = new OrderListItems();
        orderListItems.setProductcode(orderListItemsDTO.getProductid());
        orderListItems.setPrice(orderListItemsDTO.getPrice());
        orderListItems.setQuantity(orderListItemsDTO.getQuantity());
        return  orderListItems;
    }

}
