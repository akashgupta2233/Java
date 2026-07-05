public class Lasagna {
    private static int EXPECTED_MINUTES=40;
    private static int LAYER_COUNT = 0;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int passedHours){
        return EXPECTED_MINUTES-passedHours;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layersCount){
        return 2*layersCount;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layersCount, int timePassed){
        return (2*layersCount)+timePassed;
    }
}
