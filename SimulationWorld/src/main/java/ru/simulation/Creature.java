package ru.simulation;

//Абстрактный класс, наследуется от Entity
abstract class Creature extends Entity{
  private int speed;
  private int hp;

  public abstract void makeMove();
}
