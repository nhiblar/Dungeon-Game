package specialAttack;

import gameCharacters.DungeonCharacter;

public interface SpecialAttack {
    int specialAttack(DungeonCharacter enemy);
    String getName();
}
