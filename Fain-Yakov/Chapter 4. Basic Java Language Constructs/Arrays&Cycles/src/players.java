
public class players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String [] players = new String [4];
		
		/* 
		String players [] = new String [4]; //Р•С‰С‘ РѕРґРёРЅ СЃРїРѕСЃРѕР± РѕР±СЉСЏРІРёС‚СЊ РјР°СЃСЃРёРІ
		players[0] = "David";
		players[1] = "Daniel";
		players[2] = "Anna";
		players[3] = "Gregory";
		*/ 
		
		String [] players = {"David", "Daniel", "Anna", "Gregory"};
		
		System.out.println("Список игроков:");
		int totalPlayers = players.length;
		
		for (int i = 0; i < totalPlayers; i++) {
			System.out.println(players[i]);
			}
		System.out.println("");
		
		String theWinner = players[1];
		System.out.println("Победитель - " + theWinner + "!");
		System.out.println("");
		
		int counter;
		for (counter = 0; counter < totalPlayers; counter++) {
			System.out.println("Поздравляем, " + players[counter] + "!");
		}
		System.out.println(counter);
		System.out.println("");
		
		counter = 0;
		
		while (counter < totalPlayers) {
			if (counter == 3) {
				break; // Выпрыгиваем из цикла
			}
			String thePlayer = players[counter];
			System.out.println("Congratulations, " + thePlayer + "!");
			counter++;
		}
		
		System.out.println("");
		counter = 0;
		
		while (counter < totalPlayers) {
			String thePlayer = players[counter];
				if (thePlayer.equals("Daniel")) {
					counter++;
					continue; // Пропускаем
					}
			System.out.println("Congratulations, " + thePlayer + "!");
			counter++;
		}
		
	}

}
