package com.angel_angelov.board_games_site.data.product;

import com.angel_angelov.board_games_site.data.order_products.OrderProducts;
import com.angel_angelov.board_games_site.data.product_categories.ProductCategories;
import com.angel_angelov.board_games_site.data.product_suppliers.ProductSuppliers;
import com.angel_angelov.board_games_site.data.image.Image;
import com.angel_angelov.board_games_site.data.publisher.Publisher;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private ProductType type;

    @Column(name = "description_path")
    private String descriptionPath;

    @Column(name = "price")
    private float price;

    @Column(name = "discount")
    private int discount;

    @Column(name = "rating")
    private float rating;

    @Column(name = "min_player_cnt")
    private int minPlayerCnt;

    @Column(name = "max_player_cnt")
    private int maxPlayerCnt;

    @Column(name = "min_play_time")
    private int minPlayTime;

    @Column(name = "max_play_time")
    private int maxPlayTime;

    @Column(name = "min_player_age")
    private int minPlayerAge;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProductCategories> categories = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Image> images = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderProducts> orderProducts = new HashSet<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProductSuppliers> productSuppliers = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getDescriptionPath() {
        return descriptionPath;
    }

    public void setDescriptionPath(String descriptionPath) {
        this.descriptionPath = descriptionPath;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getMinPlayerCnt() {
        return minPlayerCnt;
    }

    public void setMinPlayerCnt(int minPlayerCnt) {
        this.minPlayerCnt = minPlayerCnt;
    }

    public int getMaxPlayerCnt() {
        return maxPlayerCnt;
    }

    public void setMaxPlayerCnt(int maxPlayerCnt) {
        this.maxPlayerCnt = maxPlayerCnt;
    }

    public int getMinPlayTime() {
        return minPlayTime;
    }

    public void setMinPlayTime(int minPlayTime) {
        this.minPlayTime = minPlayTime;
    }

    public int getMaxPlayTime() {
        return maxPlayTime;
    }

    public void setMaxPlayTime(int maxPlayTime) {
        this.maxPlayTime = maxPlayTime;
    }

    public int getMinPlayerAge() {
        return minPlayerAge;
    }

    public void setMinPlayerAge(int minPlayerAge) {
        this.minPlayerAge = minPlayerAge;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<ProductCategories> getCategories() {
        return categories;
    }

    public void setCategories(Set<ProductCategories> categories) {
        this.categories = categories;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Set<OrderProducts> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProducts> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public Set<ProductSuppliers> getProductSuppliers() {
        return productSuppliers;
    }

    public void setProductSuppliers(Set<ProductSuppliers> productSuppliers) {
        this.productSuppliers = productSuppliers;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", descriptionPath='" + descriptionPath + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", rating=" + rating +
                ", minPlayerCnt=" + minPlayerCnt +
                ", maxPlayerCnt=" + maxPlayerCnt +
                ", minPlayTime=" + minPlayTime +
                ", maxPlayTime=" + maxPlayTime +
                ", minPlayerAge=" + minPlayerAge +
                ", publisher=" + publisher +
                ", categories=" + categories +
                ", images=" + images +
                ", orderProducts=" + orderProducts +
                ", productSuppliers=" + productSuppliers +
                '}';
    }
}
