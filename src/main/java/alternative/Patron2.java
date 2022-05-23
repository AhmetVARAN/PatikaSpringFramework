package alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements IPatron {

    @Override
    public String surum(String data){
        return "patron2 "+data;
    }
}
