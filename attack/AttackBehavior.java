package attack;

import gameCharacters.DungeonCharacter;

public interface AttackBehavior {
    int attack(DungeonCharacter enemy);
    String getName();
}
