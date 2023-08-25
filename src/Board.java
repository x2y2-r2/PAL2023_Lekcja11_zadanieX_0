import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Row> rows;

    public Board() {
        this.rows = new ArrayList<>();
    }

    public void initialize(int size) {
        for (int i = 0; i < size; i++) {
            Row row = new Row();
            row.initialize(size);
            rows.add(i,row);
        }
    }

    public void show() {
        for (Row row : rows) {
            row.show();
            System.out.println();
        }
    }

    public List<Row> getRows() {
        return rows;
    }

}
