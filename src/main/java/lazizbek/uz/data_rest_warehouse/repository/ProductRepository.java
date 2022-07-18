package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Product;
import lazizbek.uz.data_rest_warehouse.projection.ProductWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "list",excerptProjection = ProductWithId.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
