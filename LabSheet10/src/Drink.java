public class Drink {
	private int type;
	private char size;
	
	public Drink(int type ,char size) {
		this.type = type;
		this.size = size;
	}
	public Drink() { }
	
	public String getTypeName() {
		if (type != 1 || type != 2) { return null; }
		return (type == 1) ? "Hot" : "Cold";
	}
}
