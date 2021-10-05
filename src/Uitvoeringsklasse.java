import java.awt.*;

public class Uitvoeringsklasse
{public static void main(String[] args)
{try {
    Wagen wagen1 = new Wagen("Opel", "luxe", Color.WHITE, 1000);
    Wagen wagen2 = new Wagen("Opel", "luxe", Color.RED, 2000);
    Wagen wagen3 = new Wagen("Opel", "luxe", Color.BLACK, 3000);
    Garage garage = new Garage();
    garage.toevoegenWagen(wagen1, 1);
    garage.toevoegenWagen(wagen2, 2);
    garage.toevoegenWagen(wagen3, 3);
    //expected 3000
    System.out.println("De hoogste kilomterstand  is " + garage.hoogsteKilometerstand().getKilometerstand());
    Wagen wagen4 = new Wagen("Opel", "luxe", Color.WHITE, 4000);
    //wagen2 wordt vervangen door wagen4
    garage.toevoegenWagen(wagen4, 2);
    System.out.println("De hoogste kilometerstand is: " + garage.hoogsteKilometerstand().getKilometerstand());
}
catch(Exception e )
{
    System.out.println(e.getMessage());
}
}


}
