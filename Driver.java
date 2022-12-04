package Polymorphism;

import java.util.Random;


public class Driver {
	
	
	//polymorphism
	public static int numAlive(Character[] characters)
	   {
	       int count = 0; 
	       // loop for array of Char
	       for(int i=0;i<characters.length;i++)
	       {
	           if(characters[i].isAlive()) // increment count by 1 for winner
	               count++;
	       }
	      
	       return count;
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// create an array of 4 characters
	       Character[] characters = new Character[4];
	       characters[0] = new Player1("Senju Uchiha", 100);
	       characters[1] = new Player2("Illumi", 100);
	       characters[2] = new Player3("Itachi", 100);
	       characters[3] = new Player4("Killua", 100);
	      
	       Random ran = new Random();
	       int attackerIdx, otherIdx;

	       System.out.println("Battle Royale contestants: ");
	      
	       
	       for(int i=0;i<characters.length;i++)
	       {
	           System.out.println(characters[i]);
	       }
	       System.out.println();
	      
	       // loops until 1 player is alive
	       while(numAlive(characters) > 1)
	       {
	           attackerIdx = ran.nextInt(characters.length); 
	           // attacker index loop 
	           while(!characters[attackerIdx].isAlive())
	               attackerIdx = ran.nextInt(characters.length);
	          
	           
	           otherIdx = ran.nextInt(characters.length);
	          
	           //loop until one index is alive and other isnt
	           while((attackerIdx == otherIdx) || (!characters[otherIdx].isAlive()))
	           {
	               otherIdx = ran.nextInt(characters.length);
	           }
	          
	          
	           System.out.println(characters[attackerIdx].getName()+" attacked "+characters[otherIdx].getName());
	           characters[otherIdx].hit(characters[attackerIdx].attack()); 
	        
	           System.out.println(characters[otherIdx].getName()+" health is: "+characters[otherIdx].getHealth()+"\n");
	       }
	      
	     
	       System.out.println("The end of Battle Royale: ");
	       for(int i=0;i<characters.length;i++)
	       {
	           System.out.println(characters[i]);
	       }
	      
	      //prints who is the winner
	       for(int i=0;i<characters.length;i++)
	       {
	           if(characters[i].isAlive())
	           {
	               System.out.println("\n" +characters[i].getName()+" is the winner.");
	               break;
	           }
	       }
	      
	   

	}

}
