package com.kodillla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements TaxiOrder {
    private final TaxiOrder taxiOrder;  // <--  Dekorowany obiekt zapamiętywany jest w wewnętrznej referencji dekoratora

    public AbstractTaxiOrderDecorator(TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;   // <-- wstrzykiwany dekorowany obiekt
    }

    @Override
    public BigDecimal getCost() {
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {
        return taxiOrder.getDescription();
    }
}
