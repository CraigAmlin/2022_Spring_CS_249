package edu.amlinc.Assign04;

public class BusinessCard {
    private String business;
    private String[] slogan;
    private char border;

    public BusinessCard(String name, String[] sloganLines, char boundryChar){
      business = name;
      slogan = sloganLines;
      border = boundryChar;
    }
    public String getName(){
        return business;
    }
    public char getBoundryChar(){
        return border;
    }
    public String getSlogan(){
        return slogan.toString();
    }
    public void setName(String name){
        business = name;
    }
    public void setBoundryChar(char boundryChar){
        border = boundryChar;
    }
    public void setSlogan(String[] sloganLines){
        slogan = sloganLines;
    }
    public String toString(){
        String card = "";
        String line = "";
        char space = ' ';
        int i;
        card = multiChar(border, 42) + "/n";
        line = border + multiChar(space,40) + border + "/n";
        card = card + line;
        for(i = 0; i < 4; i++){
            line = border + space + slogan[0] + multiChar(space, 40-slogan[0].length());
            card = card + line;
        }
        line = multiChar(border, 42) + "/n";
        card = card + line;
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
