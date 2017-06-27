package exercise;

/**
 * Created by paul on 27.06.17.
 */
public class FridgeGen<T extends InternalOrgan> {
    private T item;

    public T returnItem() {
        T tmp = this.item;
        this.item=null;
        return tmp;
    }

    public void acceptItem(T item) {
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
