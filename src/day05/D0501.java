package day05;

import java.util.Scanner;

public class D0501 {

	/*
	 * 1�� ʹ�ö��ֲ�������
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		int[] array = { 1, 3, 5, 6, 8, 21, 45, 87 };
		// �� ֹ ����λ
		int start_index = 0;
		int end_index = array.length;
		int search_index = (start_index + end_index) / 2;
		// �����ʶ
		boolean flag = false;

		Scanner scanner = new Scanner(System.in);
		System.out.print("��Ҫ���ҵ�����:");
		int num = scanner.nextInt();
		scanner.close();

		while (start_index <= end_index) {
			// �鵽
			if (array[search_index] == num) {
				flag = true;
				break;
			} else if (array[search_index] > num) {
				// С���м���
				end_index = search_index - 1;
				search_index = (start_index + end_index) / 2;
			} else {
				// �����м���
				start_index = search_index + 1;
				search_index = (start_index + end_index) / 2;
				// ����Խ��
				if (search_index >= array.length) {
					break;
				}
			}
		}

		if (flag) {
			System.out.println("Ŀ������λ��Ϊ:" + search_index);
		} else {
			System.out.println("δ�鵽Ŀ������");
		}
	}

}
