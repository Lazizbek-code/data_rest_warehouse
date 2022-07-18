package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Input;
import lazizbek.uz.data_rest_warehouse.entity.InputProduct;
import lazizbek.uz.data_rest_warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductWithId {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Date getExpireDate();
    Input getInput();
}
