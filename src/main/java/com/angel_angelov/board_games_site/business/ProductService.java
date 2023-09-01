package com.angel_angelov.board_games_site.business;

import com.angel_angelov.board_games_site.data.product.Product;
import com.angel_angelov.board_games_site.data.product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return this.productRepository.findProductsWithImages();
    }
}
