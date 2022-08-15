package com.etiya.northwind.dataAccess.abstracts;

import com.etiya.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product,Integer>{
}
