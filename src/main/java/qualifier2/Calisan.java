package qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {
//    //defaultta çalışacak kodlar
//    @Inject
//    private IPatron patronInterface;

    //defaultta çalışacak kodlar
    @Inject
    @QualifierMultiple
    private IPatron patronInterface;

    public String getData(String data){

        return patronInterface.surum(data);
    }
}
