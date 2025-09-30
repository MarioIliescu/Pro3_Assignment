package dk.via.group4.domain;

public abstract class Product
{
  private String trayRegNrs, partRegNrs;
  private int id;
  
  public Product(String trayRegNrs, String partRegNrs, int id){
    this.trayRegNrs = trayRegNrs;
    this.partRegNrs = partRegNrs;
    this.id = id;
  }

  public String getPartRegNrs()
  {
    return partRegNrs;
  }
  public int getId()
  {
    return id;
  }

  public void setPartRegNrs(String partRegNrs)
  {
    this.partRegNrs = partRegNrs;
  }

  public String getTrayRegNrs()
  {
    return trayRegNrs;
  }

  public void setTrayRegNrs(String trayRegNrs)
  {
    this.trayRegNrs = trayRegNrs;
  }
}
