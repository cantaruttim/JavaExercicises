package StrategyReport.Reports;

import StrategyReport.Interface.ReportGenerator;

public class XMLReport implements ReportGenerator {

    @Override
    public void generateReport(String fileName) {
        // lógica para ler JSON aqui
        System.out.println("Processing JSON file: " + fileName);
    }
}
