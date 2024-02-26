import java.io.File;

public class E07_File {
	
	/*
	 	# java.io.File
	 	
	 	- 파일에 대한 정보를 담을 수 있는 클래스
	 	- 인스턴스를 생성할 때 실제 파일로부터 정보를 받아온다
	 	- 해당 인스턴스에 담긴 정보를 통해 실제 파일을 직접 제어할 수 있다
	 	
	 	# 파일 시스템
	 	
	 	- 하드디스크에 저장된 데이터들을 손쉽게 관리할 수 있도록 설정한 구역
	 	- 파일 스시템의 내용을 디렉토리 구조로 편리하게 
	 	  볼 수 있는 프로그램이 탐색기이다
	 */
	public static void main(String[] args) {
		// 상대경로 - 현재 위치부터 시작하는 경로
		//			현재 위치가 어디냐에 따라 가리키는 곳이 달라질 수 있다
		File f1 = new File("./myfiles/test2.txt");
		File f2 = new File("./myfiles/");
		File f3 = new File("/JavaFullStack_SB/"); // 현재 드라이브에 따라 달라지는 경로
		
		// 절대경로 - 뿌리부터 시작하는 경로
		// 			현재 위치에 영향을 받지 않는다
		File f4 = new File("C:/JavaFullStack_SB/java-workspace/"
				+ "JavaStudy/src/A00_Hello.java/");
		File f5 = new File("C:/Practice/");
		
		// isDirectory() : 해당 파일 인스턴스가 디렉토리인가?
		System.out.println(f1.isDirectory());
		System.out.println(f2.isDirectory());
		System.out.println(f3.isDirectory());
		System.out.println(f4.isDirectory());
		
		// isFile() : 해당 파일 인스턴스가 파일인가?
		System.out.println("--------------");
		System.out.println(f1.isFile());
		System.out.println(f1.isFile());
		System.out.println(f1.isFile());
		System.out.println(f1.isFile());
		
		// isAbsolute() : 해당 파일의 경로가 절대 경로인가?
		System.out.println("----------------");
		System.out.println(f1.isAbsolute());
		System.out.println(f2.isAbsolute());
		System.out.println(f3.isAbsolute());
		System.out.println(f4.isAbsolute());
		
		// exists() : 해당 경로에 파일이 실제로 존재하는가?
		System.out.println("----------------");
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		System.out.println(f4.exists());
		System.out.println(f5.exists());
		
		// mkdir() : 해당 경로에 폴더를 생성한다. 폴더 생성 성공 여부를 반환한다.
		if (!f5.exists()) {
			f5.mkdir();
			System.out.println("폴더를 생성했습니다!");
		}
		
		// mkdirs() : 해당 경로에 필요한 모든 폴더를 생성한다
		File f6 = new File("C:/Practice/images/fruits/apple/");
		
		
		System.out.println("성공했나? " + f6.mkdirs());
		//list() : 해당 디렉토리 내부의 파일목록을 String[] 로 반환한다
	      
	      File f7 = new File("C:/JavaFullStack_SB/java-workspace/JavaStudy/src/");
	      String [] files = f7.list();
	      
	      System.out.println("### src 폴더 ###");
	      for(String f : files) {
	         System.out.println(f);
	      }
	      
	      //listFiles() : 해당 디렉토리 내부의 파일들을 File[] 로 반환한다
	      
	      File[] files2 = f7.listFiles();
	      
	      for( File f : files2) {
	         System.out.println(f);
	         System.out.println(":" + f.isDirectory());
	      }
	}

}
