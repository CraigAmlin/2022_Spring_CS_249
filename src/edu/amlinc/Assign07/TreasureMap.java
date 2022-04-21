package edu.amlinc.Assign07;


import java.util.*;
import java.io.*;
public class TreasureMap extends CharImage {
    private int[] pos = new int[2];

    TreasureMap(int row, int col, char fill){
        super(row, col, fill);
        pos[0] = 0;
        pos[1] = 0;
    }

    public void clear(){
        super.clear();
        setCurRow(0);
        setCurCol(0);
    }

    public int getCurRow(){
        return pos[0];
    }

    public int getCurCol(){
        return pos[1];
    }

    public void setCurRow(int r){
        pos[0] = r;
    }

    public void setCurCol(int c){
        pos[1] = c;
    }

    public void parseDirection(String dir) throws TreasureMapException{
        try(Scanner line = new Scanner(dir)){
            String compass = line.next();
            int cnt = line.nextInt();
            int i;
            switch(compass){
                case "north":
                    for(i = pos[0]-cnt; i <= pos[0]; pos[0]--){
                        setPos(pos[0],pos[1], '.');
                    }
                    pos[0]++;
                    break;
                case "east":
                     for(i = pos[1]+cnt; i >= pos[1]; pos[1]++){
                        setPos(pos[0],pos[1], '.');
                    }
                    pos[1]--;
                    break;
                case "south":
                    for(i = pos[0]+cnt; i >= pos[0]; pos[0]++){
                        setPos(pos[0],pos[1], '.');
                    }
                    pos[0]--;
                    break;
                case "west":
                    for(i = pos[1]-cnt; i <= pos[1]; pos[1]--){
                        setPos(pos[0],pos[1], '.');
                    }
                    pos[1]++;
                    break;
                default:
                    throw new TreasureMapException("BAD COMMAND!");
            }
        }
        catch(Exception e){
            throw new TreasureMapException("YE CANNOT MOVE SO!",e);
        }
    }

    public void loadInstructions(String file) throws TreasureMapException{
        try(Scanner fileIn = new Scanner(new File(file));){
            while(fileIn.hasNextLine()){
                parseDirection(fileIn.nextLine());
            }
            setPos(pos[0],pos[1],'X');
        }
        catch(Exception e) {
            clear();
            throw new TreasureMapException("YE CANNOT READ THIS MAP!",e);
        }
    }

    public void saveMap(String file) throws TreasureMapException{
        try(PrintWriter fileOut = new PrintWriter(file)){
            fileOut.print(getMapString());
        }
        catch(Exception e){
            throw new TreasureMapException("SUCH TREASURE NEEDS BE SECRET!",e);
        }
    }
}
