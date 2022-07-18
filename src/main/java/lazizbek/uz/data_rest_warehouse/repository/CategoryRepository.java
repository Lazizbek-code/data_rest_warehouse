package lazizbek.uz.data_rest_warehouse.repository;

import lazizbek.uz.data_rest_warehouse.entity.Category;
import lazizbek.uz.data_rest_warehouse.projection.CategoryWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list",excerptProjection = CategoryWithId.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
