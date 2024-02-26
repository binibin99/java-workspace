package myobj.prizedraw;

public class Prize {
	String name;
	int qty;
	double chance;
	
	public Prize(String name, int qty, double chance) {
		this.name = name;
		this.qty = qty;
		this.chance = chance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getChance() {
		return chance;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void minusQty() {
		--qty;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/남은수량:%d/확률%.2f]",
				name, qty, chance);
	}

}
