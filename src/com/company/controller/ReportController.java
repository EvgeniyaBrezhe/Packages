package com.company.controller;

import com.company.dto.ReportDto;
import com.company.dto.ReportTopXDto;
import com.company.model.Store;
import com.company.service.ReportService;
import com.company.view.ReportTopXView;
import com.company.view.ReportView;

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
