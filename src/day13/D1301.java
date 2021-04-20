package day13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class D1301 {
	// �ļ�Ŀ¼
	static File file = new File("src/day13/test");

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("=========================");
		while (true) {
			System.out.print("1.�����ļ�\t2.ɾ���ļ�\t3.�˳�\n������ѡ��:");
			String select = scanner.nextLine();
			switch (select.trim()) {
			case "1":
				// �����ļ�
				createFiles();
				break;
			case "2":
				// �ж��ļ��Ƿ����
				if (file.exists()) {
					// ���� , ɾ��
					deleteFiles(file);
					file.delete();
					System.out.println("\n=========�����ɹ�!==========");
				} else {
					System.out.println("\n=========����ʧ��!==========");
				}
				break;
			case "3":
				System.out.println("\n=========�˳��ɹ�!==========");
				scanner.close();
				return;
			default:
				System.out.println("\n=========��������!==========");
				break;
			}
		}

	}

	/**
	 * 
	 * @Title: createFiles
	 * @Description: �����µ��ļ�Ŀ¼
	 * @return: void
	 */
	public static void createFiles() {
		// �ж��Ƿ����ָ��·��
		if (!file.exists()) {
			// ����Ŀ¼
			File[] dirs = { new File("src/day13/test/1/11"), new File("src/day13/test/1/13"),
					new File("src/day13/test/3") };
			for (File dir : dirs) {
				dir.mkdirs();
			}
			// �����ļ�
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

			System.out.println("\n==========�����ɹ�!==========");
		} else {
			System.out.println("\n=========�ļ��Ѵ���!=========");
		}
	}

	/**
	 * 
	 * @Title: deleteFiles
	 * @Description: �ݹ�ɾ��ָ��·���������ļ����ļ�Ŀ¼
	 * @parameter @param file ɾ���ļ�Ŀ¼
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
