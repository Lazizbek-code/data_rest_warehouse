package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.InputProduct;
import lazizbek.uz.data_rest_warehouse.projection.InputProductWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "list",excerptProjection = InputProductWithId.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
