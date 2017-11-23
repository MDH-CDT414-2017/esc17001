import java.util.ArrayList;

/** BowlingGame Score calculator 
 *
 * @author CDT414 Student: 
 * @version 1.0 
 * @date 2016-11-24
 */
public class BowlingGame {

	/** BowlingGame Score calculator constructor which require string as input 
	 * @param game Expected format "[n,n][n,n]..[n,n]"
	 * 
	 */	 
	String game;
	ArrayList<Integer> Scores;
	
	public BowlingGame(String game)
	{	
		this.game = game;
		Scores = new ArrayList<Integer>();
		toIntegerList(game);
	}
	
	/** getScore method returns a score of current Bowling game or -1 if error
	 * 
	 * @return Integer value of Bowling score, in case of error return value is -1 
	 */
	private void toIntegerList(String game) 
	{
		game = game.replace("][", ",");
		game = game.replace("[", "");
		game = game.replace("]", "");
		String[] newGame = game.split(",");
		for (int i = 0; i < newGame.length; i++) 
		{
			Scores.add(Integer.parseInt(newGame[i]));
		}
	}
	public Boolean validateScores()
	{
		if (Scores.size() < 20 || Scores.size() > 22)
			return false;
		for (int i = 0; i < Scores.size(); i++) {
			if (Scores.get(i) < 0 || Scores.get(i) > 10)
				return false;
		}
		return true;
		
	}
	
	public int getScore() {
		
		int TotalScore = 0;
		if (validateScores()) 
		{
			System.out.println(Scores);
			for (int i = 0; i < Scores.size(); i++)
			{
				if (i < 20)
				{
					if (i % 2 == 0 && Scores.get(i) == 10) 
					{
						if (Scores.get(i+2) == 10) {
							if (i + 2 == 20)
							{
								//Strike in the last frame
								TotalScore = TotalScore + Scores.get(i) + Scores.get(i+2) + Scores.get(i+3);
							}
							else 
							{
								TotalScore = TotalScore + Scores.get(i) + Scores.get(i+2) + Scores.get(i+4);
							}
						}
						else
						{
							TotalScore = TotalScore + Scores.get(i) + Scores.get(i+2) + Scores.get(i+3);
						}
					}
					else if (i % 2 == 0 && (Scores.get(i) + Scores.get(i+1)) == 10)
					{
						TotalScore = TotalScore + 10 + Scores.get(i+2);
						i++;
					}
					else
					{
						TotalScore = TotalScore + Scores.get(i);
					}
			
				}
			}
			return TotalScore;
		}
		return -1;	
	}
}
	
