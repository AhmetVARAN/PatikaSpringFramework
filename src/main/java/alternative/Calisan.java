package alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {

    @Inject
    private IPatron patronInterface;

    //parametresiz constructor
    public Calisan(){
        //patronInterface = new Patron();   //inject yapınca new yapmaya gerek kalmıyor
    }

    public String getData(String data){

        return patronInterface.surum(data);
    }
}
