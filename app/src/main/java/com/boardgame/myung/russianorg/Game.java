package com.boardgame.myung.russianorg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Game {

    public static void main(String[] args) throws IOException {

        Board board = new Board();
        while (Validator.winnerFinder(board) != GameStatus.EMPTY.ordinal()) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            out.print("Enter coordinate in form of u,x,y");
            String s = br.readLine();
            try{
                int i = Integer.parseInt(br.readLine());
                out.println(s);
                String[] nums = s.split(",");
                String str = nums[0];
                int x = Integer.parseInt(nums[1]);
                int y = Integer.parseInt(nums[2]);

//                board.stackUnit(x,y, unit);

            }catch(NumberFormatException nfe){
                System.err.println("Invalid Format! retype");
            }
        }

    }

}
