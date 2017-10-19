package com.boardgame.myung.russianorg;

import java.util.HashMap;

public class Board {
    private static BoardCell[][] board;
    private static HashMap<String, Unit> teamWhite;
    private static HashMap<String, Unit> teamBlack;
    private static int turnStatus; //0:start, 1:white played, 2:black played, 3: white won, 4: black won, 5: draw

    public Board() {
        board = new BoardCell[3][3];
        teamWhite = new HashMap<>();
        teamBlack = new HashMap<>();
        unitsInitialize();
        turnStatus = -1; //Start of the game
    }

    public BoardCell[][] getBoard() {
        return board;
    }

    public void setBoard(BoardCell[][] board) {
        this.board = board;
    }

    public HashMap<String, Unit> getTeamWhite() {
        return teamWhite;
    }

    public void setTeamWhite(HashMap<String, Unit> teamWhite) {
        this.teamWhite = teamWhite;
    }

    public HashMap<String, Unit> getTeamBlack() {
        return teamBlack;
    }

    public void setTeamBlack(HashMap<String, Unit> teamBlack) {
        this.teamBlack = teamBlack;
    }

    public static int getTurnStatus() {
        return turnStatus;
    }

    public static void setTurnStatus(int status) {
        turnStatus = status;
    }

    public Unit showUnitOnTop(int x, int y) {
        return board[x][y].showUnitOnTop();
    }

    public static boolean stackUnit(int x, int y, Unit unit)
    {
        if (board[x][y].stackUnit(x, y, unit)) {
            if (unit.getTeam() == GameStatus.WHITE.ordinal()) {
                turnStatus = GameStatus.WHITE.ordinal();
            } else {
                turnStatus = GameStatus.BLACK.ordinal();
            }
            return true;
        }
        return false; // will cause redo!!
    }

    public void giveupGame(Unit unit) {
        if (unit.getTeam() == GameStatus.WHITE.ordinal()) {
            setTurnStatus(4);
        } else {
            setTurnStatus(3);
        }
    }

    private void giveupTurn(Unit unit) {
        if (unit.getTeam() == GameStatus.WHITE.ordinal()) {
            setTurnStatus(1);
        } else {
            setTurnStatus(2);
        }
    }

    /**
     *
     */
    private void unitsInitialize() {
        Unit whiteSmall0 = new SmallUnit(1);
        Unit whiteSmall1 = new SmallUnit(1);
        Unit whiteMedium0 = new MediumUnit(1);
        Unit whiteMedium1 = new MediumUnit(1);
        Unit whiteLarge0 = new LargeUnit(1);
        Unit whiteLarge1 = new LargeUnit(1);

        whiteSmall0.setTeam(0);
        whiteSmall1.setTeam(0);
        whiteMedium0.setTeam(0);
        whiteMedium1.setTeam(0);
        whiteLarge0.setTeam(0);
        whiteLarge1.setTeam(0);

        whiteSmall0.setOnBoard(false);
        whiteSmall1.setOnBoard(false);
        whiteMedium0.setOnBoard(false);
        whiteMedium1.setOnBoard(false);
        whiteLarge0.setOnBoard(false);
        whiteLarge1.setOnBoard(false);

        teamWhite.put("ws0", whiteSmall0);
        teamWhite.put("ws1", whiteSmall1);
        teamWhite.put("wm0", whiteMedium0);
        teamWhite.put("wm1", whiteMedium1);
        teamWhite.put("wl0", whiteLarge0);
        teamWhite.put("wl1", whiteLarge1);

        Unit blackSmall0 = new SmallUnit(2);
        Unit blackSmall1 = new SmallUnit(2);
        Unit blackMedium0 = new MediumUnit(2);
        Unit blackMedium1 = new MediumUnit(2);
        Unit blackLarge0 = new LargeUnit(2);
        Unit blackLarge1 = new LargeUnit(2);

        blackSmall0.setTeam(0);
        blackSmall1.setTeam(0);
        blackMedium0.setTeam(0);
        blackMedium1.setTeam(0);
        blackLarge0.setTeam(0);
        blackLarge1.setTeam(0);

        blackSmall0.setOnBoard(false);
        blackSmall1.setOnBoard(false);
        blackMedium0.setOnBoard(false);
        blackMedium1.setOnBoard(false);
        blackLarge0.setOnBoard(false);
        blackLarge1.setOnBoard(false);

        teamBlack.put("bs0", blackSmall0);
        teamBlack.put("bs1", blackSmall1);
        teamBlack.put("bm0", blackMedium0);
        teamBlack.put("bm1", blackMedium1);
        teamBlack.put("bl0", blackLarge0);
        teamBlack.put("bl1", blackLarge1);
    }
}
