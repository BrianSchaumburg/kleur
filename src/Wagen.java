import java.awt.*;
public class Wagen {
    private String naam, type; Color kleur; private int kilometerstand;
    private void setNaam(String merknaam)
    {
        if(merknaam == "opel" || merknaam == "vw" || merknaam =="mercedes" )

            naam = merknaam;


        else
            throw new IllegalArgumentException("Check de parameters");
    }

    private void setKleur(Color kleur) {

        if((kleur == Color.WHITE || kleur == Color.RED || kleur == Color.BLACK))
           this.kleur = kleur;



        else
            throw new IllegalArgumentException("check the parameters");
    }
    private void setKilometers(int kilometers
    )
    {
        if(kilometers<0)
        {
            throw new IllegalArgumentException("Check the kilometers");
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

    public Wagen(String naam, String type, Color kleur, int kilometerstand) {
        setKleur(kleur);
        setNaam(naam);
        setKilometers(kilometerstand);
        if((type!=null && type.trim().isEmpty() ) && Character.isUpperCase(type.charAt(0) ))
            this.type
                     = type;
    }

}
