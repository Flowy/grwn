package com.flowyk.grwn.infrastructure;

import com.flowyk.grwn.domain.DataAccess;
import com.flowyk.grwn.domain.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class PublicInterface {

    @Autowired
    DataAccess dataAccess;

    public Collection<ProductDTO> zoznam(Price cenaMin, Price cenaMax, String nameStartsWith) {

        return Collections.emptyList();
    }
}
