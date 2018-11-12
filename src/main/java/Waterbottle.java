public class Waterbottle {

    private int volume;

    public Waterbottle(int volume){
        this.volume = volume;
    }

    public int drink(){
         int newVolume = volume -10;
         volume = newVolume;
         return volume;

    }

    public int empty(){
        return volume = 0;
    }

    public int fill(){
        return volume = 100;
    }
}

