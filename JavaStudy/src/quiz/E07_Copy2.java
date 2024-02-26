package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E07_Copy2 {

	// 폴더 이름을 전달하면 해당 폴더 이름에 2를 붙인 새 폴더안에
	// 모든 내용을 복사하는 메서드를 만들어보세요

	public static void main(String[] args) {
		copyDirectory("myfiles");
	}
	
	public static void copyDirectory(File srcDir, File dstDir) {
		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}

		for (File srcFile : srcDir.listFiles()) {
			System.out.println("-------------------------------");
			System.out.println("getPath(): " + srcFile.getPath());
			System.out.println("getName(): " + srcFile.getName());
			
			if (srcFile.isDirectory()) {
				copyDirectory(srcFile, new File(dstDir, srcFile.getName()));
			} else {
				copyFile(srcFile, new File(dstDir, srcFile.getName()));
			}
		}
	}
	

	public static void copyDirectory(String path) {
		copyDirectory(new File(path), new File(path + 2));

		
	}

	public static void copyFile(File srcFile, File dstFile) {

		try (
			FileInputStream in = new FileInputStream(srcFile); 
			FileOutputStream out = new FileOutputStream(dstFile);
		) {
			out.write(in.readAllBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
