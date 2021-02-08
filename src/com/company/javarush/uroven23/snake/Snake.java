package com.company.javarush.uroven23.snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        SnakeSection head = new SnakeSection(x, y);
        sections = new ArrayList<>();
        sections.add(head);
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void move() {
        if(!isAlive) {
            return;
        }
        if(direction == SnakeDirection.UP) {
            move(0, -1);
        }
        else if(direction == SnakeDirection.RIGHT) {
            move(1, 0);
        }
        else if(direction == SnakeDirection.DOWN) {
            move(0, 1);
        }
        else if(direction == SnakeDirection.LEFT) {
            move(-1, 0);
        }
    }

    public void move(int dx, int dy) {
        SnakeSection head = sections.get(0);
        head = new SnakeSection(head.getX() + dx, head.getY() + dy);

        checkBorders(head);
        if(!isAlive()) return;
        checkBody(head);
        if(!isAlive()) return;

        sections.add(0, head);
        if (head.getX() == Room.game.getMouse().getX() && head.getY() == Room.game.getMouse().getY()) {
            Room.game.eatMouse();
        } else {
            sections.remove(sections.size() - 1);
        }
    }

    public void checkBorders(SnakeSection head) {
        if(head.getY() < 0 || head.getY() >= Room.game.getHeight() || head.getX() < 0 || head.getX() >= Room.game.getWidth()) {
            isAlive = false;
        }
    }

    public void checkBody(SnakeSection head) {
        if(sections.contains(head)) {
            isAlive = false;
        }
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
