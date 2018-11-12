package example.SYC;

/**
 * 这个类是OrderSystem的测试类，测试了点餐方法和支付方法
 *
 * @author Yan Wenyi
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        OrderSystem newOrderStstem = new OrderSystem();
        newOrderStstem.order();
        newOrderStstem.pay();
    }
}

