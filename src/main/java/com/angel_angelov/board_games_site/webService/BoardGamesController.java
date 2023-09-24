package com.angel_angelov.board_games_site.webService;

import com.angel_angelov.board_games_site.business.ProductService;
import com.angel_angelov.board_games_site.data.product.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin({"http://192.168.2.150:5173/", "http://localhost:5173"})
public class BoardGamesController {
    private final ProductService productService;

    public BoardGamesController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/All_board_games")
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/Discounted_board_games")
    public List<Product> getDiscountedProducts(){return this.productService.getDiscountedProducts();}
}
