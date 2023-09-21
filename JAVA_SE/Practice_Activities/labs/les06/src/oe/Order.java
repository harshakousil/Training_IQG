package oe;

import java.util.Date;
import java.util.Calendar;
// 3b
import java.text.MessageFormat;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {
    private static int nextOrderId = 100;
    private int id;
    // 3a 3c
    private Date orderDate;
    private String shipMode;
    private double orderTotal;
    private String status;
    private Customer customer;
    private ArrayList items;
    //private OrderItem item1 = new OrderItem();
    //private OrderItem item2 = new OrderItem();


    // 5b

    public Order() {
        id = nextOrderId++;
        orderTotal = 0.0;
        orderDate = new Date();
        items = new ArrayList(10);
    }

    public Order(Date newOrderDate, String newShipMode) {
        this();
        orderDate = newOrderDate;
        shipMode = newShipMode;
    }

    public int getId() {
        return id;
    }
    // 4a more below

    public Date getOrderDate() {
        return orderDate;
    }
    // 4b

    public String getShipDate(char region) {
        int daysToShip = Util.getDaysToShip(region);
        Calendar c = Calendar.getInstance();
        c.setTime(orderDate);
        c.add(Calendar.DAY_OF_MONTH, daysToShip);
        return c.getTime().toString();
    }

    public String getShipMode() {
        return shipMode;
    }

    public void addOrderItem(int productId) {
        OrderItem item = null;
        boolean productFound = false;
        for (int i = 0; i < items.size() && !productFound; i++) {
            item = (OrderItem)items.get(i);
            productFound = (item.getProduct().getId() == productId);
        }
        if (productFound) {
            item.setQuantity(item.getQuantity() + 1);
        } else {
            try {
                Product p = DataMan.findProductById(productId);
                if (p != null) {
                    item = new OrderItem(p);
                    items.add(item);
                }
                item.setLineNbr(items.size());
            }
catch (NotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
                return;
            }
        }
            orderTotal += item.getUnitPrice();
    }

    public double getOrderTotal() {
        //double item1Total, item2Total;

        //item1.setLineNbr(1);
        //item1.setQuantity(2);
        //item1.setUnitPrice(2.95);

        //item2.setLineNbr(2);
        //item2.setQuantity(2);
        //item2.setUnitPrice(3.50);

        //item1Total = item1.getItemTotal();
        //item2Total = item2.getItemTotal();
        // System.out.println("Item 1 Total: " + item1Total);
        // System.out.println("Item 2 Total: " + item2Total);

        //orderTotal = item1Total + item2Total;

        return orderTotal;
    }

    public String getstatus() {
        return status;
    }

    public void setId(int newId) {
        id = newId;
    }


    public void setOrderDate(int d, int m, int y) {
        int daysInMonth = Util.lastDayInMonth(m, y);

        if (d > 0 && d <= daysInMonth) {
            if ((m > 0 && m <= 12) && (y > 0)) {
                // 4c & 4d
                Calendar c = Calendar.getInstance();
                c.set(y, m - 1, d);
                orderDate = c.getTime();
            }
        }
    }

    public void setOrderDate(Date newOrderDate) {
        orderDate = newOrderDate;
    }

    public void setShipMode(String newShipMode) {
        shipMode = newShipMode;
    }

    public void setOrderTotal(double newOrderTotal) {
        orderTotal = newOrderTotal;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer newCustomer) {
        customer = newCustomer;
    }

    public String toString() {

        // For Les08 lab 4a.
        /*return "Order: " + id +
           " Date: " + Util.toDateString(orderDate) +
         " Shipped: " + shipMode +
           " (" + Util.toMoney(getOrderTotal()) + ")";
*/
        Object[] msgVals =
        { new Integer(id), Util.toDateString(orderDate), shipMode,
          Util.toMoney(getOrderTotal()) };
        return MessageFormat.format("Order: {0} Date: {1} Shipped: {2} (Total: {3})",
                                    msgVals);
    }

    public void showOrder() {
        double taxTotal = 0.0;

        System.out.println(toString());
        if (customer != null) {
            System.out.println("Customer: " + customer);
        }
        System.out.println("Items:");
        /*
         * if (item1 != null)
        {
            System.out.println(item1.toString());
        }
        if (item2 != null)
        {
            System.out.println(item2);
        }
           */

        for (Iterator it = items.iterator(); it.hasNext(); ) {
            OrderItem item = (OrderItem)it.next();
            taxTotal += item.getTax();
            System.out.println(item.toString());
        }
        System.out.println("Total tax: " + Util.toMoney(taxTotal));
        System.out.println("Order total including tax: " +
                           Util.toMoney(orderTotal + taxTotal));
        System.out.println();
    }

}
