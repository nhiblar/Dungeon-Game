package gameCharacters;

import specialAttack.DaggerStorm;
import specialAttack.SpecialAttack;

public class AssignSpecialAttacks {
	
	public static SpecialAttack getSpecialAttack(String checkClass) {

		switch (checkClass) {
			case "Barbarian":
				return new DaggerStorm();
			case "Bard":
				return new DaggerStorm();
			case "Cleric":
				return new DaggerStorm();
			case "Druid":
				return new DaggerStorm();	
			case "Fighter":
				return new DaggerStorm();
			case "Monk":
				return new DaggerStorm();
			case "Paladin":
				return new DaggerStorm();
			case "Ranger":
				return new DaggerStorm();
			case "Rogue":
				return new DaggerStorm();
			case "Sorcerer":
				return new DaggerStorm();
			case "Warlock":
				return new DaggerStorm();
			case "Wizard":
				return new DaggerStorm();
		}
		System.out.println("Defying the creator, you were birth with the special attack Dagger Storm.");
		return new DaggerStorm();
	}
}
