package gameCharacters;

import attack.*;

public class HeroFactory {

	public Hero newHero(String charRace, String charClass, String name){
		

		switch(charRace) {
			case "Aarakocra":
				return new Aarakocra(name, 14, 3, 16, charClass, new ShortSword());
			case "Bugbear":
				return new BugBear  (name, 19, 1, 17, charClass, new GreatSword());
			case "Elf":
				return new Elf 		(name, 15, 4, 13, charClass, new LongSword());
			case "Dragonborn":
				return new Dragonborn(name, 16, 3, 14, charClass, new Greataxe());
			case "Dwarf":
				return new Dwarf	(name, 18, 3, 15, charClass, new Mace());
			case "Gnome":
				return new Gnome	(name, 13, 4, 15, charClass, new Club());
			case "Goliath":
				return new Goliath	(name, 18, 1, 18, charClass, new GreatSword());
			case "Halfelf":
				return new HalfElf	(name, 16, 3, 14, charClass, new Quarterstaff());
			case "Human":
				return new Human	(name, 15, 3, 15, charClass, new LongSword());
			case "Lizardfolk":
				return new Lizardfolk(name, 16, 2, 14, charClass, new Mace());
			case "Triton":
				return new Triton	(name, 14, 2, 16, charClass, new ShortSword());
			case "Tabaxi":
				return new Tabaxi	(name, 16, 3, 14, charClass, new Quarterstaff());
				
		}
		System.out.println("Defying the creator, a hero spawns from the eather.");
		return new Human (name, 15, 3, 15, charClass, new ShortSword());
	}
	

}