package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Category;
import lazizbek.uz.data_rest_warehouse.entity.Measurement;
import lazizbek.uz.data_rest_warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductWithId {
    Integer getId();
    String getName();
    Category getCategory();
    String getCode();
    Boolean getActive();
    Measurement getMeasurement();
}
