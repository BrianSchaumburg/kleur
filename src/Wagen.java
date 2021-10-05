import java.awt.*;
public class Wagen {
    private String naam, type; Color kleur; private int kilometerstand;
    private void setNaam(String merknaam)
    {
        if(merknaam == "Opel" || merknaam == "VW" || merknaam =="Mercedes" )

            naam = merknaam;


        else
this.errorGeven();    }

    private void setKleur(Color kleur) {

        if((kleur == Color.WHITE || kleur == Color.RED || kleur == Color.BLACK))
           this.kleur = kleur;



        else
this.errorGeven();    }
    private void setKilometers(int kilometers
    )
    {
        if(kilometers<0)
        {

            this.errorGeven();
        }
        else
            this.kilometerstand = kilometers;
    }
    public void rijd(int kilometerstand)
    {
        this.setKilometers(kilometerstand);
    }

    public int getKilometerstand() {
        return kilometerstand;
    }
    private void errorGeven()
    {
         throw new IllegalArgumentException("Check de paramters");
    }
    private void setType(String type)
    {
        if(type== null || type.trim().isEmpty() && !Character.isUpperCase(type.charAt(8)))
        {
this.errorGeven();        }
    }
    public Wagen(String naam, String type, Color kleur, int kilometerstand) {
        setKleur(kleur);
        setNaam(naam);
        setKilometers(kilometerstand);
        setType(type);
    }

}
