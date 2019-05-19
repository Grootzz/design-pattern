package designpattern.behavioral.command.stocksell;

public class Client {

    public static void main(String[] args) {

        Stock Stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(Stock);
        SellStock sellStockOrder = new SellStock(Stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
