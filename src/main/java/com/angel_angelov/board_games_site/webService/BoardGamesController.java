package com.angel_angelov.board_games_site.webService;

import com.angel_angelov.board_games_site.business.ProductService;
import org.json.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/All_board_games")
public class BoardGamesController {
    private final ProductService productService;

    public BoardGamesController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public JSONArray getProducts() {
        return new JSONArray(this.productService.getProducts());
    }
}
