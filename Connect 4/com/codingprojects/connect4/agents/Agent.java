package com.codingprojects.connect4.agents;

import com.codingprojects.connect4.PlayerColor;

import java.security.InvalidParameterException;

/**
 * Abstract class, defining the behavior of a decision unit for the connect 4 game. Can be implemented as either an
 * artificial intelligence or a human player.
 *
 * Created by austi on 2016-12-18.
 */
public abstract class Agent {

    /**
     * Determines which pieces belong to the player.
     */
    protected PlayerColor color;

    /**
     * Initializes this agent with a token color.
     *
     * @param color Color of the tokens used by this player.
     */
    public Agent(PlayerColor color) {
        this.color = color;
    }

    /**
     * Returns the color of this agent.
     *
     * @return The color of this agent.
     */
    public PlayerColor getPlayerColor() {
        return this.color;
    }

    /**
     * Allow the agent to process the state of the board before making a decision. Returns an integer, representing
     * the column that the player wishes to drop a token into.
     *
     * @param board A 2D array of type PlayerColor denoting the current state of the game. The first dimension is the
     *              boards column, and the second dimension is the boards row. Row 0 is the top of the board and row n-1
     *              is the bottom.
     *
     * @return An integer representing the column the player wishes to drop a token into.
     */
    public int perceive(PlayerColor[][] board) {
        if (null == board || 0 == board.length || 0 == board[0].length) {
            throw new InvalidParameterException("Board has no dimensions.");
        }
        return 0; // valid board return code.
    }
}
