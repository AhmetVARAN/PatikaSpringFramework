package alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements IPatron {
    //@Alternative:
    @Override
    public String surum(String data){
        return "patron1 "+data;
    }
}
