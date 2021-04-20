package day13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class D1301 {
	// 文件目录
	static File file = new File("src/day13/test");

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("=========================");
		while (true) {
			System.out.print("1.创建文件\t2.删除文件\t3.退出\n请输入选项:");
			String select = scanner.nextLine();
			switch (select.trim()) {
			case "1":
				// 创建文件
				createFiles();
				break;
			case "2":
				// 判断文件是否存在
				if (file.exists()) {
					// 存在 , 删除
					deleteFiles(file);
					file.delete();
					System.out.println("\n=========操作成功!==========");
				} else {
					System.out.println("\n=========操作失败!==========");
				}
				break;
			case "3":
				System.out.println("\n=========退出成功!==========");
				scanner.close();
				return;
			default:
				System.out.println("\n=========重新输入!==========");
				break;
			}
		}

	}

	/**
	 * 
	 * @Title: createFiles
	 * @Description: 创建新的文件目录
	 * @return: void
	 */
	public static void createFiles() {
		// 判断是否存在指定路径
		if (!file.exists()) {
			// 创建目录
			File[] dirs = { new File("src/day13/test/1/11"), new File("src/day13/test/1/13"),
					new File("src/day13/test/3") };
			for (File dir : dirs) {
				dir.mkdirs();
			}
			// 创建文件
			File[] files = { new File("src/day13/test/1/11/111.txt"), new File("src/day13/test/1/11/112.pdf"),
					new File("src/day13/test/1/12.txt"), new File("src/day13/test/2.txt"),
					new File("src/day13/test/3/31.txt") };
			for (File f : files) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("\n==========创建成功!==========");
		} else {
			System.out.println("\n=========文件已存在!=========");
		}
	}

	/**
	 * 
	 * @Title: deleteFiles
	 * @Description: 递归删除指定路径下所有文件及文件目录
	 * @parameter @param file 删除文件目录
	 * @return: void
	 */
	public static void deleteFiles(File file) {
		for (File f : file.listFiles()) {
			if (f.isDirectory()) {
				deleteFiles(f);
			}
			f.delete();
		}
	}
}
