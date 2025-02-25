package io.cucumber.skeleton;

public class Belly {

    int cukesAte;
    int hoursWaited;

    public void eat(int cukes) {
        cukesAte += cukes;
    }

    public void wait(int hours){
        hoursWaited += hours;
    }

    public boolean shouldGrowl(){
        return cukesAte > 0 && hoursWaited > 0;
    }
}
