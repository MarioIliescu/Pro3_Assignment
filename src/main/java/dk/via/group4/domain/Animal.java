package dk.via.group4.domain;

import java.util.ArrayList;

public class Animal
{
  private int id;
  private double weight;
  private String regNo;

  public Animal(double weight, String regNo)
  {
    this.weight = weight;
    this.regNo = regNo;
  }

  public Animal(int id, double weight, String regNo)
  {
    this.id = id;
    this.weight = weight;
    this.regNo = regNo;
  }

  public String getRegNo()
  {
    return regNo;
  }

  public void setRegNo(String regNo)
  {
    this.regNo = regNo;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

}
