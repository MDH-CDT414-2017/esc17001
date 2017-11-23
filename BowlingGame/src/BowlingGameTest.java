/** BowlingGameTest 
 *
 * @author CDT414 Student:
 * @version 1.0 
 * @date 2016-11-24
 */
import junit.framework.TestCase;

/** BowlingGame Score calculator test cases 
 *  
 */	 
public class BowlingGameTest extends TestCase {
        
	/** test01 
	 * 	
	 *  If no game is provided, score should be -1 (error)   
	 */	     
	public void test01() {
		BowlingGame bowlingGame1 = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(81, bowlingGame1.getScore());
    }	
	public void test02() { BowlingGame bowlingGame2 = new BowlingGame("[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
    assertEquals(94, bowlingGame2.getScore());
	}
	public void test03() {
		BowlingGame bowlingGame3 = new BowlingGame("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
	    assertEquals(112, bowlingGame3.getScore());
	}
	public void test04() {
		BowlingGame bowlingGame4 = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
	   assertEquals(88, bowlingGame4.getScore());
	}
	public void test05() { BowlingGame bowlingGame5 = new BowlingGame("[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
	    assertEquals(98, bowlingGame5.getScore());
	}
	public void test06() {
	   BowlingGame bowlingGame6 = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
	    assertEquals(103, bowlingGame6.getScore());
	}
		
	//TODO: Add more test cases below...
	
}