package qualifier3;

@QualifierMultiple2(FazlaSecenekler.BIRINCI)
public class Patron2 implements IPatron {

    @Override
    public String surum(String data){
        return "QualifierMultiple ENUM BIRINCI: "+data;
    }
}
