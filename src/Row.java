import java.util.ArrayList;
import java.util.List;

public class Row {
    List<Field> fields;

    public Row() {
        this.fields = new ArrayList<>();
    }

    public void initialize(int size) {
        for (int i = 0; i < size; i++) {
            fields.add(new Field("_"));
        }
    }

    public void show() {
        for (int i = 0; i < fields.size(); i++) {
            System.out.print(fields.get(i).getSymbol() + " ");
        }
    }
    public void changeFieldSymbol (int index, String symbol) {
        fields.set(index, new Field(symbol));
    }

}