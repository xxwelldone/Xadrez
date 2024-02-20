package boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Row: "+ row+" ");
        sb.append("Column: "+column);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Teste position in boardgame");
        Position p = new Position(2, 5);
        System.out.println(p);
    }
}
