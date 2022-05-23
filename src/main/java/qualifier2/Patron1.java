package qualifier2;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements IPatron {
    //@Alternative:Aynı anda sadece 1 tane proje çalışıyor. Diğerleri inaktif durumda
    //@Qualifier:Aynı anda 1den fazla proje aktif ancak default olarak çalışacak projeyi belirtiyoruz.
    @Override
    public String surum(String data){
        return "default data: "+data;
    }
}
