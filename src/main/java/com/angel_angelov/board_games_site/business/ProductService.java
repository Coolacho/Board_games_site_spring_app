package com.angel_angelov.board_games_site.business;

import com.angel_angelov.board_games_site.data.product.Product;
import com.angel_angelov.board_games_site.data.product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        List<Product> products = this.productRepository.findAll();
        if (!products.isEmpty()) {
            products = this.productRepository.loadProductImages(products);
        }
        return products;
    }

    public List<Product> getDiscountedProducts() {
        List<Product> products = this.productRepository.findAllByDiscountIsNotOrderByIdAsc(0);;
        if (!products.isEmpty()) {
            products = this.productRepository.loadProductImages(products);
        }
        return products;
    }
}
