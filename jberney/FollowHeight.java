package jberney;

import edu.berkeley.atdp.java.game.GameObject;
import edu.berkeley.atdp.java.game.pong.logic.PaddleLogic;
import edu.berkeley.atdp.java.game.character.NPC;
import edu.berkeley.atdp.java.game.pong.character.Paddle;
import edu.berkeley.atdp.java.game.pong.character.Ball;

public class FollowHeight extends PaddleLogic {
    
    public FollowHeight(int playerIndex) {
        super(playerIndex);
    }
    
    public void evaluate(GameObject game) {
        NPC[] npcs = game.getNPCs();
        NPC ball = npcs[0];
        double[] ballPosition = ball.getPosition();
        double ballY = ballPosition[1];
        this.target = ballY;
    }
    
}