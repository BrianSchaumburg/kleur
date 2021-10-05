import org.junit.jupiter.api.Test;


import java.awt.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testKlasse {
    @Test
    public void wagenTest()
    {//alle methodes worden hier getest
        Wagen wagen1 = new Wagen("Opel", "Luxe", Color.WHITE, 1000);
        wagen1.rijd(2000);
        assertEquals(wagen1.getKilometerstand(), 2000);

    }
    @Test
    public void garageTest()
    {//alle methodes van garage worden hier getest
        Wagen wagen1 = new Wagen("Opel", "luxe", Color.WHITE, 1000   );
        Wagen wagen2 = new Wagen("Opel", "luxe", Color.RED, 2000   );
        Wagen wagen3 = new Wagen("Opel", "luxe", Color.BLACK, 3000   );
        Garage garage = new Garage()    ;
        garage.toevoegenWagen(wagen1,1);
        garage.toevoegenWagen(wagen2,2);
        garage.toevoegenWagen(wagen3,3);
        assert(garage.getGarage()[0]!=null);
        assert(garage.getGarage()[1]!=null);
        assert(garage.getGarage()[2]!=null);
        assertTrue(garage.hoogsteKilometerstand() == wagen3);
        assertEquals(garage.getGarage()[0].getKilometerstand(), wagen1.getKilometerstand());
        assertEquals(garage.getGarage()[1].getKilometerstand(), wagen2.getKilometerstand());
        assertEquals(garage.getGarage()[2].getKilometerstand(), wagen3.getKilometerstand()) ;
        Wagen wagen4 = new Wagen("Opel","Luxe", Color.RED, 4000);
        garage.toevoegenWagen((wagen4), 2);
        assertTrue(garage.hoogsteKilometerstand() == wagen4);
        assertTrue(garage.getGarage()[1]== wagen4 );

    }
}
