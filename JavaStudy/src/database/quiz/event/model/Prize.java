package database.quiz.event.model;

public class Prize {
	
	int prize_id;
	String prize_name;
	Double prize_rate;
	int remain_qty;
	int init_qty;
	
	public Prize(int prize_id, String prize_name, double prize_rate,
			int remain_qty, int init_qty) {
		this.prize_id = prize_id;
		this.prize_name = prize_name;
		this.prize_rate = prize_rate;
		this.remain_qty = remain_qty;
		this.init_qty = init_qty;
	}
	// 우클릭 -> Source -> Generate Getters and Setters로
	// 각 필드에 대한 GEtter 또는 Setter로 자동 생성 할 수 있다
	public int getInit_qty() {
		return init_qty;
	}
	
	public void setRemain_qty(int remain_qty) {
		this.remain_qty = remain_qty;
	}
	
	public int getPrize_id() {
		return prize_id;
	}
	
	public String getPrize_name() {
		return prize_name;
	}
	
	public Double getPrize_rate() {
		return prize_rate;
	}
	
	public int getRemain_qty() {
		return remain_qty;
	}
	
	@Override
	public String toString() {
		return String.format("%s[%d개남음]", prize_name, remain_qty);
	}

}
