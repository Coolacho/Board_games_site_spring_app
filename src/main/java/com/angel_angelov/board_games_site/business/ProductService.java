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
        Iterable<Product> products = this.productRepository.findAll();
        List<Product> productList = new ArrayList<>();
        products.forEach(productList::add);
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return productList;
    }
}
