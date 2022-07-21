package ua.hillel.view;

import ua.hillel.dto.BuyingTopXDto;
import ua.hillel.dto.ReportTopXDto;
import ua.hillel.service.ReportService;

public class ReportTopXView {

    public static final String DESCRIPTION = "REPORT TOP " + ReportService.top + "DATA: ";

    public void printDetails(ReportTopXDto report) {
        int dash = 30;
        System.out.println("=".repeat(dash));
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(dash));

        int labelWidth = 20;

        System.out.println("name" + " ".repeat(labelWidth - "name".length()) +
                "count" + " ".repeat(labelWidth - "count".length()));
        System.out.println("=".repeat(dash));

        for (BuyingTopXDto buyingTop5Dto : report.getData()) {
            System.out.println(buyingTop5Dto.getName() + " ".repeat(labelWidth - buyingTop5Dto.getName().length())
                    + buyingTop5Dto.getCount() + " ".repeat(labelWidth - Integer.toString(buyingTop5Dto.getCount()).length()));
            System.out.println("-".repeat(dash));
        }
    }
}