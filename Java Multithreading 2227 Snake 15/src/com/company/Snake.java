package com.company;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public void move(){
        if(isAlive){
            if(direction==SnakeDirection.UP){
                move(0,-1);
            }else if (direction==SnakeDirection.RIGHT){
                move(1,0);
            }else if(direction==SnakeDirection.DOWN){
                move(0,1);
            }else if(direction==SnakeDirection.LEFT){
                move(-1,0);
            }
        }
    }

    public void move(int x, int y){

    }

    public Snake(int x, int y) {
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x,y));
        isAlive = true;
    }

    public int getX(){
        return sections.get(0).getX();
    }

    public int getY(){
        return sections.get(0).getY();
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
