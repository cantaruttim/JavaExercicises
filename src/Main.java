import BankTransfer.model.BankTransfer;
import BankTransfer.model.Deposit;
import PurchaseOrder.model.InternationalOrder;
import PurchaseOrder.model.NationalOrder;
import PurchaseOrder.model.OrderProcessor;
import StrategyReport.Interface.ReportGenerator;
import StrategyReport.Reports.CSVReport;
import StrategyReport.Reports.JsonReport;
import StrategyReport.Reports.XMLReport;
import StrategyReport.model.ServiceReport;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        IO.println("EXERCISE 3");
        IO.println("Bank Transfer");

        Deposit deposit = new Deposit();
        deposit.Processor();

        /*

        IO.println("EXERCISE 2");
        IO.println("Strategy Report System");

        String endFile = ".xml";
        String fileName = "src/resources/exempleFiles/dados" + endFile;
        ServiceReport service = new ServiceReport(fileName);
        ReportGenerator generator = null;

        try {
            String lower = fileName.toLowerCase();

            if (lower.endsWith(".csv")) {
                generator = new CSVReport();

            } else if (lower.endsWith(".json")) {
                generator = new JsonReport();

            } else if (lower.endsWith(".xml")) {
                generator = new XMLReport();

            } else {
                throw new RuntimeException("Extension Not Supported: " + fileName);
            }

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        generator.generateReport(fileName);



        IO.println("================================");
        IO.println("EXERCISE 1");
        IO.println("Purchased Order System");

        OrderProcessor processor = new OrderProcessor();

        processor.addOrder(new NationalOrder(1L, 100.0));
        processor.addOrder(new InternationalOrder(2L, 200.0));

        System.out.println(
                "Total Ordered: " + processor.calculateTotal()
        );

        */
    }
}