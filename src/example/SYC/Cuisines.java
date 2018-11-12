package example.SYC; /**
 * Cuisines类是OrderSystem的聚合类，提供了几个对OrderSystem的辅助方法
 *
 * @author Yan Wenyi
 * @version 1.0
 */

import java.util.Scanner;

public class Cuisines {
    private int ordered;
    private int price;

    /**
     * 这个方法用来打印用户已点菜品，并计算价格
     */
    public void orderDishes() {
        Scanner input = new Scanner(System.in);
        ordered = input.nextInt();
        System.out.print("oh,");
        switch (ordered) {
            case 1:
                System.out.println("一杯米酒 5元");
                price = 5;
                break;
            case 2:
                System.out.println("一坨铁板烧 15元");
                price = 15;
                break;
            case 3:
                System.out.println("一打万州烤鱼 3元");
                price = 3;
                break;
            case 4:
                System.out.println("一桶汤锅乌鱼片 20元");
                price = 20;
                break;
            case 5:
                System.out.println("一缸美蛙鱼头 15元");
                price = 15;
                break;
            case 6:
                System.out.println("一份潮汕牛肉 20元");
                price = 20;
                break;
        }
    }

    /**
     * 这个方法用来使用户选择支付方式
     */
    public void payWay() {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        switch (y) {
            case 1:
                System.out.println("你选择一卡通支付 \n请刷卡\n");
                break;
            case 2:
                System.out.println("你选择了微信支付 \n请出示付款码\n");
                break;
            case 3:
                System.out.println("你选择了支付宝支付 \n请出示付款码\n");
                break;
            case 4:
                System.out.println("oh , 给钱吧兄die\n");
                break;
        }
    }

    /**
     * 这个方法用来使用户增添菜品，并添加进总价格
     */
    public void addDishes() {
        System.out.println("请输入你还想要的食物序号：");
        Scanner input = new Scanner(System.in);
        ordered = input.nextInt();
        switch (ordered) {
            case 1:
                System.out.println("你又点了一杯米酒 5元");
                price += 5;
                break;
            case 2:
                System.out.println("你又点了一坨铁板烧 15元");
                price += 15;
                break;
            case 3:
                System.out.println("你又点了一打万州烤鱼 3元");
                price += 3;
                break;
            case 4:
                System.out.println("你又点了一桶汤锅乌鱼片  20元");
                price += 20;
                break;
            case 5:
                System.out.println("你又点了一缸美蛙鱼头 15元");
                price += 15;
                break;
            case 6:
                System.out.println("你又点了一份潮汕牛肉 20元");
                price += 20;
                break;
        }
        System.out.println("你需要支付" + price + "元");
    }
}


