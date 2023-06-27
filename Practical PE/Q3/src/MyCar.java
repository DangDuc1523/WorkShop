
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCar implements ICar {
   @Override
   public int f1(List<Car> t) {
     int sum = 0;
       for (Car car : t) {
           sum += car.getRate();
       }
       return sum/t.size();
   }

    @Override
    public void f2(List<Car> t) {
       int maxIndex = 0;
       int minIndex = 0;
       int maxRate = Integer.MAX_VALUE;
       int minRate = Integer.MIN_VALUE;
       for(int i = 0 ; i < t.size(); i++){
           if(t.get(i).getRate() > maxRate){
               maxRate = t.get(i).getRate();             
               maxIndex = i;
           }
           if(t.get(i).getRate() < minRate){
               minRate = t.get(i).getRate();
               minIndex = i;
       }
      Collections.swap(t, maxIndex, minIndex);   
       }
    }    

    @Override
    public void f3(List<Car> t) {
       Collections.sort(t, new Comparator<Car>() {
       @Override
       public int compare(Car car1, Car car2) {
           int makerCompare = car1.getMaker().compareTo(car2.getMaker());
           if (makerCompare != 0) {
               return makerCompare;
           } else {
               return Integer.compare(car2.getRate(), car1.getRate());
           }
       }
   });
       }
}

