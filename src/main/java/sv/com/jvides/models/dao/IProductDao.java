package sv.com.jvides.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.jvides.models.entities.Product;

public interface IProductDao extends CrudRepository<Product, Long> {}
