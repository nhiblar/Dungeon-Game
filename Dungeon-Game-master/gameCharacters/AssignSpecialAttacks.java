package gameCharacters;

import specialAttack.*;
//import specialAttack.SpecialAttack;

public class AssignSpecialAttacks {
	
	public static SpecialAttack getSpecialAttack(String checkClass) {

		switch (checkClass) {
			case "Barbarian":
				return new PowerAttack();
			case "Bard":
				return new DaggerStorm();
			case "Cleric":
				return new CureWounds();
			case "Druid":
				return new Entangle();	
			case "Fighter":
				return new PowerAttack();
			case "Monk":
				return new DaggerStorm();
			case "Paladin":
				return new CureWounds();
			case "Ranger":
				return new Haste();
			case "Rogue":
				return new DaggerStorm();
			case "Sorcerer":
				return new EldrichBlast();
			case "Warlock":
				return new MagicMissile();
			case "Wizard":
				return new Fireball();
		}
		System.out.println("Defying the creator, you were birth with the special attack Dagger Storm.");
		return new DaggerStorm();
	}
}
