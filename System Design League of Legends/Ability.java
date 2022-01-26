/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * Ability.java
 */
public class Ability {
	/**
	   * Attributes
	   */
	private String name;
	private int type;// 1=physical, 2=magic
	private int flatDamage;
	private double scaling;
	private boolean empowered;// able to crit
	
	/**
	   * Constructors
	   */
	public Ability() {
		name = "";
		type = 0;
		flatDamage = 0;
		scaling = 0.0;
		empowered = false;
	}
	public Ability(String s, int t, int fd, double sc, boolean emp) {
		name = s;
		type = t;
		flatDamage = fd;
		scaling = sc;
		empowered = emp;
	}

	/**
	   * Getters and setters
	   */
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	public int getType() {
		return type;
	}
	public void setType(int n) {
		type = n;
	}
	public int getFlatDamage() {
		return flatDamage;
	}
	public void setFlatDamage(int n) {
		flatDamage = n;
	}
	public double getScaling() {
		return scaling;
	}
	public void setScaling(double d) {
		scaling = d;
	}
	public boolean getEmpowered() {
		return empowered;
	}
	public void setEmpowered(boolean b) {
		empowered = b;
	}
}