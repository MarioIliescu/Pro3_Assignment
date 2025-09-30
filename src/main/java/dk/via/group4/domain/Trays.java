package dk.via.group4.domain;

public class Trays
{
  private String partType, regNo;
  private double maxWeight;
  public Trays(String partType, double maxWeight, String regNo)
  {
    this.maxWeight = maxWeight;
    this.partType = partType;
    this.regNo = regNo;
  }

  public String getRegNo()
  {
    return regNo;
  }
  public double getMaxWeight()
  {
    return maxWeight;
  }
  public String getPartType()
  {
    return partType;
  }

  public void setRegNo(String regNo)
  {
    this.regNo = regNo;
  }
  public void setMaxWeight(double maxWeight)
  {
    this.maxWeight = maxWeight;
  }
  public void setPartType(String partType)
  {
    this.partType = partType;
  }
}
