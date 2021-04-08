package day05;

import java.util.Scanner;

public class D0501 {

	/*
	 * 1、 使用二分查找数据
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 数组
		int[] array = { 1, 3, 5, 6, 8, 21, 45, 87 };
		// 起 止 搜索位
		int start_index = 0;
		int end_index = array.length;
		int search_index = (start_index + end_index) / 2;
		// 结果标识
		boolean flag = false;

		Scanner scanner = new Scanner(System.in);
		System.out.print("想要查找的数字:");
		int num = scanner.nextInt();
		scanner.close();

		while (start_index <= end_index) {
			// 查到
			if (array[search_index] == num) {
				flag = true;
				break;
			} else if (array[search_index] > num) {
				// 小于中间数
				end_index = search_index - 1;
				search_index = (start_index + end_index) / 2;
			} else {
				// 大于中间数
				start_index = search_index + 1;
				search_index = (start_index + end_index) / 2;
				// 数组越界
				if (search_index >= array.length) {
					break;
				}
			}
		}

		if (flag) {
			System.out.println("目标数字位置为:" + search_index);
		} else {
			System.out.println("未查到目标数字");
		}
	}

}
