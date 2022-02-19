public class vehicle
{
  public  int id;
    public String brandName;
    public String model;
    public int seatNo;
    public String plate;
    public vehicle(int id, String brandName, String model, int seatNo, String plate)
    {
        this.id = id;
        this.brandName = brandName;
        this.model = model;
        this.seatNo = seatNo;
        this.plate = plate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatNo()
    {
        return seatNo;
    }

    public void setSeatNo(int seatNo)
    {
        this.seatNo = seatNo;
    }

    public String getPlate()
    {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
