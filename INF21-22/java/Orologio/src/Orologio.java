public class Orologio {
    private int h;
    private int m;
    private int s;

    Orologio(int ore, int minuti, int secondi) {
        h = ore;
        m = minuti;
        s = secondi;
    }

    public void setZero() {
        h = 0;
        m = 0;
        s = 0;
    }

    public void correctTime(int ore, int minuti, int secondi) {
        h = ore;
        m = minuti;
        s = secondi;
    }

    public String getTime() {
        return ""+h+m+s; // "" used to auto cast ints to strings
    }
}
