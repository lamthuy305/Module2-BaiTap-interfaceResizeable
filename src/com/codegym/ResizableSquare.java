package com.codegym;

public class ResizableSquare extends Square implements Resizable{
    public ResizableSquare() {
    }

    public ResizableSquare(double side) {
        super(side);
    }

    public ResizableSquare(double side,String color, boolean filled) {
        super(color, filled, side);
    }

    @Override
    public void resize(double percent) {

    }
}
