package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface SupplierWithId {
    Integer getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
