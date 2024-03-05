package somethingsums;

import java.util.*;

public class Blanson extends Character {
	
	//Keeps a list of all the teachers that are alive in the royale
	static ArrayList<Blanson> teachers = new ArrayList<Blanson>();
	//List of all the teacher names
	public static String[] names = {"Anderson", "Caldwell", "Cao", "Clark", "De Leon", "Duong", "Fields", "Gonzalez", "Lefkowitz", "Meier", "Borja", "Callies", "Canales", "Maceira", "McCluskey", "Noel", "Posada", "Chambers", 
			"Gardner", "Gehl", "McNamee", "Harvatine", "Jackson", "Salazar", "Valdez", "Yonan", "Crier", "Diaz", "Garcia", "Hayles", "Murphy", "Nales-Torres", "Ross", "Taylor", "Toner", "Alvarado", "Brink", "Felder", "Gomez", 
			"Kiser", "Alonjang", "Arriaga", "Beason", "Bingham", "Jenkins", "Maldonado", "Valentine", "Young", "Alexander", "Miller", "Crull", "Lovatos", "Scheuer", "Arriaga", "Britt", "Jones", "Lascano", "Rankin", "White"};
	
	public Blanson(String nam, int num) {
		super(nam, num);
	}
	
	//Creates the list of objects
	public static void createObjects() {
		for (int i = 0; i < names.length; i++) {
			if(i < 10) {
				teachers.add(new Blanson(names[i], 1)); //Math
			} 
			
			else if (i < 17) {
				teachers.add(new Blanson(names[i], 2)); //ELA
			}
			
			else if (i < 26) {
				teachers.add(new Blanson(names[i], 3)); //Social Studies
			}
			
			else if (i < 35) {
				teachers.add(new Blanson(names[i], 4)); //Science
			}
			
			else if (i < 40) {
				teachers.add(new Blanson(names[i], 5)); //Electives
			}
			
			else if (i < 48) {
				teachers.add(new Blanson(names[i], 6)); //IET
			}
			
			else if (i < 53) {
				teachers.add(new Blanson(names[i], 7)); //HHS
			}
			
			else if (i < 59) {
				teachers.add(new Blanson(names[i], 8)); //CMAT
			}
			
			else {
				teachers.add(new Blanson(names[i], 0)); //CMAT
			}
		}
	}
	
	//SOLO EVENTS
	public static void kitkat(Blanson teach, int num) {
		System.out.println(teach.getName() + " ate a kit-kat and gained +1 HP!");
		setHP(teach, 1);
	}

	public static void dysentary(Blanson teach, int num) {
		System.out.println(teach.getName() + " died of dysentary...");
		teachers.remove(num);
	}

	public static void boulder(Blanson teach, int num) {
		System.out.println("A boulder fell on " + teach.getName());
		teachers.remove(num);
	}

	public static void arrest(Blanson teach, int num) {
		System.out.println("Oh no! The cops pulled up and arrested " + teach.getName());
		teachers.remove(num);
	}

	public static void fellOutOfMap(Blanson teach, int num) {
		System.out.println("What the- " + teach.getName().toUpperCase() + " FELL OUT THE MAP AND DIED!");
		teachers.remove(num);
	}

	public static void lightningStrike(Blanson teach, int num) {
		setHP(teach, -5);

		if (teach.getHP() <= 0) {
			System.out.println(teach.getName() + " got struck by lightning and died");
			teachers.remove(num);
		}

		else {
			System.out.println(teach.getName() + " got struck by lightning and survived?");
		}
	}

	public static void stinky(Blanson teach, int num) {
		System.out.println(teach.getName() + " STINKS! -1 in charisma AND mental");
		setMental(teach, -1);
		setCharisma(teach, -1);
	}

	public static void noMeds(Blanson teach, int num) {
		setMental(teach, -3);
		setHP(teach, -2);

		if (teach.getHP() <= 0) {
			System.out.println(teach.getName() + " didn't take their meds and died...");
			teachers.remove(num);
		}

		else if (teach.getMental() <= 0) {
			System.out.println(teach.getName() + " didn't take their meds and went crazy... then died.");
			teachers.remove(num);
		}

		else {
			System.out.println(teach.getName() + " didn't take their meds.");
		}
	}

	public static void epilepsy(Blanson teach, int num) {
		System.out.println(teach.getName() + " died from epilepsy.");
		teachers.remove(num);
	}

	public static void crazy(Blanson teach, int num) {
		System.out.println(teach.getName() + " has gone crazy");
		setMental(teach, -5);
		setAbility(teach, 3);
		setAttack(teach, 3);
		setDex(teach, 1);
		setInt(teach, -2);
		teachers.remove(num);
	}

	public static void salad(Blanson teach, int num) {
		setHP(teach, -2);
		setDefense(teach, -2);
		setLuck(teach, 1);

		if (teach.getHP() <= 0) {
			System.out.println(teach.getName() + " got food poisoning from the salad they found in the trash and died...");
			teachers.remove(num);
		}

		else {
			System.out.println(teach.getName() + " got food poisoning from salad. Luckily they didn't die... (gained +1 in luck)");
		}
	}

	public static void pacMan(Blanson teach, int num) {
		System.out.println(teach.getName() + " got eaten by Pac-Man.");
		teachers.remove(num);
	}

	public static void voices(Blanson teach, int num) {
		System.out.println(teach.getName() + " has started to hear voices");
		setMental(teach, -2);
	}

	public static void cancelled(Blanson teach, int num) {
		System.out.println(teach.getName() + " got cancelled");
		setMental(teach, -2);
		setCharisma(teach, -4);
	}

	public static void acid(Blanson teach, int num) {
		System.out.println(teach.getName() + " accidentally drank acid.");
		teachers.remove(num);
	}

	public static void heartbreak(Blanson teach, int num) {
		System.out.println(teach.getName() + " is heartbroken </3");
		setLuck(teach, -2);
		setMental(teach, -1);
	}

	public static void isekai(Blanson teach, int num) {
		System.out.println(teach.getName() + " got teleported to another world.");
		teachers.remove(num);
	}

	public static void depression(Blanson teach, int num) {
		System.out.println(teach.getName() + " is depressed.");
		setAttack(teach, -2);
		setDefense(teach, -2);
		setAbility(teach, -2);
		setCharisma(teach, -2);
		setDex(teach, -2);
		setMental(teach, -2);
	}

	public static void hunger(Blanson teach, int num) {
		setHP(teach, -1);

		if (teach.getHP() <= 0) {
			System.out.println(teach.getName() + " has died of hunger");
			teachers.remove(num);
		}

		else {
			System.out.println(teach.getName() + " has not eaten for a while.");
		}
	}

	public static void robot(Blanson teach, int num) {
		System.out.println(teach.getName() + " has built a robot from scratch!");
		setAttack(teach, 5);
	}

	public static void truck(Blanson teach, int num) {
		System.out.println(teach.getName() + " got hit by truck-kun but they didn't go to another world.");
		teachers.remove(num);
	}

	public static void cia(Blanson teach, int num) {
		System.out.println(teach.getName() + " got snatched up by the CIA");
		teachers.remove(num);
	}

	public static void pizza(Blanson teach, int num) {
		System.out.println(teach.getName() + " found some pizza!");
		setHP(teach, 1);
	}

	public static void missing(Blanson teach, int num) {
		System.out.println(teach.getName() + " fell through a hole and went missing");
		teachers.remove(num);
	}

	public static void meditation(Blanson teach, int num) {
		System.out.println(teach.getName() + " meditated and acheived Nirvana.");
		setCharisma(teach, 2);
		setInt(teach, 2);
		setMental(teach, 3);
		setDex(teach, 1);
	}

	public static void base(Blanson teach, int num) {
		System.out.println(teach.getName() + " set up a base!");
		setDefense(teach, 5);
	}

	public static void spear(Blanson teach, int num) {
		System.out.println(teach.getName() + " crafted a spear.");
		setAttack(teach, 2);
	}

	public static void art(Blanson teach, int num) {
		System.out.println(teach.getName() + " started doing art.");
		setLuck(teach, 1);
		setInt(teach, 1);
		setMental(teach, 1);
	}

	public static void exercise(Blanson teach, int num) {
		System.out.println(teach.getName() + " started exercising.");
		setAttack(teach, 1);
		setDefense(teach, 1);
		setDex(teach, 1);
	}

	public static void reading(Blanson teach, int num) {
		System.out.println(teach.getName() + " found a book and started reading.");
		setInt(teach, 1);
		setMental(teach, 1);
	}

	public static void kill(Blanson teach, int num) {
		System.out.println(teach.getName() + " killed an animal for food.");
		setHP(teach, 1);
	}

	//DUO EVENTS
	public static void forklift(Blanson teach1, int num1, Blanson teach2, int num2) {
		System.out.println(teach1.getName() + " ran over " + teach2.getName() + " with a forklift?");
		teachers.remove(num2);
		addKill(teach1);
	}

	public static void onePunch(Blanson teach1, int num1, Blanson teach2, int num2) {

		if (teach1.getAttack() > teach2.getAttack()) {
			System.out.println(teach1.getName() + " killed " + teach2.getName() + " with one punch.");
			teachers.remove(num2);
			addKill(teach1);
		}

		else {
			System.out.println(teach2.getName() + " killed " + teach1.getName() + " with one punch.");
			teachers.remove(num1);
			addKill(teach2);
		}
	}

	public static void convincing(Blanson teach1, int num1, Blanson teach2, int num2) {
		if (teach1.getCharisma() > teach2.getCharisma()) {
			System.out.println(teach1.getName() + " has convinced " + teach2.getName() + " to quit.");
			teachers.remove(num2);
			addKill(teach1);
		}

		else {
			System.out.println(teach2.getName() + " has convinced " + teach1.getName() + " to quit.");
			teachers.remove(num1);
			addKill(teach2);
		}
	}

	public static void stone(Blanson teach1, int num1, Blanson teach2, int num2) {

		if (teach1.getAttack() > teach2.getAttack()) {
			System.out.println(teach1.getName() + " stoned " + teach2.getName() + " to death.");
			teachers.remove(num2);
			addKill(teach1);
		}

		else {
			System.out.println(teach2.getName() + " stoned " + teach1.getName() + " to death.");
			teachers.remove(num1);
			addKill(teach2);
		}
	}

	public static void mushroom(Blanson teach1, int num1, Blanson teach2, int num2) {

		if (teach1.getCharisma() > teach2.getCharisma()) {
			System.out.println(teach1.getName() + " convinced " + teach2.getName() + " to eat magic mushrooms.");
			setHP(teach2, -2);
		}

		else {
			System.out.println(teach2.getName() + " convinced " + teach1.getName() + " to eat magic mushrooms.");
			setHP(teach1, -2);
		}
	}

	public static void curse(Blanson teach1, int num1, Blanson teach2, int num2) {

		if (teach1.getLuck() > teach2.getLuck()) {
			System.out.println(teach1.getName() + " cursed " + teach2.getName() + " to be dumber.");
			setInt(teach2, -2);
		}

		else {
			System.out.println(teach2.getName() + " cursed " + teach1.getName() + " to be dumber.");
			setInt(teach1, -2);
		}
	}

	public static void roundDecision() {
		int random = (int)(Math.random() * teachers.size());
		int event = (int)(Math.random() * 60) + 1;

		switch(event) {
			case 1:
				kitkat(teachers.get(random), random);
				break;
			case 2:
				dysentary(teachers.get(random), random);
				break;
			case 3:
				boulder(teachers.get(random), random);
				break;
			case 4:
				arrest(teachers.get(random), random);
				break;
			case 5:
				fellOutOfMap(teachers.get(random), random);
				break;
			case 6:
				lightningStrike(teachers.get(random), random);
				break;
			case 7:
				//stinky(teachers.get(random), random);
				stinky(teachers.get(random), random);
				break;
			case 8:
				noMeds(teachers.get(random), random);
				break;
			case 9:
				epilepsy(teachers.get(random), random);
				break;
			case 10:
				crazy(teachers.get(random), random);
				break;
			case 11:
				salad(teachers.get(random), random);
				break;
			case 12:
				pacMan(teachers.get(random), random);
				break;
			case 13:
				voices(teachers.get(random), random);
				break;
			case 14:
				cancelled(teachers.get(random), random);
				break;
			case 15:
				acid(teachers.get(random), random);
				break;
			case 16:
				heartbreak(teachers.get(random), random);
				break;
			case 17:
				isekai(teachers.get(random), random);
				break;
			case 18:
				depression(teachers.get(random), random);
				break;
			case 19:
				hunger(teachers.get(random), random);
				break;
			case 20:
				robot(teachers.get(random), random);
				break;
			case 21:
				truck(teachers.get(random), random);
				break;
			case 22:
				cia(teachers.get(random), random);
				break;
			case 23:
				pizza(teachers.get(random), random);
				break;
			case 24:
				missing(teachers.get(random), random);
				break;
			case 25:
				meditation(teachers.get(random), random);
				break;
			case 26:
				base(teachers.get(random), random);
				break;
			case 27:
				spear(teachers.get(random), random);
				break;
			case 28:
				art(teachers.get(random), random);
				break;
			case 29:
				exercise(teachers.get(random), random);
				break;
			default:
				reading(teachers.get(random), random);
				break;
		}
	}

	//other = 0, Math = 1, ELA = 2, SS = 3, Science = 4, Electives = 5, IET = 6, HHS = 7, CMAT = 8
	public static void main (String[] args) {
		
		createObjects();
		
		System.out.println("Round One...");

		for (int i = 0; i < 10; i++) {
			roundDecision();
		}
		
	}
}
