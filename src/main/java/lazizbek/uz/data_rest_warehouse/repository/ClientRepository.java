package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Client;
import lazizbek.uz.data_rest_warehouse.projection.ClientWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", collectionResourceRel = "list",excerptProjection = ClientWithId.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
