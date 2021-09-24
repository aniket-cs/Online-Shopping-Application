package com.cg.onlineshopping_application.repository;

import java.util.List;

import com.cg.onlineshopping_application.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartRepository extends JpaRepository<Cart,Integer>{
	
	@Query("from Cart item inner Join item.product p inner Join item.customer c where c.customerId=:custId")
	public List<Cart> getCartItems(@Param("custId") Integer customerId);
}
