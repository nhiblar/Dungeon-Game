package gameCharacters;

public class AssignSpecialAttacks {
	
	public static SpecialAttack getSpecialAttack(String checkClass) {

		switch (checkClass) {
			case "Barbarian":
				return new PowerAttack();
			case "Bard":
				return new DaggerStorm();
			case "Cleric":
				return new Fireball();
			case "Druid":
				return new DaggerStorm();	
			case "Fighter":
				return new PowerAttack();
			case "Monk":
				return new PowerAttack();
			case "Paladin":
				return new PowerAttack();
			case "Ranger":
				return new DaggerStorm();
			case "Rogue":
				return new DaggerStorm();
			case "Sorcerer":
				return new Fireball();
			case "Warlock":
				return new Fireball();
			case "Wizard":
				return new Fireball();
		}
		System.out.println("Defying the creator, you were birth with the special ability Power Attack!");
		return new PowerAttack();
	}
}
