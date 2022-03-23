public class App {
    void printOwing() {
        Enumeration e = _orders.elements();
        double outstanding = 0.0;
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");

        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        System.out.println ("name:" + _name);
        System.out.println ("amount" + outstanding);
    }
}