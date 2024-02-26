package myobj;

public class clap {
	
	public static void main(String[] args) {
		
		int per = 75;
		System.out.println(success(per));
	}
			
		public static boolean success(int per) {
			int i = (int)(Math.random() * 100);
			
			if (per < i) {
			
			return true;
		}
			else {
			return false;
			}
		
	}
}


