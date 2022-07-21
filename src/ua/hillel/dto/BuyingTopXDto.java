package ua.hillel.dto;

public class BuyingTopXDto {

    private String name;
    private int count;

    public BuyingTopXDto(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}

