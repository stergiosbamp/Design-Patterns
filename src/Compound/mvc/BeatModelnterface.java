package Compound.mvc;

public interface BeatModelnterface {
    //These are the methods the controller will use to
    // direct the model based on user interaction
    void initialize(); // this gets called after the BeatModel is instantiated
    void on();
    void off();
    void setBPM(int bpm);

    // These methods allow the view and the
    // controller to get state and to become observers
    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);

    //We’ve split this into two kinds of
    //observers: observers that want to be
    //notified on every beat, and observers
    //that just want to be notified with
    //the beats per minute change.
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
