package specialAttack;

public class SpecialBuff {
	
	public enum specialBuffs {
		
		CUREWOUNDS, HASTE
	}
	
	public static boolean isSpecialBuff(String isBuff) {
		
		for(specialBuffs tempVal : specialBuffs.values() ) {
		    if(isBuff.equalsIgnoreCase(tempVal.name()))
		    	return true;
		}
		return false;
	}

}	
