/**
 * 
 */
import java.util.*;
import java.io.*;
/**
 * @author hamgod 
 * 2021-11-25 
 * Creating Systems 
 * Main.java
 */
public class Main {

	/**
     * Implementation of my LoL system
     * Focus: Champion stats and damage output
     */
	public static void main(String[] args) throws IOException {
		//Kayn
    	EntityStats KaynEntityStats = new EntityStats(921,92,0,57,37,0.74,5,0,345);
    	ChampionStats KaynChampionStats = new ChampionStats(11,15,0,0,0,0,0,0,0);
    	Ability ReapingSlash = new Ability("Reaping Slash",1,244,0,false);
    	Ability BladesReach = new Ability("Blades Reach",1,104,0,false);
    	Ability ShadowStep = new Ability("Shadow Step",0,0,0,false);
    	Ability UmbralTrespass = new Ability("Umbral Trespass",1,169,0,false);
    	Champion Kayn = new Champion("Kayn",KaynEntityStats,KaynChampionStats,ReapingSlash,BladesReach,ShadowStep,UmbralTrespass);;
    	
    	//Random entity
    	int initialHP = 1000;
    	EntityStats entityStats = new EntityStats(initialHP,0,0,10,10,0,0,0,0);
    	Entity entity = new Entity("Entity",entityStats);
    	//Testing
    	while(true) {
    		int option = readInt();
    		//1 = auto, 2 = q, 3 = w, 4 = e, 5 = r, 6 = reset hp, 7 = exit
    		switch(option) {
    		case 1:
    			Kayn.basicAttack(Kayn,entity);
    			break;
    		case 2:
    			Kayn.castQ(Kayn,entity);
    			break;
    		case 3:
    			Kayn.castW(Kayn,entity);
    			break;
    		case 4:
    			Kayn.castE(Kayn,entity);
    			break;
    		case 5:
    			Kayn.castUlt(Kayn,entity);
    			break;
    		case 6:
    			entity.entityStats.setHP(initialHP);
    			break;
    		case 7:
    			System.exit(0);
    		}
    	}
	}
	//Buffered reader for input
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String read() {
        while (st == null || !st.hasMoreTokens()) {
            try { st = new StringTokenizer(br.readLine());
            } catch (IOException e) {}
        }
        return st.nextToken();
    }
    static int readInt() {
        return Integer.parseInt(read());
    }
    static long readLong() {
        return Long.parseLong(read());
    }
    static double readDouble() {
        return Double.parseDouble(read());
    }

}
