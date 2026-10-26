
public class Exp22_3 {

	public static void main(String[] args) {
		MenuItem menu1=new MenuItem("ハンバーガー",350);
		MenuItem menu2=new MenuItem("ポテト",200);
		
		Order order1=new Order(menu1,2);
		Order order2=new Order(menu2,1);
		
		order1.showOrder();
		System.out.println();
		order2.showOrder();
	}

}
