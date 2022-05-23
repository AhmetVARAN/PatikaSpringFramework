package qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {
//    //defaultta çalışacak kodlar
//    @Inject
//    private IPatron patronInterface;

//    //istediğimiz seçeneği seçiyorum. BIRINCIsini seçelim
//    @Inject
//    @QualifierMultiple2(FazlaSecenekler.BIRINCI)
//    private IPatron patronInterface;

    //istediğimiz seçeneği seçiyorum. IKINCIsini seçelim
    @Inject
    @QualifierMultiple2(FazlaSecenekler.IKINCI)
    private IPatron patronInterface;

    public String getData(String data){

        return patronInterface.surum(data);
    }
}
