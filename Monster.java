package gameCharacters;

public abstract class Monster extends DungeonCharacter implements MonsterAttack{


//-----------------------------------------------------------------
  public Monster(String name, int hitPoints, int initiative, int damageDie, int ac)
  {
	super(name, hitPoints, initiative, damageDie, ac);


  }//end monster construcotr

//-----------------------------------------------------------------
 public void setNewMonsterAttack(AttackBehavior attack) {
	 this.attackBehavior = attack;
 }


	
}
