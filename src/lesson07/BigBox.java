package lesson07;

/**
 * Created by Валентин on 02.10.2016.
 */
public class BigBox extends Box {
    private static boolean size = true;

    @Override
    public boolean isSize() {
        return size;
    }

    @Override
    public void setCat(Cat fatCat) {
        this.cat = fatCat;
        fatCat.meow();
    }

    @Override
    public void setCat(FatCat cat) {
        setCat((Cat) cat);
    }
}
