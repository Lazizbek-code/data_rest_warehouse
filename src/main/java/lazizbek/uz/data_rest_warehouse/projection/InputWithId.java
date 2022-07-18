package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Currency;
import lazizbek.uz.data_rest_warehouse.entity.Input;
import lazizbek.uz.data_rest_warehouse.entity.Supplier;
import lazizbek.uz.data_rest_warehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputWithId {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    String getCode();
}
