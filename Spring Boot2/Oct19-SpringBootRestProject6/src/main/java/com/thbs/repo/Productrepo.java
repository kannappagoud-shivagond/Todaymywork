package com.thbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thbs.model.Product;

@Repository
public interface Productrepo extends JpaRepository<Product, Integer>{

}
