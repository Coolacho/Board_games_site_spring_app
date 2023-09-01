package com.angel_angelov.board_games_site.util;

import com.angel_angelov.board_games_site.business.ProductService;
import com.angel_angelov.board_games_site.data.product.Product;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    private final ProductService productService;

    public AppStartupEvent(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        List<Product> products = this.productService.getProducts();
        products.forEach(product -> System.out.println(product.getImages()));
    }
}
