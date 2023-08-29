package com.angel_angelov.board_games_site.data.order;

import com.angel_angelov.board_games_site.data.order_products.OrderProducts;
import com.angel_angelov.board_games_site.data.customer.Customer;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "date_made")
    private Date dateMade;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private OrderStatus status;

    @Column(name = "date_completed")
    private Date dateCompleted;

    @Column(name = "total")
    private Float total;

    @Column(name = "is_payed")
    private Boolean isPayed;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    private OrderPaymentMethod paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderProducts> orderProducts = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateMade() {
        return dateMade;
    }

    public void setDateMade(Date dateMade) {
        this.dateMade = dateMade;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Boolean getPayed() {
        return isPayed;
    }

    public void setPayed(Boolean payed) {
        isPayed = payed;
    }

    public OrderPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(OrderPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<OrderProducts> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProducts> orderProducts) {
        this.orderProducts = orderProducts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateMade=" + dateMade +
                ", status=" + status +
                ", dateCompleted=" + dateCompleted +
                ", total=" + total +
                ", isPayed=" + isPayed +
                ", paymentMethod=" + paymentMethod +
                ", customer=" + customer +
                ", orderProducts=" + orderProducts +
                '}';
    }
}
