/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * Entity.java
 */
public class Entity {
	/**
	   * Attributes
	   */
	private String name;
	private EntityStats entityStats;

	/**
	   * Constructors
	   */
	public Entity() {
		name = "";
		entityStats = new EntityStats();
	}

	public Entity(String s, EntityStats stats) {
		name = s;
		entityStats = stats;
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
	public EntityStats getEntityStats() {
		return entityStats;
	}
	public void setEntityStats(EntityStats e) {
		entityStats = e;
	}
	
	/**
	   * Gets the entity's stats and specifically HP
	   * @return a message displaying the stats and state of an entity
	   */
	public String update() {
		if (entityStats.getHP() <= 0) {
			return name + " is dead lol.";
		} else {
			return name + " has " + entityStats.getHP() + " hp.";
		}

	}
}