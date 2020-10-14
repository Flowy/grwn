package com.flowyk.grwn;

import static org.junit.jupiter.api.Assertions.*;

import com.flowyk.grwn.domain.DataAccess;
import com.flowyk.grwn.domain.Price;
import com.flowyk.grwn.domain.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest
public class DataAccessTest {

    @Autowired
    DataAccess dataAccess;

    @Test
    public void insertAndLoad() {
        Product p = new Product("Dog food", new Price(200L), "Food for dogs");
        dataAccess.insertProduct(p);
        Collection<Product> products = dataAccess.loadProducts();
        assertEquals(products.size(), 1);
        assertEquals(products.stream().iterator().next(), p);
    }
}
