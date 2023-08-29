package com.angel_angelov.board_games_site.data.product_suppliers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSuppliersRepository extends JpaRepository<ProductSuppliers, Long> {
}
