package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Input;
import lazizbek.uz.data_rest_warehouse.projection.InputWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "list",excerptProjection = InputWithId.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}
