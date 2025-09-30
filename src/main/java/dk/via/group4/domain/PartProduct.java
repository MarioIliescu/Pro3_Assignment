package dk.via.group4.domain;

public class PartProduct extends Product
{
  private int partNumber;
  public PartProduct(String trayRegNrs, String partRegNrs, int id,int partNumber)
  {
    super(trayRegNrs, partRegNrs, id);
    this.partNumber = partNumber;
  }

  public int getPartNumber()
  {
    return partNumber;
  }
  public void setPartNumber(int partNumber)
  {
    this.partNumber = partNumber;
  }
}
