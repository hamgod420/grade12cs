/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * Champion.java
 */
public class Champion extends Entity {
	/**
	   * Attributes
	   */
	private ChampionStats championStats;
	private Ability qAbility;
	private Ability wAbility;
	private Ability eAbility;
	private Ability ultimate;

	/**
	   * Constructors
	   */
	public Champion() {
		super();
		championStats = new ChampionStats();
		qAbility = new Ability();
		wAbility = new Ability();
		eAbility = new Ability();
		ultimate = new Ability();
	}
	public Champion(String s, EntityStats ent, ChampionStats champStats, Ability q, Ability w, Ability e, Ability ult) {
		super(s, ent);
		championStats = champStats;
		qAbility = q;
		wAbility = w;
		eAbility = e;
		ultimate = ult;
	}
	
	/**
	   * Getters and setters
	   */
	public ChampionStats getChampionStats() {
		return championStats;
	}
	public void setChampionStats(ChampionStats cstats) {
		championStats = cstats;
	}

	/**
	   * Champion performs a basic attack on an entity
	   * @param entity	Can be any entity
	   */
	public void basicAttack(Entity entity) {
		Champion champion = new Champion();
		int damageDealt = DamageCalculator.calcDamage(getEntityStats().getAD(), champion, entity, 1);
		entity.getEntityStats().setHP(entity.getEntityStats().getHP() - damageDealt);

		System.out.println(
				getName() + " auto attacked " + entity.getName() + " for " + damageDealt + " physical damage");
		System.out.println(entity.update());
	}

	/**
	   * Champion performs its Q ability on an entity
	   * @param entity 	Can be any entity
	   */
	public void castQ(Entity entity) {
		Champion champion = new Champion();
		int originalDamage = DamageCalculator.calculateDamageOutput(getEntityStats(), qAbility);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, qAbility.getType());
		entity.getEntityStats().setHP(entity.getEntityStats().getHP() - damageDealt);

		String _type = qAbility.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(getName() + " casted " + qAbility.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

	/**
	   * Champion performs its W ability on an entity
	   * @param entity 	Can be any entity
	   */
	public void castW(Entity entity) {
		Champion champion = new Champion();
		int originalDamage = DamageCalculator.calculateDamageOutput(getEntityStats(), wAbility);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, wAbility.getType());
		entity.getEntityStats().setHP(entity.getEntityStats().getHP() - damageDealt);

		String _type = wAbility.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(getName() + " casted " + wAbility.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

	/**
	   * Champion performs its E ability on an entity
	   * @param entity 	Can be any entity
	   */
	public void castE(Entity entity) {
		Champion champion = new Champion();
		int originalDamage = DamageCalculator.calculateDamageOutput(getEntityStats(), eAbility);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, eAbility.getType());
		entity.getEntityStats().setHP(entity.getEntityStats().getHP() - damageDealt);

		String _type = eAbility.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(getName() + " casted " + eAbility.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

	/**
	   * Champion performs its ultimate ability on an entity
	   * @param entity 	Can be any entity
	   */
	public void castUlt(Entity entity) {
		Champion champion = new Champion();
		int originalDamage = DamageCalculator.calculateDamageOutput(getEntityStats(), ultimate);
		int damageDealt = DamageCalculator.calcDamage(originalDamage, champion, entity, ultimate.getType());
		entity.getEntityStats().setHP(entity.getEntityStats().getHP() - damageDealt);

		String _type = ultimate.getType() == 1 ? "physical damage" : "magical damage";
		System.out.println(getName() + " casted " + ultimate.getName() + " on " + entity.getName() + " for "
				+ damageDealt + " " + _type);
		System.out.println(entity.update());
	}

}