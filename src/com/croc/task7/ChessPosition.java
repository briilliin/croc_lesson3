package com.croc.task7;

public class ChessPosition {

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x;
    private int y;

    public ChessPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) throws IllegalPositionException{
        if(x < 0 || x > 7) throw new IllegalPositionException("вышли за границу допустимых значений");
        this.x = x;
    }

    public void setY(int y) throws IllegalPositionException{
        if(x < 0 || x > 7) throw new IllegalPositionException("вышли за границу допустимых значений");
        this.y = y;
    }

    @Override
    public String toString() {
        return (char)(this.x + 97) + Integer.toString(this.y + 1);

    }





}
