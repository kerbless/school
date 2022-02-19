public class TV {
    private boolean on;
    private int vol;
    private int ch;

    public TV() {
        on = false;
        ch = 1;
        vol = 10;
    }
    public void on() {
       on = true;
    }
    public void off() {
        on = false;
    }
    public void setVol(int vol) {
        this.vol = vol;
    }
    public void chForward(){
        if(ch < 999) ch++;
        else ch = 1;
    }
    public void chBackward(){
        if(ch > 1) ch--;
        else ch = 999;
    }
    public void volRaise(){
        if (vol < 100) vol++;
    }
    public void volLower(){
        if(vol > 0) vol--;
    }
    public void setCh(int ch) {
        this.ch = ch;
    }
    public boolean isOn() {
        return on;
    }
    public int getVol() {
        return vol;
    }
    public int getCh() {
        return ch;
    }
}