package Polymorphism;

public class Player2 extends Character {

	//sets health and strength
	public Player2(String name, int health) {
		super(name, health);
		this.health = 100;
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
	
	
	
	public String toString() {
		return super.toString();
		
	}



	
	

}



