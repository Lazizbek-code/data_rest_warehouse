package lazizbek.uz.data_rest_warehouse.projection;

import lazizbek.uz.data_rest_warehouse.entity.Users;
import lazizbek.uz.data_rest_warehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Users.class)
public interface UsersWithId {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getUsername();
    boolean getActive();
    List<Warehouse> getWarehouses();
}
