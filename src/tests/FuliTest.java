package tests;

import com.exxample.junit.Fuli;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2016/3/28.
 */
public class FuliTest {
          private Fuli fulitext;

    @Before
    public void setUp() throws Exception {
         fulitext =new Fuli();

    }

    @Test
    public void testCaMoney() throws Exception {
        double result=fulitext .CaMoney(100,0.02,5);
        Assert.assertEquals(110.40808032,result);

    }

    @Test
    public void testCaBMoney() throws Exception {
        double result=fulitext .CaAMoney(100,0.02,10) ;
        Assert.assertEquals(1116.8715419732623,result);
    }

    @Test
    public void testCaValue() throws Exception {
             double result=fulitext .CaValue(10000000,0.02,100000);
              Assert.assertTrue(result==0 );
    }




}