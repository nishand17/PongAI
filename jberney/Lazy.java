package jberney;

import edu.berkeley.atdp.java.game.GameObject;
import edu.berkeley.atdp.java.game.pong.logic.PaddleLogic;
import edu.berkeley.atdp.java.game.character.NPC;
import edu.berkeley.atdp.java.game.character.PC;
import edu.berkeley.atdp.java.game.pong.character.Paddle;
import edu.berkeley.atdp.java.game.pong.character.Ball;

public class Lazy extends PaddleLogic {
    
    public Lazy(int playerIndex) {
        super(playerIndex);
    }
    
    public void evaluate(GameObject game) {
        PC[] pcs = game.getPCs();
        PC player = pcs[playerIndex];
        double[] playerPosition = player.getPosition();
        double playerY = playerPosition[1];

        NPC[] npcs = game.getNPCs();
        NPC ball = npcs[0];
        double[] ballPosition = ball.getPosition();
        double ballY = ballPosition[1];
        this.target = ballY;

        double distanceToBall = Math.abs(ballY - playerY);
        double maxDistance = (Ball.HEIGHT_SCALE + Paddle.HEIGHT_SCALE) / 2.0;
        //wait until past midpoint
        if (ball.getVelocity()[0] < 0) {
            
        
            if (distanceToBall < 0.5) {
            
                if(distanceToBall < maxDistance) {
                    this.target = playerY;
                    this.target = 0.5;
                }
                else {
                    this.target = ballY;
                    this.target = 0.5;
                }
        }
    }
        if (ball.getVelocity()[0] > 0) {
            this.target = 0.5;
        }
        
        
    }
    
}