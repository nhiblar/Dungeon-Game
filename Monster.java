package gameCharacters;

public abstract class Monster extends DungeonCharacter {

  public Monster(String name, int hitPoints, int initiative, int ac, AttackBehavior ab)
  {
	super(name, hitPoints, initiative, ac, ab);
  }//end monster construcotr

 public void setNewMonsterAttack(AttackBehavior attack) {
	 this.attackBehavior = attack;
 }

}