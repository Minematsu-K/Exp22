
public class MenuItem {
	private String name;
	private int price;
	
	MenuItem(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
}
