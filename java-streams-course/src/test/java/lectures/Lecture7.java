package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import com.google.common.collect.ImmutableList;
import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture7 {

  @Test
  public void count() throws Exception {
    List<Car> cars = MockData.getCars();
    long numberOfGreenCars = cars.stream()
            .filter(car -> car.getColor().equalsIgnoreCase("Green"))
            .count();
    System.out.println(numberOfGreenCars);
  }

  @Test
  public void min() throws Exception {
    List<Car> cars = MockData.getCars();
    /*final double minGreenCarPrice = cars.stream()
            .filter(car -> car.getColor().equalsIgnoreCase("Green"))
            .mapToDouble(car -> car.getPrice())
            .min()
            .orElse(0);*/
    final double minGreenCarPrice = cars.stream()
            .filter(car -> car.getColor().equalsIgnoreCase("Green"))
            .mapToDouble(Car::getPrice)
            .min()
            .orElse(0);
    System.out.println(minGreenCarPrice);
  }

  @Test
  public void max() throws Exception {
    List<Car> cars = MockData.getCars();
    final double maxGreenCarPrice = cars.stream()
            .filter(car -> car.getColor().equalsIgnoreCase("Green"))
            .mapToDouble(Car::getPrice)
            .max()
            .orElse(0);
    System.out.println(maxGreenCarPrice);
  }


  @Test
  public void average() throws Exception {
    List<Car> cars = MockData.getCars();
    final double averageGreenCarPrice = cars.stream()
            .filter(car -> car.getColor().equalsIgnoreCase("Green"))
            .mapToDouble(Car::getPrice)
            .average()
            .orElse(0);
    System.out.println(averageGreenCarPrice);
  }

  @Test
  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
    double sum = cars.stream()
        .mapToDouble(Car::getPrice)
        .sum();
    BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
    System.out.println(sum);
    System.out.println(bigDecimalSum);

  }

  @Test
  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
    DoubleSummaryStatistics statistics = cars.stream()
        .mapToDouble(Car::getPrice)
        .summaryStatistics();
    System.out.println(statistics);
    System.out.println(statistics.getAverage());
    System.out.println(statistics.getCount());
    System.out.println(statistics.getMax());
    System.out.println(statistics.getMin());
    System.out.println(statistics.getSum());
  }

}