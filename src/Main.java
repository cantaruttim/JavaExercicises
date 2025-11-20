import PurchaseOrder.model.InternationalOrder;
import PurchaseOrder.model.NationalOrder;
import PurchaseOrder.model.OrderProcessor;

public class Main {
    public static void main(String[] args) throws Exception {

        IO.println("EXERCISE 2");
        IO.println("Strategy Report System");

        IO.println("================================");
        IO.println("EXERCISE 1");
        IO.println("Purchased Order System");

        OrderProcessor processor = new OrderProcessor();

        processor.addOrder(new NationalOrder(1L, 100.0));
        processor.addOrder(new InternationalOrder(2L, 200.0));

        System.out.println(
                "Total Ordered: " + processor.calculateTotal()
        );
    }
}