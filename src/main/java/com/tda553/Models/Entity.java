package com.tda553.Models;

public abstract class Entity
{
    protected int y, x;

    public int[] getPosition()
    {
        int[] position = {x, y};
        return position;
    }

    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}