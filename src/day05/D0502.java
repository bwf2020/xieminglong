package day05;

import java.util.Scanner;

public class D0502 {

	/*
	 * 2、 通过控制台输入的商品信息，计算价格，比如以下需求 购买手套，它单价5.8 数量3件，再购买袜子，它的单价8.9
	 * 数量5件，折扣：8折，付了：100元，最后得到找零
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// 数量 单价
		int num_1;
		int num_2;
		double price_1 = 5.9;
		double price_2 = 8.9;
		
		System.out.println("**购物清单(请在数量列填写购买数)**");
		System.out.println("物品名称\t单价\t数量");
		System.out.print("手套\t" + price_1 + "\t");
		num_1 = scanner.nextInt();
		System.out.print("袜子\t" + price_2 + "\t");
		num_2 = scanner.nextInt();
		
		// 负数判断
		if (num_1 < 0 || num_2 < 0) {
			System.out.println("购买数量填写错误!");
			scanner.close();
			return;
		}
		
		// 小计 原价
		double count_1 = price_1 * num_1;
		double count_2 = price_2 * num_2;
		double totle_price = count_1 + count_2;
		
		System.out.println("***********消费清单***********");
		System.out.println("物品名称\t单价\t数量\t小计");
		System.out.printf("手套\t%.1f\t%d\t%.1f\n", price_1, num_1, count_1);
		System.out.printf("手套\t%.1f\t%d\t%.1f\n", price_2, num_2, count_2);
		System.out.printf("今日折扣:8折\n原总价:%.2f\n实际付款:%.2f", totle_price, totle_price * 0.8);
		System.out.print("\n付款:");

		// 收款 总价
		double money = scanner.nextDouble();
		totle_price *= 0.8;
		scanner.close();

		// 找零
		if (money >= totle_price) {
			System.out.printf("找零:%.2f", money - totle_price);
		} else {
			System.out.printf("仍需付款:%.2f", totle_price - money);
		}
	}

}
