package com.james2323123.my2048.game;

import java.util.Random;

public class GameBoard {

	private int size;// board.shape = (size, size)
	private int[][] board2expo;
	// the value of each pos in the board in expo of 2
	// if a pos is -1, that pos is empty
	private Random ran;
	/* PTile2 = P(a random new tile is 2)
	 * 2expo value for a new random tile ~ Geometric(chance to fail = PTile2)
	 * anything 2expo value over spwanExpoThreshold will be spawnExpoThreshold
	 * for example, PTile2 = 0.9 and spawnExpoThreshold = 3
	 * P(new tile is 2) = 0.9
	 * P(new tile is 4) = 0.09
	 * P(new tile is 8) = 0.01
	 */

	private double PTile2 = 0.9;
	private int spawnExpoThreshold = 2;


	//the constructor should be called when the "game" starts
	public GameBoard(int size, double PTile2, int Threshold) {

		this.size = size;
		board2expo = new int[size][size];
		this.ran = new Random();
		this.PTile2 = PTile2;
		this.spawnExpoThreshold = Threshold;

		// initialize the board
		// the game starts with 2 random tiles
		clearBoard();
		spawnNewTiles();
		spawnNewTiles();

	}

	public void clearBoard() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				board2expo[i][j] = -1;
			}
		}
	}

	public boolean posIsEmpty(int i, int j) {
		if(i<0||j<0||i>=size||j>=size) {
			return false;
		}
		return (board2expo[i][j] == -1)? true :false;
	}

	public void spawnNewTiles() {

		// find a random pos to spawn
		int i,j;
		do {
			i = ran.nextInt(size);
			j = ran.nextInt(size);
		}while(!posIsEmpty(i,j));

		//TODO spawn random new tile


	}
	/*
	 * moves the tiles on the board
	 * the return boolean value indicates whether the move is valid or not
	 * a move is valid if the board changed(i.e. not identical to the board before move)
	 */
	public boolean move(String dir) {

		boolean isValid = false;

		if(dir == "up") {
			//TODO move tiles up
			isValid = true;
		}

		if(dir == "down") {
			//TODO move tiles down
			isValid = true;
		}

		if(dir == "right") {
			//TODO move tiles right
			isValid = true;
		}

		if(dir == "left") {
			//TODO move tiles left
			isValid = true;
		}

		else {
			System.out.println("Invalid argument for GameBoard.Move()");
		}

		return isValid;

	}

	public boolean isGameOver() {
		//TODO find a way to find whether the game is over
		// the game is over when none of the moves are valid
		return true;
	}

}
