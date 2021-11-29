/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * EntityStats.java
 */
public class EntityStats {
	// Variables
	private int health;
	private int attackDamage;
	private int abilityPower;
	private int armor;
	private int magicResist;
	private double attackSpeed;
	private int cdr;
	private int critchance;
	private int movementSpeed;

	// Default Constructor
	public EntityStats() {
		health = 0;
		attackDamage = 0;
		abilityPower = 0;
		armor = 0;
		magicResist = 0;
		attackSpeed = 0.0;
		cdr = 0;
		critchance = 0;
		movementSpeed = 0;
	}

	// Constructor
	public EntityStats(int hp, int ad, int ap, int ar, int mr, double as, int cd, int cr, int ms) {
		health = hp;
		attackDamage = ad;
		abilityPower = ap;
		armor = ar;
		magicResist = mr;
		attackSpeed = as;
		cdr = cd;
		critchance = cr;
		movementSpeed = ms;
	}

	// Getters and Setters
	public int getHP() {
		return health;
	}

	public void setHP(int n) {
		health = n;
	}

	public int getAD() {
		return attackDamage;
	}

	public void setAD(int n) {
		attackDamage = n;
	}

	public int getAP() {
		return abilityPower;
	}

	public void setAP(int n) {
		abilityPower = n;
	}

	public int getAR() {
		return armor;
	}

	public void setAR(int n) {
		armor = n;
	}

	public int getMR() {
		return magicResist;
	}

	public void setMR(int n) {
		magicResist = n;
	}

	public double getAS() {
		return attackSpeed;
	}

	public void setAS(double d) {
		attackSpeed = d;
	}

	public int getCrit() {
		return critchance;
	}

	public void setCrit(int n) {
		critchance = n;
	}

	public int getMS() {
		return movementSpeed;
	}

	public void setMS(int n) {
		movementSpeed = n;
	}
}