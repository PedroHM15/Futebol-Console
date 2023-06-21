
//Importing library to draw random numbers
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//Creating auxiliary(aux) and time(tempo) variables
		int aux=0,tempo=0;
		//Creating objects of classes Random and class match(Partida)
		Random rand = new Random();
		Partida p1 = null;
		
			p1 = new Partida("Brasil","Croácia", "Gustavo Villani", "Caio Ribeiro");
		
		
		
		//While to count from 0 to 90, being incremented by a random number between 1 and 10
		while(tempo<=90)
			{
				//Raffling numbers for the aux and tempo variables
				aux=rand.nextInt(1,5);		
				tempo+=rand.nextInt(1,10);
				pause(500);
					//Switch with aux variable with 3 options
					switch(aux)
					{
						/*Case 1: 3 random numbers between 1 and 11 
						will be drawn and the gols function will be executed in the Partida class*/
						case 1: 
							p1.gols(/*i*/rand.nextInt(1,11),/*x*/rand.nextInt(1,11),/*y*/rand.nextInt(1,38),tempo);
							break;
						/*Case 1: 4 random numbers between 1 and 11 
						will be drawn and the faltas function will be executed in the Partida class*/
						case 2:
							p1.faltas(/*i*/rand.nextInt(1,21),/*x*/rand.nextInt(1,21),/*y*/rand.nextInt(1,21),/*z*/rand.nextInt(1,21),tempo);
							break;
					}	
			}
		//Runs the match summary
		p1.resumo();

	}
	//Function to pause the program
	public static void pause(int time)
	{
		try {
			Thread.sleep(time);
			}catch(Exception e) {}
	}

}
