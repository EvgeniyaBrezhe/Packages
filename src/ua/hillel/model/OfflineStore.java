package ua.hillel.model;

import ua.hillel.model.product.Buying;

public class OfflineStore extends Store {

    private String address;

    public OfflineStore(String name, Buying[] sales, String address) {
        super(name, sales);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
