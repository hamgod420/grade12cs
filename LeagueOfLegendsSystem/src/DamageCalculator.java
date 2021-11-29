/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * DamageCalculator.java
 * 
 * Uniquely created by me to assist the program with damage calculations
 */
public class DamageCalculator {
	// Calculates initial damage from entity's stats
	public static int calculateDamageOutput(EntityStats entityStats, Ability ability) {
		int damageOutput = 0;
		if (ability.getType() == 1) {
			damageOutput = (int) (ability.getFlatDamage() + entityStats.getAD() * ability.getScaling());
			if (ability.getEmpowered() == true) {
				int rand = (int) (Math.random() * (100));
				if (rand <= entityStats.getCrit()) {
					damageOutput *= 2;
				}
			}
		} else if (ability.getType() == 2) {
			damageOutput = (int) (ability.getFlatDamage() + entityStats.getAP() * ability.getScaling());
		}
		return damageOutput;
	}

	// Calculates damage applied to victim
	public static int calcDamage(int initialDamage, Champion champion, Entity victim, int type) {
		// Uses League of Legend's armor and magic resist calculations system to
		// determine damage
		if (type == 1) {
			int flatpen = champion.championStats.getLethality();
			// int flatpen = 0;
			double ARpen = champion.championStats.getArmorPenetration();
			// double ARpen = 0.0;
			double victimAR = victim.entityStats.getAR() - (victim.entityStats.getAR() * ARpen) - flatpen;
			double reducedDamage = 0;
			if (victimAR >= 0) {
				reducedDamage = initialDamage * (100 / (100 + victimAR));
			} else {
				reducedDamage = initialDamage * (2 - (100 / (100 - victimAR)));
			}
			return (int) (reducedDamage);
		} else {
			int flatpen = champion.championStats.getFlatMagicPenetration();
			double MRpen = champion.championStats.getMagicPenetration();
			double victimMR = victim.entityStats.getMR() - (victim.entityStats.getMR() * MRpen) - flatpen;
			double reducedDamage;
			if (victimMR >= 0) {
				reducedDamage = initialDamage * (100 / (100 + victimMR));
			} else {
				reducedDamage = initialDamage * (2 - (100 / (100 - victimMR)));
			}
			return (int) (initialDamage - reducedDamage);
		}
	}
}