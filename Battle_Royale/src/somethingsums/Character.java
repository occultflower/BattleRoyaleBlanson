package somethingsums;

import java.util.*;

public class Character {
private String name;

	private String[] department = {"HHS", "IET", "CMAT", "Math", "ELA", "Social Studies", "Science", "Electives", "Other"};
	private int departmentNum;
	private int killCount;

	//List of other abilities
	private int hpScore;
	private int attackScore;
	private int abilityScore;
	private int dexScore;
	private int intScore;
	private int defenseScore;
	private int luckScore;
	private int charismaScore;
	private int mentalScore;

	public Character(String name, int num) {
		this.name = name;

		switch(num) {
			case 1:
				mathClass();
				break;
			case 2: 
				elaClass();
				break;
			case 3:
				ssClass();
				break;
			case 4:
				scienceClass();
				break;
			case 5:
				electiveClass();
				break;
			case 6:
				ietClass();
				break;
			case 7:
				hhsClass();
				break;
			case 8:
				cmatClass();
				break;
			default:
				otherClass();
				break;
		}
	}

	public void mathClass() {
		this.departmentNum = 3;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = 9;
	}

	public void elaClass() {
		this.departmentNum = 4;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = 9;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public void ssClass() {
		this.departmentNum = 5;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = 9;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public void scienceClass() {
		this.departmentNum = 6;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = 9;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public void otherClass() {
		this.departmentNum = 8;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = 9;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public void electiveClass() {
		this.departmentNum = 7;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = 9;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public void hhsClass() {
		this.departmentNum = 0;
		
		//Score
		this.hpScore = 9;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public void ietClass() {
		this.departmentNum = 1;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = 9;
		this.defenseScore = (int)(Math.random() * 8) + 1;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public void cmatClass() {
		this.departmentNum = 2;
		
		//Score
		this.hpScore = (int)(Math.random() * 8) + 1;
		this.attackScore = (int)(Math.random() * 8) + 1;
		this.abilityScore = (int)(Math.random() * 8) + 1;
		this.dexScore = (int)(Math.random() * 8) + 1;
		this.intScore = (int)(Math.random() * 8) + 1;
		this.defenseScore = 9;
		this.luckScore = (int)(Math.random() * 8) + 1;
		this.charismaScore = (int)(Math.random() * 8) + 1;
		this.mentalScore = (int)(Math.random() * 8) + 1;
	}

	public String getRole() {
		return department[this.departmentNum];
	}
	
	public String getName() {
		return this.name;
	}

	public int getHP() {
		return this.hpScore;
	}

	public static void setHP(Character teach, int change) {
		teach.hpScore += change;
	}

	public int getAttack() {
		return this.attackScore;
	}

	public static void setAttack(Character teach, int change) {
		teach.attackScore += change;
	}

	public int getAbility() {
		return this.abilityScore;
	}

	public static void setAbility(Character teach, int change) {
		teach.abilityScore += change;
	}

	public int getDex() {
		return this.dexScore;
	}

	public static void setDex(Character teach, int change) {
		teach.dexScore += change;
	}

	public int getInt() {
		return this.intScore;
	}

	public static void setInt(Character teach, int change) {
		teach.intScore += change;
	}

	public int getDefense() {
		return this.defenseScore;
	}

	public static void setDefense(Character teach, int change) {
		teach.defenseScore += change;
	}

	public int getLuck() {
		return this.luckScore;
	}

	public static void setLuck(Character teach, int change) {
		teach.luckScore += change;
	}

	public int getCharisma() {
		return this.charismaScore;
	}

	public static void setCharisma(Character teach, int change) {
		teach.charismaScore += change;
	}

	public int getMental() {
		return this.mentalScore;
	}

	public static void setMental(Character teach, int change) {
		teach.mentalScore += change;
	}

	public int getKills() {
		return this.killCount;
	}

	public static void addKill(Character teach) {
		teach.killCount++;
	}
}
