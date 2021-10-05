import java.util.*;
public class Garage {
    Wagen wagen1, wagen2, wagen3;

    public void setWagen1(Wagen wagen1) {
        if(wagen1!=null)
        this.wagen1 = wagen1;
    }

    public void setWagen2(Wagen wagen2) {
        if(wagen2!=null)
        this.wagen2 = wagen2;
    }

    public void setWagen3(Wagen wagen3) {
        if(wagen3!=null)
        this.wagen3 = wagen3;
    }
    public Garage(Wagen wagen1, Wagen wagen2, Wagen wagen3)
    {setWagen1(wagen1);
        setWagen2(wagen2);
        setWagen3(wagen3);


    }
    public void toevoegenWagen(Wagen wagen, int plaats)
    {if(wagen == null || plaats>3 | plaats <=0) {
        switch (plaats) {
            case 1:
                if (wagen1 == null)
                    wagen1 = wagen;
                break;
            case 2:
                if (wagen2 == null) {
                    wagen2 = wagen;
                }
                break;
            case 3:
                if (wagen3 == null) {
                    wagen3 = wagen;
                }
                break;
            default:
                throw new IllegalArgumentException("Check the position");

        }
    }
    else
        throw new IllegalArgumentException("Check the conditions");
    }
    public Wagen hoogsteKilometerstand()
    {int waarde1 = wagen1.getKilometerstand();
        int waarde2 = wagen2.getKilometerstand();
        int waarde3 = wagen3.getKilometerstand();
       List<Integer> lijst = new ArrayList<>();
       lijst.add(waarde1);
       lijst.add(waarde2);
       lijst.add(waarde3);
       int element  = Collections.max(lijst);
       if(element == wagen1.getKilometerstand())
       {
           return wagen1;
       }
       else if(element == wagen2.getKilometerstand())
       {
           return wagen2;
       }
       else
           return wagen3;

    }
}
