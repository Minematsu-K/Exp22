
public class Hero {
	private Weapon weapon;
	private String name;
	private int attackPower;
	
	Hero(Weapon weapon){
		this.weapon=weapon;
	}
	
	Hero(String name, int attackPower, Weapon weapon){
		this.name=name;
		this.attackPower=attackPower;
		this.weapon=weapon;
	}
	
	public void showWeapon() {
		System.out.println("武器名："+this.weapon.getName());
		System.out.println("攻撃力："+this.weapon.getAttackPouwer());
	}
	
	public void attack() {
		int damage=this.attackPower+this.weapon.getAttackPouwer();
		System.out.println(this.name+"は"+this.weapon.getName()+"でこうげき！");
		System.out.println("てきに"+damage+"ダメージあたえた！");
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon=weapon;
	}
}
