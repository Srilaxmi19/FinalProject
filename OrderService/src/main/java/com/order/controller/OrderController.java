package com.order.controller;

import com.order.dto.OrderRequest;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/orderService")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @PostMapping("/new")
    public String takeOrder(@RequestBody OrderRequest orderRequest)
    {
        orderService.addOrder(orderRequest);
        return "Order placed successfully";
    }
}
