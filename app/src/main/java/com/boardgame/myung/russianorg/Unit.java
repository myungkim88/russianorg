package com.boardgame.myung.russianorg;

public class Unit {
    private String name;
    private int team;
    private int size;
    private int x;
    private int y;
    private boolean onBoard;
    private boolean covered;

    Unit() {
        x = -1;
        y = -1;
        covered = false;
        onBoard = false;
    }
    /**
     * @return the team
     */
    public int getTeam() {
        return team;
    }

    /**
     * @param team
     *            the team to set
     */
    public void setTeam(int team) {
        this.team = team;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size
     *            the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the onBoard
     */
    public boolean isOnBoard() {
        return onBoard;
    }

    /**
     * @param onBoard the onBoard to set
     */
    public void setOnBoard(boolean onBoard) {
        this.onBoard = onBoard;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }


}
