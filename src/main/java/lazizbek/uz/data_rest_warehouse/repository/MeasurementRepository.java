package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Measurement;
import lazizbek.uz.data_rest_warehouse.projection.MeasurementWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", collectionResourceRel = "list",excerptProjection = MeasurementWithId.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
