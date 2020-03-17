package gameCharacters;

import attack.AttackBehavior;

public class Monster extends DungeonCharacter {

	 public Monster(String name, int hitPoints, int initiative, int ac, AttackBehavior ab) {
		 super(name, hitPoints, initiative, ac, ab);
	 }
	 
	 public void setNewMonsterAttack(AttackBehavior attack) {
		 this.attackBehavior = attack;
	 }
	
	@Override
	public int attack(DungeonCharacter enemy) {
		return attackBehavior.attack(enemy);
	}
	
	@Override
	public int compareTo(DungeonCharacter arg0) {
		return this.AC - arg0.getAC();
	}


}