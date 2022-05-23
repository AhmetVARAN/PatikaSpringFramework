package alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements IPatron {
    //@Alternative:Aynı anda sadece 1 tane proje çalışıyor. Diğerleri inaktif durumda
    @Override
    public String surum(String data){
        return "patron1 "+data;
    }
}
