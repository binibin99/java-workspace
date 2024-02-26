package quiz;

import myobj.prizedraw.DrawMachine;
import myobj.prizedraw.Prize;

public class C11_PrizeDraw {
	
	/* 
	  	# 경품 추첨 프로그램을 만들어보세요
	  	
	  	(1) 각 경품들은 한정된 수량이 있으며 이는 경품마다 다를 수 있다
	  	
	  	(2) 각 경품들이 나올 수 있는 확률이 모두 다르며 수량이 모두 소진된 상품은
	  		더 이상 당첨될 수 없다
	  
	 */
	 public static void main(String[] args) {
		 DrawMachine m = new DrawMachine(new Prize[] {
			 new Prize("TV", 30, 0.05),
			 new Prize("컴퓨터", 10, 0.02),
			 new Prize("아이패드", 5, 0.01),
			 new Prize("츄파츕스", 1000, 0.1)
		 });
		 
		 for (int i = 0; i < 200;  ++i) {
			 System.out.println(m.draw());
		 }
		 
	 }
}
