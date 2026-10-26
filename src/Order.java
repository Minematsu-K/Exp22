
public class Order {
	private MenuItem item;
	private int quantity;
	
	Order(MenuItem item,int quantity){
		this.item=item;
		this.quantity=quantity;
	}
	
	public int calculateTotal() {
		return this.item.getPrice()*this.quantity;
	}
	
	public void showOrder() {
		System.out.println("商品名："+this.item.getName());
		System.out.println("注文個数："+this.quantity+"個");
		System.out.println("合計金額："+this.calculateTotal()+"円");
	}
}
