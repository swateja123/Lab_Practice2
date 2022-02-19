import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class rentalTest {
rental r;
    @Before
    public void setUp() throws Exception
    {
        r=new rental("Amitabh","12/02/2022","18/02/2022",1,"Maruti","Alto",5,"MH123444");
    }

    @Test
    public void getId()
    {
        assertEquals(1,r.getId());
    }

    @Test
    public void getBrand()
    {
        assertEquals("Maruti",r.getBrand());
    }

    @Test
    public void getCustomer_name()
    {
        assertEquals("Amitabh",r.getCustomer_name());
    }

    @Test
    public void getStart_date()
    {
        assertEquals("12/02/2022",r.getStart_date());
    }

    @Test
    public void getLast_date()
    {
        assertEquals("18/02/2022",r.getLast_date());
    }


    @Test
    public void getSeats()
    {
        assertEquals(5,r.getSeats());
    }

    @Test
    public void getModel() {
        assertEquals("Alto",r.getModel());
    }

    @Test
    public void getPlate()
    {
        assertEquals("MH123444",r.getPlate());
    }


}