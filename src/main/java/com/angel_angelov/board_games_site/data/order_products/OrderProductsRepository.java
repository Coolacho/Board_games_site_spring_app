package com.angel_angelov.board_games_site.data.order_products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductsRepository extends JpaRepository<OrderProducts, Long> {
}
