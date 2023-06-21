import java.util.Random;

public class Partida extends Placar{
	//Creating the variables to be used
	public String time1, time2;
	public int golpenalt1, golpenalt2;
	public int gols1=0, gols2=0;
	public int cartaoV1=0,cartaoV2=0,cartaoA1=0,cartaoA2=0, faltas1=0,faltas2=0;
	public String narrador, comentarista;
	Random rand = new Random();
	//Creating the constructor method
	public Partida(String time1, String time2, String narrador, String comentarista) 
	{
		
		this.time1=time1;
		this.time2=time2;
		this.narrador=narrador;
		this.comentarista=comentarista;
		
		//Talk of the narrators
		System.out.println(this.narrador+": Bom dia a todos aqui quem fala e "+this.narrador+" e aqui ao meu lado esta "+this.comentarista+"\n"+this.narrador+": O que devemos esperar da partida de hoje "+this.comentarista);
		
		System.out.println(this.comentarista+": Bom dia "+this.narrador+", bom dia a todos de casa. Devemos esperar uma partida disputada os dois times vem de um grande numero de vitorias. \n Hoje a partida vai ser boa "+this.narrador+"\n");
		
		System.out.println(this.narrador+": E começçççooooouuu "+time1+" contra "+time2+" "+"\n");
		
	}
	//With the random numbers received from the main class, a series of choices made by IFs can happen
	public void gols(int i, int x,int y, int tempo) 
	{
		if(i%2==0)
		{
			this.gols1++;
			if(x<5)
			{
			System.out.println(this.narrador+": Olha o Gol olha o Gol olha o Gol, GOOOOOOOOOOLLLLLL, sabe de quem dele o numero "+y);
			
			placar(this.time1, this.time2, this.gols1,this.gols2,tempo);
			pause(4000);
			
			}
			else if(x>=5)
			{
				System.out.println(this.narrador+": E deleeeee o 10 do time, GOOOOOOOOOOOOLLLLLL");
				
				placar(this.time1, this.time2, this.gols1,this.gols2,tempo);
				pause(4000);
				
			}
		}
		else if(i%2!=0)
		{
			this.gols2++;
			if(x<5)
			{
			System.out.println(this.narrador+": Olha o Gol olha o Gol olha o Gol, GOOOOOOOOOOLLLLLL, sabe de quem dele o numero "+y);
			
			placar(this.time1, this.time2, this.gols1,this.gols2,tempo);
			pause(4000);
			
			}
			else if(x>=5)
			{
				System.out.println(this.narrador+": E deleeeee o 10 do time, GOOOOOOOOOOOOLLLLLL");
				
				placar(this.time1, this.time2, this.gols1,this.gols2,tempo);
				pause(4000);
			}
		}
	}
	//With the random numbers received from the main class, a series of choices made by IFs can happen
	public void faltas(int i, int x, int y, int z, int tempo) 
	{
		int zz;
		zz=rand.nextInt(0,21);
		if(i%2==0)
		{
			z=2;
			this.faltas1++;
			
			if(x%2==0)
			{
				if(y%2==0)
				{
					cartaoV1++;
					System.out.println(this.narrador+": Um jogador do "+time1+" cometeu uma falta e recebeu cartao Vermelho e foi expulso");
					
					System.out.println(this.narrador+": O "+time1+" ja tomou "+cartaoV1+" cartoes vermelhos"+"\n");
					pause(4000);
				}
				else
				{
					cartaoA1++;
					System.out.println("Um jogador do "+time1+" cometeu uma falta e recebeu cartao Amarelo");

					System.out.println("O "+time1+" ja tomou "+cartaoA1+" cartoes amarelos"+"\n");
					pause(4000);
				}
			}
			else
			{
				System.out.println("Um jogador do "+time1+" cometeu uma falta mas, nao foi lance para cartao");
				
				System.out.println("O numero de faltas ja cometidas pelo "+time1+" ja chegou a: "+faltas1+"\n");
				pause(4000);
			}	
		}
		else
		{
			z=1;
			this.faltas2++;
			if(x%2!=0)
			{
				if(y%2!=0)
				{
					cartaoV2++;
					System.out.println("Um jogador do "+time2+" cometeu uma falta e recebeu cartao Vermelho e foi expulso");
					
					System.out.println("O "+time2+" ja tomou "+cartaoV2+" cartoes vermelhos"+"\n");
					pause(4000);
				}
				else
				{
					cartaoA2++;
					System.out.println("Um jogador do "+time2+" cometeu uma falta e recebeu cartao Amarelo");
					
					System.out.println("O "+time2+" ja tomou "+cartaoA2+" cartoes amarelos"+"\n");
					pause(4000);
				}
			}
			else
			{
				System.out.println("Um jogador do "+time2+" cometeu uma falta mas, nao foi lance para cartao");
				
				System.out.println("O numero de faltas ja cometidas pelo "+time2+" ja chegou a: "+faltas2+"\n");
				pause(4000);
			}
		}
		System.out.println(this.narrador+": Falta perigosa dessa distancia da para marcar");
		
		System.out.println(this.comentarista+": Isso mesmos "+this.narrador+" dessa distancia ele pode se consagrar"+"\n");
		pause(4000);
		
		if(zz<5)
		{
			System.out.println(this.narrador+": Chutouuu longeeee de mais, esse ai esta precisando treinar mais, fala ai \n"+this.comentarista+": Realmente "+this.narrador+" esse ai esta precisando ir mais nos treinos de falta"+"\n");
			pause(4000);
		}
		else if(zz<10)
		{
			System.out.println(this.narrador+": Salvaaaaaaa o goleiro essa ai tinha o endereço em "+this.comentarista+"\n");
			pause(4000);
		}
		else if(zz<15)
		{
			System.out.println(this.narrador+": No travessão, foi por muito pouco"+"\n");
			pause(4000);
		}
		else if(zz<21&&z==1)
		{
			System.out.println(this.narrador+": GOOOOOOOOOOOOOLLLLL, NA GAVATA,  que gol lindo "+this.comentarista+" com muita categoria");
			
			System.out.println(this.comentarista+": Realmente "+this.narrador+" bateu com muita categoria na bola, ele sabia oque estava fazendo, e onde ela ia"+"\n");
			this.gols1++;
			placar(this.time1, this.time2, this.gols1,this.gols2,tempo);
			pause(4000);
		}
		else if(zz<21&&z==2)
		{
			System.out.println(this.narrador+": GOOOOOOOOOOOOOLLLLL, NA GAVATA,  que gol lindo "+this.comentarista+" com muita categoria");
			
			System.out.println(this.comentarista+": Realmente "+this.narrador+" bateu com muita categoria na bola, ele sabia oque estava fazendo, e onde ela ia"+"\n");
			this.gols2++;
			placar(this.time1, this.time2, this.gols1,this.gols2,tempo);
			pause(4000);
		}
	}
	
	public static void pause(int time)
	{
		try {
			Thread.sleep(time);
			}catch(Exception e) {}
	}
	//It receives all the information of the match and prints the summary on the console
	public void resumo()
	{
		int vencedor;
		vencedor=gols1-gols2;
		System.out.println("PIIIIIIIIII PIIIIIIIIII PIIIIIIIIIIIIIIIIII");
		pause(1000);
		System.out.println(narrador+": Apitaaa o arbitro e Fim de jogo");
		if(vencedor>0)
		{
			System.out.println(narrador+": Com essa vitoria, acredito que o "+time1+" volta  satisfeito para casa");
			pause(2000);
		}
		else if(vencedor<0)
		{
			System.out.println(narrador+": Com essa vitoria, acredito que o "+time1+" volta  satisfeito para casa");
			pause(2000);
		}
		else if(vencedor==0)
		{
			System.out.println(narrador+": Parita foi incrivel, vamos para os penalts agora ");
			pause(500);
			System.out.println(comentarista+": Que partidaça "+narrador+" essa partida foi incrivel grandes lances o tempo todo, vamos para os penalts");
			penalt(time1,time2,0,0);
		}
		pause(2000);
			System.out.println("-----------------Resulmo da Partida--------------------");
		System.out.println("Placar: "+time1+" "+gols1+" X "+gols2+" "+time2);
		System.out.println("Faltas: "+time1+" "+faltas1+" X "+faltas2+" "+time2);
		System.out.println("Cartoes Amarelos: "+time1+" "+cartaoA1+" X "+cartaoA2+" "+time2);
		System.out.println("Cartoes Vermelhos: "+time1+" "+cartaoV1+" X "+cartaoV2+" "+time2);
	}
	//If the match ends in a tie, penalties will take place where there will be five kicks for each team.
	public void penalt(String time1, String time2, int penaltgol1, int penaltgol2)
	{
		int j1,j2,g1,g2, penalts1=0,l=0;
		while(penalts1<10)
		{
			pause(500);
			if(l % 2 == 0)
			{
				j1=rand.nextInt(0,21);
				g2=rand.nextInt(0,21);
				System.out.println(time1+" na bola");
				pause(3000);
				if(j1>g2)
				{
					System.out.println(narrador+": GOOOLLL do "+time1);
					penaltgol1++;
					pause(3000);
				}
				else
				{
					System.out.println(narrador+": Salvaaaa o Goleirooo do "+time2);
					pause(3000);	
				}
			}
			else
			{
				j2=rand.nextInt(0,21);
				g1=rand.nextInt(0,21);
				System.out.println(time2+" na bola");
				pause(3000);
				if(j2>g1)
				{
					System.out.println(narrador+": GOOOLLL do "+time2);
					penaltgol2++;
					pause(3000);
				}
				else
				{
					System.out.println(narrador+": Salvaaaa o Goleirooo do "+time1);
					pause(3000);
				}
			}
			System.out.println("Placa Atual: "+time1+" : "+penaltgol1+"\n             "+time2+" : "+penaltgol2);
			penalts1++;
			l++;
		}
		System.out.println("-----------------Resulmo dos Penalts--------------------");
		System.out.println("Placar: "+time1+" "+penaltgol1+" X "+penaltgol2+" "+time2);
	}
}
