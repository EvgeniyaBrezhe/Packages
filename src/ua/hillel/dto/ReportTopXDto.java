package ua.hillel.dto;

public class ReportTopXDto {

    private String name;
    private BuyingTopXDto[] data;

    public ReportTopXDto(String name, BuyingTopXDto[] data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public BuyingTopXDto[] getData() {
        return data;
    }
}
