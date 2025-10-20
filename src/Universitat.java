public class Universitat {
    public int round(int note){
        if(note<38) return note;
        if(note%5>3) return note+5-note%5;
        return note;
    }

    public int[] nicht_bestandende_Noten(int[] noten){

    }

}
