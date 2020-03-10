package gameCharacters;

import attack.AttackBehavior;
import specialAttack.*;
//import specialAttack.SpecialAttack;

public class AssignSpecialAttacks {
	
	public static AttackBehavior getSpecialAttack(String checkClass) {
		
		switch (checkClass) {
			case "Barbarian" :
			case "PowerAttack":
				return new PowerAttack();
			case "Bard":
			case "DaggerStorm":
				return new DaggerStorm();
			case "Cleric":
				return new CureWounds();
			case "Druid":
			case "Entangle":
				return new Entangle();	
			case "Fighter":
				return new PowerAttack();
			case "Monk":
				return new DaggerStorm();
			case "Paladin":
				return new CureWounds();
			case "Ranger":
			case "CureWOunds":
				return new Haste();
			case "Rogue":
				return new DaggerStorm();
			case "Sorcerer":
			case "EldrichBlast":
				return new EldrichBlast();
			case "Warlock":
			case "MagicMissile":
				return new MagicMissile();
			case "Wizard":
			case "Fireball":
				return new Fireball();
			case "Necromancer":
			case "LowerGuard":
				return new LowerGuard();
		}
		System.out.println("Defying the creator, you were birth with the special attack Dagger Storm.");
		return new DaggerStorm();
	}
}
