package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Currency;
import lazizbek.uz.data_rest_warehouse.projection.CurrencyWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list",excerptProjection = CurrencyWithId.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
