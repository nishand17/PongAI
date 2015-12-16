package jberney;

import edu.berkeley.atdp.java.game.GameObject;
import edu.berkeley.atdp.java.game.pong.logic.PaddleLogic;
import edu.berkeley.atdp.java.game.character.NPC;
import edu.berkeley.atdp.java.game.character.PC;
import edu.berkeley.atdp.java.game.pong.character.Paddle;
import edu.berkeley.atdp.java.game.pong.character.Ball;

public class NishanLeft extends PaddleLogic {
    private double slope;
    private double prevx = 0.5;
    private double slxx;
    private double prevy = 0.5;
    private double slyy;

    public NishanLeft(int playerIndex) {
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
        double ballX = ballPosition[0];
        this.target = ballY;

        double distanceToBall = Math.abs(ballY - playerY);
        double maxDistance = (Ball.HEIGHT_SCALE + Paddle.HEIGHT_SCALE) / 2.0;
            if (ball.getVelocity()[0] > 0) {
                this.target = 0.5;
            }
            else {
                if (ball.getVelocity()[0] < 0) {
                    slope = (ballY - prevy) / (ballX - prevx);
                    if (Math.abs((prevy-slope*prevx) + 0.065) > 1) {
                        this.target = Math.abs((prevy-slope*prevx) + 0.065) - (2 * (Math.abs((prevy-slope*prevx) + 0.065) - 1));
                    }
                    else {
                        this.target = Math.abs((prevy-slope*prevx) + 0.065);
                    }
                    
                }
            }
            prevx = ballX;
            prevy = ballY;

        
      

        

    
    
}
}