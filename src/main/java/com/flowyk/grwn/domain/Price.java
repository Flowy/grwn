package com.flowyk.grwn.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Price {
    Long value;

    protected Price() {

    }

    public Price(Long value) {
        this.value = value;
    }

}
