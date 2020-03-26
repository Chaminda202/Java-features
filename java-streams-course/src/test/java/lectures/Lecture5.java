package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
//    cars.stream().filter(car -> car.getPrice() < 10000).collect(Collectors.toList()).forEach(System.out::println);
//    cars.stream().filter(car -> car.getPrice() < 10000).forEach(System.out::println);
//    cars.stream().filter(carPredicate).forEach(System.out::println);
    cars.stream().filter(this::checkingPrice).forEach(System.out::println);

  }

  private boolean checkingPrice(Car car){
    return car.getPrice() < 10000;
  }

  final Predicate<Car> carPredicate = car -> car.getPrice() < 10000;
  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();

    /*final List<PersonDTO> dtoList = people.stream()
            .map(person -> {
              PersonDTO dto = new PersonDTO(person.getId(), person.getFirstName().concat(" ").concat(person.getLastName()), person.getAge());
              return dto;
            })
            .collect(Collectors.toList());
     assertThat(dtoList.size()).isEqualTo(1000);
     assertThat(dtoList).hasSize(1000);

    people.stream()
            .map(person -> PersonDTO.map(person))
            .forEach(System.out::println);*/

    people.stream()
            .map(PersonDTO::map)
            .forEach(System.out::println);
  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    List<Person> people = MockData.getPeople();
    OptionalDouble average = people.stream()
            .mapToDouble(person -> person.getAge())
            .average();

    System.out.println(average.getAsDouble());
  }

  @Test
  public void test() throws Exception {

  }
}



