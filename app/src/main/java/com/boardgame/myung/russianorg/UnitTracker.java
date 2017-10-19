package com.boardgame.myung.russianorg;

import java.util.HashMap;

public class UnitTracker {
    static HashMap<String, Unit> teamWhite;
    static HashMap<String, Unit> teamBlack;

    private UnitTracker() {
        teamWhite = new HashMap<String, Unit>();
        teamBlack = new HashMap<String, Unit>();
//        unitsInitialize();
    }


}
