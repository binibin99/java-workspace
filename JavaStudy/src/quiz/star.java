package quiz;

public class star {

	
	
	public static void main(String[] args) {
		
		String star   = "★★★★★★★★★";
		String star_2 = "★★★★★★★";
		String star_3 = "★★★★★";
		String star_4 = "★★★";
		String star_5 = "★";
		
		System.out.printf("%s\n %7s\n %6s\n %5s\n %4s"
				, star, star_2, star_3, star_4, star_5);
		
		// 가장 똑똑한 방법
		String s = "\n*********\n"
				+  " *******\n"
				+  "  ***** \n"
				+  "   ***  \n"
				+  "    *   \n";
				
		System.out.printf(s);	
		
		
		
	
	
	
	
		
  
  }
}