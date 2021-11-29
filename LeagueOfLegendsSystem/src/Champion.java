/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * Champion.java
 */
public class Champion extends Entity {
	// Variables
	public ChampionStats championStats;
	public Ability qAbility;
	public Ability wAbility;
	public Ability eAbility;
	public Ability ultimate;

	// Default Constructor
	public Champion() {
		super();
		championStats = new ChampionStats();
		qAbility = new Ability();
		wAbility = new Ability();
		eAbility = new Ability();
		ultimate = new Ability();
	}

	// Constructor
	public Champion(String s, EntityStats ent, ChampionStats champStats, Ability q, Ability w, Ability e, Ability ult) {
		super(s, ent);
		championStats = champStats;
		qAbility = q;
		wAbility = w;
		eAbility = e;
		ultimate = ult;
	}

	// Champion functions
	public void basicAttack(Champion champion, Entity entity) {
		int damageDealt = DamageCalculator.calcDamage(entityStats.getAD(), champion, entity, 1);
		entity.entityStats.setHP(entity.entityStats.getHP() - damageDealt);

		System.out.println(
				champion.getName() + " auto attacked " + entity.getName() + " for " + damageDealt + " physical damage");
		System.out.println(entity.update());
	}

	public void castQ(Champion champion, Entity entity) {
		int originalDamage = DamageCalculator.calculateDamageOutput(entityStats, qAbility);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, qAbility.getType());
		entity.entityStats.setHP(entity.entityStats.getHP() - damageDealt);

		String _type = qAbility.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(champion.getName() + " casted " + qAbility.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

	public void castW(Champion champion, Entity entity) {
		int originalDamage = DamageCalculator.calculateDamageOutput(entityStats, wAbility);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, wAbility.getType());
		entity.entityStats.setHP(entity.entityStats.getHP() - damageDealt);

		String _type = wAbility.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(champion.getName() + " casted " + wAbility.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

	public void castE(Champion champion, Entity entity) {
		int originalDamage = DamageCalculator.calculateDamageOutput(entityStats, eAbility);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, eAbility.getType());
		entity.entityStats.setHP(entity.entityStats.getHP() - damageDealt);

		String _type = eAbility.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(champion.getName() + " casted " + eAbility.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

	public void castUlt(Champion champion, Entity entity) {
		int originalDamage = DamageCalculator.calculateDamageOutput(entityStats, ultimate);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, ultimate.getType());
		entity.entityStats.setHP(entity.entityStats.getHP() - damageDealt);

		String _type = ultimate.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(champion.getName() + " casted " + ultimate.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

}