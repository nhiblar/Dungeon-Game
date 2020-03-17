package gameCharacters;

import attack.*;

public class HeroFactory {

	public Hero newHero(String charRace, String charClass, String name){

		switch(charRace) {
			case "Aarakocra":
				return new Aarakocra(name, 16, 3, 14, charClass, new ShortSword());
			case "Bugbear":
				return new BugBear  (name, 21, 1, 15, charClass, new GreatSword());
			case "Elf":
				return new Elf 		(name, 17, 4, 11, charClass, new LongSword());
			case "Dragonborn":
				return new Dragonborn(name, 18, 3, 12, charClass, new Greataxe());
			case "Dwarf":
				return new Dwarf	(name, 20, 3, 13, charClass, new Mace());
			case "Gnome":
				return new Gnome	(name, 15, 4, 12, charClass, new Club());
			case "Goliath":
				return new Goliath	(name, 20, 1, 16, charClass, new Greataxe());
			case "Halfelf":
				return new HalfElf	(name, 18, 3, 12, charClass, new Quarterstaff());
			case "Human":
				return new Human	(name, 17, 3, 13, charClass, new LongSword());
			case "Lizardfolk":
				return new Lizardfolk(name, 18, 2, 12, charClass, new Mace());
			case "Triton":
				return new Triton	(name, 16, 2, 14, charClass, new ShortSword());
			case "Tabaxi":
				return new Tabaxi	(name, 18, 3, 12, charClass, new Quarterstaff());
				
		}
		System.out.println("Defying the creator, a hero spawns from the eather.");
		return new Human (name, 17, 3, 13, charClass, new ShortSword());
	}
	

}