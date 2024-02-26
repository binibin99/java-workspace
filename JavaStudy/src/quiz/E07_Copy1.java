package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class E07_Copy1 {
	
	public static void main(String[] args) {
		copyTextFilesOnly("./myfiles/", "./mytxts/");
		copyImageFilesOnly("./myfiles/", "./myimages/");
	}
	
	// 1. myfiles의 파일들 중 .txt 파일들을 mytxtx 폴더에 복사해보세요
	public static void copyTextFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);
		
		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}
		
		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue;
			}
			String fileName = srcFile.getName();
			// 파일이름에 .이 포함되어 있는 경우에 대비하여
			// .의 위치를 뒤에서부터 찾는 
			// lastIndexOf()를 사용해야 한다
			String ext = fileName
					.substring(fileName.lastIndexOf('.'));
			
			System.out.printf("파일이름은 %s이고 확장자는 %s입니다.\n",
					fileName, ext);
				
			if (ext.equals(".txt")) {
				// 부모 디렉토리와 파일 이름으로 파일 객체 생성
				File dstFile = new File(dstDir, fileName);
				
				FileReader in = null;
				FileWriter out = null;
				
				try {
					 in = new FileReader(srcFile); 
					 out = new FileWriter(dstFile);
					 
					 char[] buff = new char[1024];
					 int len;
					 while ((len = in.read(buff)) != -1) {
						 out.write(buff, 0 , len);
					 }
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {			
						if (in != null) {
							in.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
						} 
						try {
							if (out != null) {
								out.close();	
							}			
						} catch (IOException e) {
							e.printStackTrace();
					}
				}
				
			}
		}
	}		
	
	public static Set<String> IMAGE_EXTENSTIONS = new HashSet<>();
	
	static {
		IMAGE_EXTENSTIONS.add(".jpg");
		IMAGE_EXTENSTIONS.add(".gif");
		IMAGE_EXTENSTIONS.add(".png");
		IMAGE_EXTENSTIONS.add("bmp");
	}
	
	// 2. myfiles의 파일들 중 그림 파일들을 myimages 폴더에 복사해보세요
	public static void copyImageFilesOnly(String src, String dst) {
		File srcDir = new File(src);
		File dstDir = new File(dst);
		
		if (!dstDir.exists()) {
			dstDir.mkdirs();
		}
		
		for (File srcFile : srcDir.listFiles()) {
			if (srcFile.isDirectory()) {
				continue;
			}
			String fileName = srcFile.getName();
			String ext = fileName
					.substring(fileName.lastIndexOf('.'));
			
			if (IMAGE_EXTENSTIONS.contains(ext)) {
				File dstFile = new File(dstDir, fileName);
				
				// 이미지 파일은 바이트 단위로 복사해야 한다
				
				FileInputStream in = null;
				FileOutputStream out = null;
				try {
	
					in = new FileInputStream(srcFile);
					out = new FileOutputStream(dstFile);
					
					out.write(in.readAllBytes());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (in != null) {
							in.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						if (out != null) {
							out.close();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

