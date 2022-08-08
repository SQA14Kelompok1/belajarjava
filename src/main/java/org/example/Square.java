package org.example;

public class Square {

    private int rusuk;

    public Square(int rusuk){
        this.rusuk = rusuk;
    }
	
	//update description function

    public int getluas(){
        int luas=rusuk*rusuk;
        return luas;

    }

}
