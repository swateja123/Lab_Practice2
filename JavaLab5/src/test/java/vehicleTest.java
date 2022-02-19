import static org.junit.Assert.*;

public class vehicleTest {
vehicle v;

    @org.junit.Before
    public void setUp() throws Exception
    {
        v= new vehicle(1,"Maruti","Alto",5,"MH123444");
    }


    @org.junit.Test
    public void getId()
    {
        assertEquals(1,v.getId());
    }

    @org.junit.Test
    public void getBrandName()
    {
        assertEquals("Maruti",v.getBrandName());
    }

    @org.junit.Test
    public void getModel()
    {
        assertEquals("Alto",v.getModel());
    }

    @org.junit.Test
    public void getSeatNo()
    {
        assertEquals(5,v.getSeatNo());
    }

    @org.junit.Test
    public void getPlate()
    {
        assertEquals("MH123444",v.getPlate());
    }

    @org.junit.After
    public void tearDown() throws Exception
    {

        System.out.println("Test case running Successfully");
    }

}