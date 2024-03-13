package com.example.service2_order.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor @NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    @Column(name = "order_date")
    private LocalDateTime orderDate;
    @Column(name = "status")
    private String status;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @OneToOne
    private User user;

    public Order(long id, LocalDateTime orderDate, String status, String shippingAddress) {
        this.id = id;
        this.orderDate = orderDate;
        this.status = status;
        this.shippingAddress = shippingAddress;
    }
}
