package dao;

import com.buschmais.xo.api.Query;
import com.buschmais.xo.api.XOManager;
import com.buschmais.xo.api.XOManagerFactory;
import com.buschmais.xo.api.bootstrap.XO;
import entity.node.Employee;
import entity.node.Product;

import java.util.EnumMap;
import java.util.List;

/**
 * Created by simon on 09/01/17.
 */
public class EmployeeDao {

    public static void main(String[] args){
        XOManagerFactory xmf = XO.createXOManagerFactory("products");
        XOManager xo = xmf.createXOManager();
        Employee emp = xo.create(Employee.class);
        Query.Result<Product> product = emp.getSelledProductsByEmployee("Simon");
    }

}
