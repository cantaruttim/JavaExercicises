package StrategyReport.model;

import StrategyReport.Interface.ReportGenerator;

public class ServiceReport {

    private ReportGenerator strategy;

    public ServiceReport() {};
    public ServiceReport(String fileName) {
        // calling the correct report class
    }

    public void setStrategy(ReportGenerator e) {
        this.strategy = e;
    }

}
