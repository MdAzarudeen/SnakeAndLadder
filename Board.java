package com.example.snakeandladder;

import javafx.util.Pair;
import java.util.ArrayList;

public class Board {
    ArrayList<Pair<Integer, Integer>> positionCoordinates;
    ArrayList<Integer> snakeLadderPosition;

    public Board(){
        positionCoordinates = new ArrayList<>();
        populatePosCord();
        populateSnakeLadderPosition();
    }

    private void populatePosCord(){
        positionCoordinates.add(new Pair(0,0));  //dummy
        for (int i = 0; i <SnakeAndLadder.height ; i++) {
            for (int j = 0; j <SnakeAndLadder.width ; j++) {
//                X coordinates
                int xcord =0;
                if(i%2==0)
                {
                    xcord = j*SnakeAndLadder.tileSize + SnakeAndLadder.tileSize/2;
                }
                else {
                    xcord = SnakeAndLadder.tileSize*SnakeAndLadder.height - (j*SnakeAndLadder.tileSize) - (SnakeAndLadder.tileSize/2);
                }
                // y coordinates
                int ycord = SnakeAndLadder.tileSize*SnakeAndLadder.height - (i*SnakeAndLadder.tileSize) - (SnakeAndLadder.tileSize/2);
                positionCoordinates.add(new Pair(xcord, ycord));

            }
        }
    }

    private void populateSnakeLadderPosition(){
        snakeLadderPosition = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            snakeLadderPosition.add(i);
        }
        snakeLadderPosition.set(4,25);
        snakeLadderPosition.set(13,46);
        snakeLadderPosition.set(27,5);
        snakeLadderPosition.set(33,49);
        snakeLadderPosition.set(50,69);
        snakeLadderPosition.set(42,63);
        snakeLadderPosition.set(62,81);
        snakeLadderPosition.set(74,92);
        snakeLadderPosition.set(40,3);
        snakeLadderPosition.set(43,18);
        snakeLadderPosition.set(54,31);
        snakeLadderPosition.set(66,45);
        snakeLadderPosition.set(76,58);
        snakeLadderPosition.set(89,53);
        snakeLadderPosition.set(99,41);
    }
    public int getNewPosition(int currentPosition){
        if(currentPosition>0 && currentPosition<=100)
            return snakeLadderPosition.get(currentPosition);

        return -1;
    }
    int getXCoordinates(int position){
        if(position>=1&&position<=100)
            return positionCoordinates.get(position).getKey();
        else
            return -1;
    }
    int getYCoordinates(int position){
        if(position>=1&&position<=100)
            return positionCoordinates.get(position).getValue();
        else
            return -1;
    }

//    public static void main(String[] args) {
//        Board board = new Board();
//        for (int i = 0; i <board.positionCoordinates.size() ; i++) {
//            System.out.println(i+" $ X:" + board.positionCoordinates.get(i).getKey()+
//                    " y: "+ board.positionCoordinates.get(i).getValue()
//            );
//        }
//    }
}
