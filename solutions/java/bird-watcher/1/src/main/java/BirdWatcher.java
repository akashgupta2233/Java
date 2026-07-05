
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6]+1;
    }

    public boolean hasDayWithoutBirds() {
        int noBirdsCount = 0;
        for (int birdCount:birdsPerDay){
            if(birdCount==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumTillN = 0;
        for(int i=0 ; i<(numberOfDays<8?numberOfDays:7) ; i++){
            sumTillN+=birdsPerDay[i];
        }
        return sumTillN;
    }

    public int getBusyDays() {
        int busyDayCount = 0;
        for(int birdCountDaily:birdsPerDay){
            if(birdCountDaily>4){
                busyDayCount+=1;
            }
        }
        return busyDayCount;
    }
}
