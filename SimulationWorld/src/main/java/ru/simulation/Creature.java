package ru.simulation;

abstract class Creature extends Entity{
  private int speed;
  private int hp;

  public abstract void makeMove();
}