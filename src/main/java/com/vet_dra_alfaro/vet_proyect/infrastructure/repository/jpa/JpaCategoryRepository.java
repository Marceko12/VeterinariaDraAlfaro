package com.vet_dra_alfaro.vet_proyect.infrastructure.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vet_dra_alfaro.vet_proyect.infrastructure.entity.CategoryEntity;

public interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {
     @Query("SELECT c.name FROM CategoryEntity c")
     List<String> findAllNames();
     
}
