package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryWithId {
    Integer getId();
    String getName();
    Boolean getActive();
    Category getParentCategory();
}
