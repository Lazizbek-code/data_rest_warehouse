package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Output;
import lazizbek.uz.data_rest_warehouse.projection.OutputWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", collectionResourceRel = "list",excerptProjection = OutputWithId.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
