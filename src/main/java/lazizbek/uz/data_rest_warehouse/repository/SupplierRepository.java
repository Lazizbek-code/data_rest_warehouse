package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Supplier;
import lazizbek.uz.data_rest_warehouse.projection.SupplierWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list",excerptProjection = SupplierWithId.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
