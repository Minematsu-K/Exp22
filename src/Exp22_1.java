
public class Exp22_1 {

	public static void main(String[] args) {
		Weapon weapon1=new Weapon("はがねのつるぎ",18);
		Weapon weapon2=new Weapon("きのぼう",8);
		
		Hero hero1=new Hero("マサル",12,weapon1);
		Hero hero2=new Hero("マサル",12,weapon2);
		
		hero1.showWeapon();
		System.out.println();
		hero1.attack();
		System.out.println();
		
		hero2.setWeapon(weapon2);
		hero2.showWeapon();
		hero2.attack();
	}

}
