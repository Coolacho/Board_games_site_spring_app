package com.angel_angelov.board_games_site.data.product_categories;

import com.angel_angelov.board_games_site.data.category.Category;
import com.angel_angelov.board_games_site.data.product.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "product_categories")
public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductCategories{" +
                "id=" + id +
                ", product=" + product +
                ", category=" + category +
                '}';
    }
}
