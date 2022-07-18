package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Warehouse;
import lazizbek.uz.data_rest_warehouse.projection.WarehouseWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list",excerptProjection = WarehouseWithId.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
