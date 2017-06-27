package exercise;

/**
 * Created by paul on 27.06.17.
 */
public class Fridge {
    Object item;

    public Object returnItem() {
        Object tmp = this.item;
        this.item=null;
        return tmp;
    }

    public void acceptItem(Object item) {
        if(this.item==null)
        this.item = item;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "item=" + item +
                '}';
    }
}
