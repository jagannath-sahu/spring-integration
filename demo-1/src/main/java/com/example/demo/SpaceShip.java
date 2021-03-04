package com.example.demo;

public class SpaceShip {
  public String name;
  public Double fuel=15.0d;


  public SpaceShip(String name) {
      this.name = name;
  }

  @Override
  public String toString() {
      return "SpaceShip{" +
              "name='" + name + '\'' +
              ", fuel=" + fuel +
              '}';
  }
}