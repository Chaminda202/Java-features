package lectures;


import beans.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Lecture8 {

  @Test
  public void simpleGrouping() throws Exception {
    /*Map<String, List<Car>> carModelGroup = MockData.getCars()
            .stream()
            .collect(Collectors.groupingBy(Car::getModel));

    carModelGroup.forEach(((model, cars) -> {
      System.out.println(model);
      System.out.println("Number of cars " + cars.size());
      cars.forEach(System.out::println);
    }));*/

    Map<String, Long> carModelGroupCount = MockData.getCars()
            .stream()
            .collect(Collectors.groupingBy(Car::getModel, Collectors.counting()));

    carModelGroupCount.forEach((model, count) -> {
      System.out.println(model + " Number of cars " + count);
    });
  }

  @Test
  public void groupingAndCounting() throws Exception {
    ArrayList<String> names = Lists
        .newArrayList(
            "John",
            "John",
            "Mariam",
            "Alex",
            "Mohammado",
            "Mohammado",
            "Vincent",
            "Alex",
            "Alex"
        );
  }

}