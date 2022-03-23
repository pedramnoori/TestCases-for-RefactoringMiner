void printOwing() {
        Enumeration e = _orders.elements(); double outstanding = 0.0;
        printBanner();
// calculate outstanding while (e.hasMoreElements()) {
        Order each = (Order) e.nextElement();
        outstanding += each.getAmount(); }
        printDetails(outstanding);
        }

        void printDetails (double outstanding) {
    System.out.println ("name:" + _name);
    System.out.println ("amount" + outstanding);
        }