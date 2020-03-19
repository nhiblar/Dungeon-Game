package attack;

//import specialAttack.SpecialAttack;
import specialAttack.CureWounds;
import specialAttack.DaggerStorm;
import specialAttack.EldrichBlast;
import specialAttack.Entangle;
import specialAttack.Fireball;
import specialAttack.Haste;
import specialAttack.LowerGuard;
import specialAttack.MagicMissile;
import specialAttack.PowerAttack;

public class AssignSpecialAttacks {

	public static AttackBehavior getSpecialAttack(final String checkClass) {

		switch (checkClass) {
		case "Barbarian" :
		case "PowerAttack":
			return new PowerAttack();
		case "Bard":
		case "DaggerStorm":
			return new DaggerStorm();
		case "Cleric":
		case "CureWounds":
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
