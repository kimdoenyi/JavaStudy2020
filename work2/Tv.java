package work2;

public class Tv {
	private String name;
	private int price;
	private String description;
	
	public Tv() {
		super();
	}

	public Tv(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + "\t\t" + price + "\t\t" + description;
	}
	
	
	
}
