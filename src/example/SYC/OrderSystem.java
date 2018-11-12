package example.SYC; /**
 * OrderSystem类是一个能默认红高粱点餐的类
 *
 * @author Yan Wenyi
 * @version 1.0
 */

import java.util.Scanner;

public class OrderSystem {
    private Cuisines Y = new Cuisines();

    /**
     * 点餐方法
     */
    public void order() {
        System.out.println("你好哇 \n欢迎来到红高娘 \n今日为您提供：");
        System.out.println("1.米酒 5元\n2.铁板烧 15元\n3.万州烤鱼 3元\n4.汤锅乌鱼片 20元\n5.美蛙鱼头 15元\n6.潮汕牛肉 20元");
        System.out.println("输入你想要的食物前的序号（回车确定）：");
        Y.orderDishes();
        int x = 1;
        while (x == 1) {
            System.out.println("继续点餐请按1 结账请按2");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            if (x == 1) {
                System.out.println();
                Y.addDishes();
            }
        }
    }

    /**
     * 支付方法
     */
    public void pay() {
        System.out.println("请选择您的付款方式：");
        System.out.println("1.一卡通 \n2.支付宝 \n3.微信 \n4.现金");
        System.out.println("请输入付款方式前的序号（回车确定）：");
        Y.payWay();
        System.out.println("******************支付中****************\n");
        System.out.println("支付成功！\n请左边排队领餐 \n欢迎下次光临！");
    }
}


