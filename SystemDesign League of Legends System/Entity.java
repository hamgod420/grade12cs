/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * Entity.java
 */
public class Entity {
	// Variables
	private String name;
	private EntityStats entityStats;

	// Default Constructor
	public Entity() {
		name = "";
		entityStats = new EntityStats();
	}

	// Constructor
	public Entity(String s, EntityStats stats) {
		name = s;
		entityStats = stats;
	}

	// Getters and Setters
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
	// Update function
	public String update() {
		if (entityStats.getHP() <= 0) {
			return name + " is dead lol.";
		} else {
			return name + " has " + entityStats.getHP() + " hp.";
		}

	}
}