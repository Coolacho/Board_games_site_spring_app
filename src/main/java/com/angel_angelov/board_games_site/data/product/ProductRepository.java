package com.angel_angelov.board_games_site.data.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllByDiscountIsNotOrderByIdAsc(int discount);

/*    @Query(value = "SELECT DISTINCT pr FROM Product pr LEFT JOIN pr.categories cts LEFT JOIN FETCH cts.category WHERE pr IN (:products)")
    List<Product> loadProductCategories(List<Product> products);*/

    @Query(value = "SELECT DISTINCT pr FROM Product pr LEFT JOIN FETCH pr.images WHERE pr IN (:products) ")
    List<Product> loadProductImages(List<Product> products);
}
