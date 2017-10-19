package com.boardgame.myung.russianorg;


public class Validator {

    public static int winnerFinder(Board board) {
        if (winningValidator(board, GameStatus.WHITE.ordinal())) {
            return GameStatus.WHITE.ordinal();
        }
        if (winningValidator(board, GameStatus.BLACK.ordinal())) {
            return GameStatus.BLACK.ordinal();
        }
        return GameStatus.EMPTY.ordinal();
    }

//    public static boolean ()

    private static boolean winningValidator(Board board, int team) {
        if (winningValidator(board.getBoard()[0][0], team)
                && winningValidator(board.getBoard()[0][1], team)
                && winningValidator(board.getBoard()[0][2], team)) {
            System.out.println(team + " " + "won!");
            return true;
        } else if (winningValidator(board.getBoard()[1][0], team)
                && winningValidator(board.getBoard()[1][1], team)
                && winningValidator(board.getBoard()[1][2], team)) {
            System.out.println(team + " " + "won!");
            return true;
        } else if (winningValidator(board.getBoard()[2][0], team)
                && winningValidator(board.getBoard()[2][1], team)
                && winningValidator(board.getBoard()[2][2], team)) {
            System.out.println(team + " " + "won!");
            return true;
        }
        else if (winningValidator(board.getBoard()[0][0], team)
                && winningValidator(board.getBoard()[1][0], team)
                && winningValidator(board.getBoard()[2][0], team)) {
            System.out.println(team + " " + "won!");
            return true;
        } else if (winningValidator(board.getBoard()[0][1], team)
                && winningValidator(board.getBoard()[1][1], team)
                && winningValidator(board.getBoard()[2][1], team)) {
            System.out.println(team + " " + "won!");
            return true;
        } else if (winningValidator(board.getBoard()[0][2], team)
                && winningValidator(board.getBoard()[1][2], team)
                && winningValidator(board.getBoard()[2][2], team)) {
            System.out.println(team + " " + "won!");
            return true;
        }
        else if (winningValidator(board.getBoard()[0][0], team)
                && winningValidator(board.getBoard()[1][1], team)
                && winningValidator(board.getBoard()[2][2], team)) {
            System.out.println(team + " " + "won!");
            return true;
        } else if (winningValidator(board.getBoard()[2][0], team)
                && winningValidator(board.getBoard()[1][1], team)
                && winningValidator(board.getBoard()[0][2], team)) {
            System.out.println(team + " " + "won!");
            return true;
        }
        return false;
    }

    private static boolean winningValidator(BoardCell cell, int team) {
        if (getStatus(cell, team) == team) {
            return true;
        }
        return false;
    }

    /**
     * Determine the stack of the cell
     * @param cell board cell
     * @param team white=1, black=2
     * @return status whether 0, 1, 2
     */
    private static int getStatus(BoardCell cell, int team) {
        if (cell.getStatus() == GameStatus.BOTH.ordinal()) {
            return team;
        }
        return cell.getStatus();
    }



}