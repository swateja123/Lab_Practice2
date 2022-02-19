public class rental
{
   public String customer_name;
   public String start_date,last_date;
 public  int id,seats;
  public String brand,model;
  public String plate;

   vehicle v;
   public rental(String customer_name, String start_date, String last_date,

                  int id, String brand, String model, int seats, String plate)
   {
      this.customer_name = customer_name;
      this.start_date = start_date;
      this.last_date = last_date;
      this.id=id;
      this.brand=brand;
      this.model=model;
      this.seats=seats;
      this.plate=plate;

   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public String getCustomer_name() {
      return customer_name;
   }

   public void setCustomer_name(String customer_name) {
      this.customer_name = customer_name;
   }

   public String getStart_date() {
      return start_date;
   }

   public void setStart_date(String start_date) {
      this.start_date = start_date;
   }

   public String getLast_date() {
      return last_date;
   }

   public void setLast_date(String last_date) {
      this.last_date = last_date;
   }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public vehicle getV() {
      return v;
   }

   public void setV(vehicle v) {
      this.v = v;
   }

}
