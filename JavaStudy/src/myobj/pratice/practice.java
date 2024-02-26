package myobj.pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		System.out.println("복사를 시작합니다.");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("복사하는 파일의 경로를 입력해주세요 > ");
			String a = sc.next();
			System.out.print("\n복사하는 파일을 옮길 경로를 입력해주세요 > ");
			String b = sc.next();
			copytxt(a);

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 파일명과 확장자명은 입력하지 말아주세요.");

		}
	}

	public static void copytxt(String src) {

		File srcDir = new File(src);
		File dstDir = new File(src + 2);

		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}

		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				System.out.println(srcFile.getName() + ": dir");
			} else {
				copyFile(srcFile,new File(src +2), srcFile.getName()));
			}


				try (FileInputStream in = new FileInputStream(srcFile);
						FileOutputStream out = new FileOutputStream(dstFile);) {

					out.write(in.readAllBytes());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();

					System.out.println("복사가 완료되었습니다.");
				}
			}
		}
	}


//C:/JavaFullStack_SB/java-workspace/JavaStudy/myfiles/emails.txt/
//C:/JavaFullStack_SB/java-workspace/JavaStudy/mytxts/emails2.txt/