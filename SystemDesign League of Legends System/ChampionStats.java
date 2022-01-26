/**
 * @author Souren
 * 2021-11-25 
 * Creating Systems 
 * ChampionStats.java
 */
public class ChampionStats {
	// Variables
	private int healthRegen;
	private int manaRegen;
	private int lethality;
	private double armorPenetration;
	private int flatMagicPenetration;
	private double magicPenetration;
	private double lifesteal;
	private double physicalVamp;
	private double omnivamp;

	// Default Constructor
	public ChampionStats() {
		healthRegen = 0;
		manaRegen = 0;
		lethality = 0;
		armorPenetration = 0.0;
		flatMagicPenetration = 0;
		magicPenetration = 0.0;
		lifesteal = 0.0;
		physicalVamp = 0.0;
		omnivamp = 0.0;
	}

	// Constructor
	public ChampionStats(int hr, int mr, int lt, double ap, int fmp, double mp, double ls, double pv, double ov) {
		healthRegen = hr;
		manaRegen = mr;
		lethality = lt;
		armorPenetration = ap;
		flatMagicPenetration = fmp;
		magicPenetration = mp;
		lifesteal = ls;
		physicalVamp = pv;
		omnivamp = ov;
	}

	// Getters and Setters
	public int getHR() {
		return healthRegen;
	}

	public void setHR(int n) {
		manaRegen = n;
	}

	public int getLethality() {
		return lethality;
	}

	public void setLethality(int n) {
		lethality = n;
	}

	public double getArmorPenetration() {
		return armorPenetration;
	}

	public void setArmorPenetration(double d) {
		armorPenetration = d;
	}

	public int getFlatMagicPenetration() {
		return flatMagicPenetration;
	}

	public void setFlatMagicPenetration(int n) {
		flatMagicPenetration = n;
	}

	public double getMagicPenetration() {
		return magicPenetration;
	}

	public void setMagicPenetration(double d) {
		magicPenetration = d;
	}

	public double getLS() {
		return lifesteal;
	}

	public void setLS(double d) {
		lifesteal = d;
	}

	public double getPV() {
		return physicalVamp;
	}

	public void setPV(double d) {
		physicalVamp = d;
	}
}