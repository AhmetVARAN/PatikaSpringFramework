package qualifier3;

@QualifierMultiple2(FazlaSecenekler.IKINCI)
public class Patron3 implements IPatron {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM IKINCI: "+data;
    }
}
