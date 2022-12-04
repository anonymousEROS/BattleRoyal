package Polymorphism;

public class Player4 extends Character{
	
	
	//sets health and strength
	public Player4(String name, int health) {
		super(name, health);
		this.health=100;
		str();
		
	}
	
	
	//orverride for abstracts methods
	@Override
    public int attack() {
        return strength;
    }

    @Override
    public void hit(int points) {
        this.health -= points;
    }

    @Override
    public boolean isAlive() {
        return health>=0;
    }
	
	/*
	public void orderStats() {
		orderStrength();
		orderCharisma();
		orderIntel();
		orderWis();
		orderDex();
	}
	*/
	
/*
 
	public void orderStrength() {
		if (strength == charisma) {
			strength = charisma;
		}
		if (strength == intel) {
			strength = intel;
		}
		if (strength == wisdom) {
			strength = wisdom;
		}
		if (strength == dex) {
			strength = dex;
		}
		if (strength == constitution) {
			strength = constitution;
		}
		
	}
	
	public void orderCharisma() {
		
		if (charisma == intel) {
			charisma = intel;
		}
		if (charisma == wisdom) {
			charisma = wisdom;
		}
		if (charisma == dex ) {
			charisma = dex;
		}
		if (charisma == constitution) {
			charisma = constitution;
		}
		
		
	}

	public void orderIntel() {
		
		if (intel == wisdom) {
			intel = wisdom;
		}
		if (intel == dex) {
			intel = dex;
		}
		if (intel == constitution) {
			intel = constitution;
		}
	
	
}

	public void orderWis() {
	
		if(wisdom == dex) {
			wisdom = dex;
		
		}
		if (wisdom == constitution) {
			wisdom = constitution;
	}	
}

	public void orderDex(){
	
		if (dex == constitution) {
			dex = constitution;
		}
	
}

 */
	public String toString() {
		return super.toString();
	}


	
}
