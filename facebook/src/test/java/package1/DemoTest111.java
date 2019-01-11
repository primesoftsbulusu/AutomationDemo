package package1;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;



import javax.imageio.IIOImage;
import javax.imageio.ImageIO;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import tess4j.ITesseract;


public class DemoTest111 {

   
    ITesseract instance;

    private final String datapath = "src/main/resources/tessdata";
    private final String testResourcesDataPath = "src/test/resources/test-data";

   
    

    @Before
    public void setUp() {
       // instance = new Tesseract();
        instance.setDatapath(new File(datapath).getPath());
    }

   

   
    


    
    /**
     * Test of doOCR method, of class Tesseract.
     *
     * @throws Exception while processing image.
     */
    @Test
    public void testDoOCR_BufferedImage() throws Exception {
       // logger.info("doOCR on a buffered image of a PNG");
        File imageFile = new File(this.testResourcesDataPath, "slide5new.jpg");
        BufferedImage bi = ImageIO.read(imageFile);
      //  String expResult = "The (quick) [brown] {fox} jumps!\nOver the $43,456.78 <lazy> #90 dog";
        String result = instance.doOCR(bi);
        //logger.info(result);
        System.out.println(result);
       // assertEquals(expResult, result.substring(0, expResult.length()));
    }

   

   
}
