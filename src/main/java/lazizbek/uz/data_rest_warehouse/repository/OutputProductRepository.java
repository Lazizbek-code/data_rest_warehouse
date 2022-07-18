package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.OutputProduct;
import lazizbek.uz.data_rest_warehouse.projection.OutputProductWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list",excerptProjection = OutputProductWithId.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
