package gameCharacters;

public class HeroFactory {

	public Hero newHero(String charRace, String charClass, String name){
		
		String race = charRace;
		switch(race) {
			case "Aarakocra":
				return new Aarakocra(name, 14, 3, 16, charClass, new ShortSword());
			case "Bugbear":
				return new BugBear  (name, 19, 1, 17, charClass, new ShortSword());
			case "Elf":
				return new Elf 		(name, 15, 4, 13, charClass, new ShortSword());
			case "Dragonborn":
				return new Dragonborn(name, 16, 3, 14, charClass, new ShortSword());
			case "Dwarf":
				return new Dwarf	(name, 18, 3, 15, charClass, new ShortSword());
			case "Gnome":
				return new Gnome	(name, 13, 4, 15, charClass, new ShortSword());
			case "Goliath":
				return new Goliath	(name, 18, 1, 18, charClass, new ShortSword());
			case "Halfelf":
				return new HalfElf	(name, 16, 3, 14, charClass, new ShortSword());
			case "Human":
				return new Human	(name, 15, 3, 15, charClass, new ShortSword());
			case "Lizardfolk":
				return new Lizardfolk(name, 16, 2, 14, charClass, new ShortSword());
			case "Triton":
				return new Triton	(name, 14, 2, 16, charClass, new ShortSword());
			case "Tabaxi":
				return new Tabaxi	(name, 16, 3, 14, charClass, new ShortSword());
				
		}
		System.out.println("Defying the creator, a hero spawns from the eather.");
		return new Human (name, 15, 3, 15, charClass, new ShortSword());
	}
	

}