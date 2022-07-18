package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Client;
import lazizbek.uz.data_rest_warehouse.entity.Currency;
import lazizbek.uz.data_rest_warehouse.entity.Output;
import lazizbek.uz.data_rest_warehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputWithId {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Client getClient();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();
}
