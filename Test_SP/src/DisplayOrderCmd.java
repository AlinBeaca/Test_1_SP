public class DisplayOrderCmd{

    private Order order;

    public DisplayOrderCmd(Order order) {

    }

    public void execute() {
        System.out.println(order.getCantitate());
        System.out.println(order.getNume());
        System.out.println(order.getPret());
    }
}
