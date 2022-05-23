package qualifier3;

@QualifierMultiple2(FazlaSecenekler.UCUNCU)
public class Patron4 implements IPatron {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM UCUNCU: "+data;
    }
}
