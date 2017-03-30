package com.echovue.shippingservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class ShippingCost {
    @NotEmpty
    private Double cost;

    @NotEmpty
    private Double weight;

    public ShippingCost() {
    }

    public ShippingCost(double weight) {
        this.weight = weight;
        this.cost = 2.35 + (weight * 0.85);
    }

    @JsonProperty
    public Double getCost() {
        return cost;
    }

    @JsonProperty
    public Double getWeight() {
        return weight;
    }
}
