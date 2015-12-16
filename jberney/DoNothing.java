package jberney;

import edu.berkeley.atdp.java.game.GameObject;
import edu.berkeley.atdp.java.game.pong.logic.PaddleLogic;

public class DoNothing extends PaddleLogic {
    
    public DoNothing(int playerIndex) {
        super(playerIndex);
    }
    
    public void evaluate(GameObject game) {
        // Going up!
    }
    
}