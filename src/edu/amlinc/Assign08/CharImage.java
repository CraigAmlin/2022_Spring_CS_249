package edu.amlinc.Assign08;

public class CharImage {
    private char canvas;
    private char [][] arr;
    public CharImage(int row, int col, char fill){
        arr = new char[row][col];
        canvas = fill;
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                arr[r][c] = canvas;
            }
        }
    }
    public void clear(){
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                arr[r][c] = canvas;
            }
        }
    }
    public int getRowCnt(){
        return arr.length;
    }
    public int getColCnt(){
        return arr[0].length;
    }
    public boolean isValidPosition(int row, int col){
        boolean validr, validc;
        validr = (row < getRowCnt()) && (row >= 0);
        validc = (col < getColCnt()) && (col >= 0);
        return validr && validc;
    }
    public char getPos(int row, int col){
        if(isValidPosition(row,col))
            return arr[row][col];
        else
            return ' ';
    }
    public boolean setPos(int row, int col, char c){
        if(isValidPosition(row,col)){
            arr[row][col] = c;
            return true;
        }
        else
            return false;
    }
    public String toString(){
        return getRowCnt() + " x " + getColCnt() + " CharImage (default: " + canvas + ")";
    }
    public String getMapString(){
        String map = "";
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                map += arr[r][c];
            }
            map += "\n";
        }
        return map;
    }
}
