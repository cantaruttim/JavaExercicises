import PurchaseOrder.model.InternationalOrder;
import PurchaseOrder.model.NationalOrder;
import PurchaseOrder.model.OrderProcessor;
import StrategyReport.Reports.CSVReport;
import StrategyReport.Reports.JsonReport;
import StrategyReport.Reports.XMLReport;

public class Main {
    public static void main(String[] args) {

        IO.println("EXERCISE 2");
        IO.println("Strategy Report System");

        String fileName = "dados.csv";

        // file format etx
        String etx = fileName.substring(fileName.length() - 3 );

        switch (etx) {

            case "csv":
                // instantiate java class
                new CSVReport();
                break;
            case "json":
                // instantiate java class
                new JsonReport();
                break;
            case "xml":
                new XMLReport();
                // instantiate java class
                break;

            default:
                IO.println("etx not supported");
                break;
        }

        /*
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