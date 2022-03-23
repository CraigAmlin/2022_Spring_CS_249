package edu.amlinc.Assign04;

public class BusinessCard {
    private String business;
    private String[] slogan;
    private char border;

    public BusinessCard(String name, String[] sloganLines, char boundaryChar){
      business = name;
      slogan = sloganLines;
      border = boundaryChar;
    }
    public String getName(){
        return business;
    }
    public char getBoundaryChar(){
        return border;
    }
    public String getSlogan(){
        int i;
        String s = "";
        for(i = 0; i < slogan.length; i++){
            s = s + slogan[i] + "\n";
        }
        return s;
    }
    public void setName(String name){
        business = name;
    }
    public void setBoundaryChar(char boundryChar){
        border = boundryChar;
    }
    public void setSlogan(String[] sloganLines){
        slogan = sloganLines;
    }
    public String toString(){
        String card = "";
        char space = ' ';
        int i;
        card = multiChar(border, 42) + "\n";
        card = card + border + space + business + multiChar(space, 39-business.length()) + border + "\n";
        card = card + border + multiChar(space,40) + border + "\n";
        for(i = 0; i < slogan.length; i++){
            card = card + border + space + slogan[i] + multiChar(space, 39-slogan[i].length()) + border + "\n";
        }
        for(i = slogan.length; i < 4; i++){
            card = card + border + multiChar(space,40) + border + "\n";
        }
        card =card + multiChar(border, 42) + "\n";
        return card;
    }
    private String multiChar(char c, int t){
        String out = "";
        int i;
        for(i = 0; i < t; i++){
            out = out + c;
        }
        return out;
    }
}
