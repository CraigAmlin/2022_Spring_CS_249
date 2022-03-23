package edu.amlinc.Assign05;

public class CharImage {
    public CharImage(int row, int col, char fill){
        char [][] arr = new char[row][col];
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                arr[r][c] = fill;
            }
        }
    }
}
