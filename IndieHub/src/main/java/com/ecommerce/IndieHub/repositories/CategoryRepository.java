package com.ecommerce.IndieHub.repositories;

import com.ecommerce.IndieHub.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
