package day05;

import java.util.Scanner;

public class D0502 {

	/*
	 * 2�� ͨ������̨�������Ʒ��Ϣ������۸񣬱����������� �������ף�������5.8 ����3�����ٹ������ӣ����ĵ���8.9
	 * ����5�����ۿۣ�8�ۣ����ˣ�100Ԫ�����õ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// ���� ����
		int num_1;
		int num_2;
		double price_1 = 5.9;
		double price_2 = 8.9;
		
		System.out.println("**�����嵥(������������д������)**");
		System.out.println("��Ʒ����\t����\t����");
		System.out.print("����\t" + price_1 + "\t");
		num_1 = scanner.nextInt();
		System.out.print("����\t" + price_2 + "\t");
		num_2 = scanner.nextInt();
		
		// �����ж�
		if (num_1 < 0 || num_2 < 0) {
			System.out.println("����������д����!");
			scanner.close();
			return;
		}
		
		// С�� ԭ��
		double count_1 = price_1 * num_1;
		double count_2 = price_2 * num_2;
		double totle_price = count_1 + count_2;
		
		System.out.println("***********�����嵥***********");
		System.out.println("��Ʒ����\t����\t����\tС��");
		System.out.printf("����\t%.1f\t%d\t%.1f\n", price_1, num_1, count_1);
		System.out.printf("����\t%.1f\t%d\t%.1f\n", price_2, num_2, count_2);
		System.out.printf("�����ۿ�:8��\nԭ�ܼ�:%.2f\nʵ�ʸ���:%.2f", totle_price, totle_price * 0.8);
		System.out.print("\n����:");

		// �տ� �ܼ�
		double money = scanner.nextDouble();
		totle_price *= 0.8;
		scanner.close();

		// ����
		if (money >= totle_price) {
			System.out.printf("����:%.2f", money - totle_price);
		} else {
			System.out.printf("���踶��:%.2f", totle_price - money);
		}
	}

}
