public class CarsAssemble {
    private static double productionRate = 221;
    public double productionRatePerHour(int speed) {
        if(speed<5){
            return productionRate*speed;
        }else if(speed<9){
            return productionRate*speed*0.9;
        }else if(speed==9){
            return productionRate*speed*0.8;
        }else{
            return productionRate*speed*0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
    }
}
