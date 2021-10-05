import java.lang.reflect.Array;
import java.util.*;
public class Garage {
    private Wagen[] garage;

    public Wagen[] getGarage() {
        return garage;
    }

    public Garage(){garage = new Wagen[3];}
    public void toevoegenWagen(Wagen wagen, int positie)
    {
        if(positie>3 || positie<=0 || wagen == null)
        {
            throw new IllegalArgumentException("Check de parameters");
        }
        else {
            switch (positie) {
                case 1:
                    garage[0] = wagen;
                    break;
                case 2:

                    garage[1] = wagen;
                break;
                case 3 :
                    garage[2]=  wagen;
                break;
                default: throw new IllegalArgumentException("Er is iets foutgelopen");
            }
        }
    }
    public Wagen hoogsteKilometerstand()
    {   List<Integer>temp = new ArrayList<Integer>();
        for(int i=0; i < garage.length; i ++ ) {
            if (garage[i] != null)
                temp.add(garage[i].getKilometerstand());
        }
        int max= Collections.max(temp);
        if(max == temp.get(0))
        {
            return garage[0];
        }
        else if (max == temp.get(1))
        {
            return garage[1];
        }
        else
            return garage[2];

    }
    //hier kan nog toString toegevoegd worden

    @Override
    public String toString() {
        return "De hoogste kilometerstand is: "+this.hoogsteKilometerstand().getKilometerstand();
    }
}
