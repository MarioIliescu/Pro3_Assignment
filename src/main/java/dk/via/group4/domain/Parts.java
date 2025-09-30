package dk.via.group4.domain;

public class Parts
{
  private double weight;
  private String animalRegNo, regNo;

  public Parts(double weight, String animalRegNo, String regNo)
  {
    this.weight = weight;
    this.animalRegNo = animalRegNo;
    this.regNo = regNo;
  }

  public void setRegNo(String regNo)
  {
    this.regNo = regNo;
  }

  public String getRegNo()
  {
    return regNo;
  }

  public void setWeight(double weight)
  {
    this.weight = weight;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setAnimalRegNo(String animalRegNo)
  {
    this.animalRegNo = animalRegNo;
  }

  public String getAnimalRegNo()
  {
    return animalRegNo;
  }
}
