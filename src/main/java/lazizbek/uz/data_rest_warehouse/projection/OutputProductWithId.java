package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Output;
import lazizbek.uz.data_rest_warehouse.entity.OutputProduct;
import lazizbek.uz.data_rest_warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface OutputProductWithId {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Output getOutput();
}
