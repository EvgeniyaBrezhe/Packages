package ua.hillel.controller;

import ua.hillel.dto.ReportDto;
import ua.hillel.dto.ReportTopXDto;
import ua.hillel.model.Store;
import ua.hillel.service.ReportService;
import ua.hillel.view.ReportTopXView;
import ua.hillel.view.ReportView;

public class ReportController {

    public void execute(Store[] stores) {
        ReportService reportService = new ReportService(stores);
        ReportDto report = reportService.build();
        ReportView view = new ReportView();
        view.printDetails(report);
        ReportTopXDto reportTop5 = reportService.buildTopX();
        ReportTopXView viewTop5 = new ReportTopXView();
        viewTop5.printDetails(reportTop5);

    }
}
