package DungeonGame;

public class HeroFactory {

	public Hero newHero(String charRace, String charClass, String name){

		String race = charRace;
		switch(race) {
			case "Aarakocra":
				return new Aarakocra(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Bugbear":
				return new BugBear  (name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Elf":
				return new Elf 		(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Dragonborn":
				return new Dragonborn(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Dwarf":
				return new Dwarf	(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Gnome":
				return new Gnome	(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Goliath":
				return new Goliath	(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Halfelf":
				return new HalfElf	(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Human":
				return new Human	(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Lizardfolk":
				return new Lizardfolk(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Triton":
				return new Triton	(name, 20, 3, 7, 8, charClass, new ShortSword());
			case "Tabaxi":
				return new Tabaxi	(name, 20, 3, 7, 8, charClass, new ShortSword());
		}
		System.out.println("Defying the creator, a hero spawns from the eather.");
		return new Human (name, 20, 3, 7, 8, charClass, new ShortSword());
	}
	

}