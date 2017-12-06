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
        BowlingGame bowlingGame = new BowlingGame("");
        assertEquals(-1, bowlingGame.getScore());
    }     
	public void testValidateInput1() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][*,6]");
        assertFalse(bowlingGame.validateScores()); //incorrect value of thrown pins
    }
	public void testValidateInput2() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][,6]");
        assertFalse(bowlingGame.validateScores()); //no value of thrown pins
    }
	public void testValidateInput3() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][3,2][2,2][4,5][4,3][3,5][1,2][7,1][8,1]");
        assertTrue(bowlingGame.validateScores());
    }	
	public void testValidateInput4() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][6,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][*,6]");
        assertFalse(bowlingGame.validateScores()); //6+6 = 12
    }	
	public void testValidateInput5() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
        assertTrue(bowlingGame.validateScores());
    }
	public void testValidateInput6() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
        assertTrue(bowlingGame.validateScores());
    }
	
	public void testTotalScore1() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(81, bowlingGame.getScore());
    }
	public void testTotalScore3() { 
		BowlingGame bowlingGame = new BowlingGame("[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(94, bowlingGame.getScore());
    }
	public void testTotalScore4() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(112, bowlingGame.getScore());
    }
	public void testTotalScore5() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
       assertEquals(88, bowlingGame.getScore());
    }
	public void testTotalScore6() { 
		BowlingGame bowlingGame = new BowlingGame("[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(98, bowlingGame.getScore());
    }
	public void testTotalScore7() {
       BowlingGame bowlingGame = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(103, bowlingGame.getScore());
    }
	public void testTotalScore8() {
      BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]");
        assertEquals(90, bowlingGame.getScore());
    }
	public void testTotalScore9() {
       BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][7,2]");
        assertEquals(92, bowlingGame.getScore());
    }
	public void testTotalScore10() {
       BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][10]");
        assertEquals(93, bowlingGame.getScore());
    }
	public void testTotalScore11() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
        assertEquals(300, bowlingGame.getScore());
    }
	//Assignment 2
	public void testValidation1() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0]");
        assertFalse(bowlingGame.validateScores());
    }
	public void testValidation2() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,12][10]");
        assertFalse(bowlingGame.validateScores());
    }
	public void testValidation3() {
        BowlingGame bowlingGame = new BowlingGame("[1,5][10,10][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,12][10]");
        assertFalse(bowlingGame.validateScores());
    }
	public void testValidation4() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][5,0][10,10]");
        assertFalse(bowlingGame.validateScores());
    }
	public void testValidation5() {
	    BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][1,8][10]");
	    assertFalse(bowlingGame.validateScores());
	    }
	public void testValidation6() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,10][2,6]");
        assertFalse(bowlingGame.validateScores());
    }
	public void testTotalScore12() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,2]");
        assertEquals(292, bowlingGame.getScore());
    }
	public void testValidation8() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,-1][2,6]");
        assertFalse(bowlingGame.validateScores());
    }
	public void testValidation9() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,9]");
        assertFalse(bowlingGame.validateScores());
    }
	public void testValidation10() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][9,9][3,3][4,5][8,1][2,6]");
        assertTrue(bowlingGame.validateScores());
    }
	public void testValidation11() {
        BowlingGame bowlingGame = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6][2,6]");
        assertFalse(bowlingGame.validateScores());
    }
	
	//TODO: Add more test cases below...
	
}