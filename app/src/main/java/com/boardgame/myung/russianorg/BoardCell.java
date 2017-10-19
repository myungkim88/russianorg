package com.boardgame.myung.russianorg;

import java.util.Iterator;
import java.util.Stack;

public class BoardCell {
    private Stack<Unit> cell;
    private int status; //0=blank, 1=white, 2=black, 3=both


    public BoardCell() {
        cell = new Stack<>();
    }

    public Stack<Unit> getCell() {
        return cell;
    }

    public void setCell(Stack<Unit> cell) {
        this.cell = cell;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Unit getUnit(Unit unit) {
        unit.setOnBoard(true);
        if (cell.size() > 1) {
            cell.pop();
            showUnitOnTop().setCovered(false);
            Board.
        }
        return unit;
    }

    public boolean stackUnit(int x, int y, Unit unit) {
        if (cell.size() < 3 && showUnitOnTop().getSize() <= unit.getSize() && !unit.isCovered()) {
            if (cell.size() == 0) {
                status = unit.getTeam();
            } else {
                Unit top = showUnitOnTop();
                if (cell.size() == 1) {
                    if (top.getTeam() == GameStatus.WHITE.ordinal()) {
                        status = GameStatus.WHITE.ordinal();
                    } else {
                        status = GameStatus.BLACK.ordinal();
                    }
                } else {
                    Iterator<Unit> iter = cell.iterator();
                    status = unit.getTeam();
                    while (iter.hasNext()) {
                        Unit tempUnit = (Unit) iter;
                        if (tempUnit.getTeam() != unit.getTeam()) {
                            status = GameStatus.BOTH.ordinal();
                            break;
                        }
                        iter.next();
                    }
                }
                top.setCovered(true);
            }
            cell.push(unit);
            unit.setOnBoard(true);
            unit.setX(x);
            unit.setY(y);

            return true;
        }

        return false;
    }



    public Unit showUnitOnTop() {
        if (cell.isEmpty()) {
            return null;
        }
        return cell.peek();
    }

}
