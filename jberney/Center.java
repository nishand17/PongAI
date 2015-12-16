package jberney;

import edu.berkeley.atdp.java.game.GameObject;
import edu.berkeley.atdp.java.game.pong.logic.PaddleLogic;

public class Center extends PaddleLogic {
    
    public Center(int playerIndex) {
        super(playerIndex);
    }
    
    public void evaluate(GameObject game) {
        this.target = 0.5;
    }
    
}