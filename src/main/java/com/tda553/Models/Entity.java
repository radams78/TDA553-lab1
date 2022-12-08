package com.tda553.Models;

public abstract class Entity
{
    protected Position pos = new Position(0, 0);

    public Position getPosition()
    {
        return this.pos;
    }

    public void setPosition(int x, int y)
    {
        pos.setPosition(x, y);
    }
}