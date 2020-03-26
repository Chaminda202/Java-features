package lectures;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    StringBuilder name = new StringBuilder();
    /*names.stream().forEach(item -> {
      name.append(item).append(",");
    });
    System.out.println(name.toString());*/

    /*for (int i=0; i< names.size(); i++){
      if(i != names.size() -1){
        name.append(names.get(i)).append(",");
      }else{
        name.append(names.get(i));
      }
    }
    System.out.println(name.toString());*/

    names.stream().forEach(item -> {
      name.append(item).append(",");
    });
    System.out.println(name.toString().substring(0, name.toString().length() -1));
  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    /*String mergeString = names.stream()
            .collect(Collectors.joining(","));
    System.out.println(mergeString);*/

    String mergeString = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.joining(","));
    System.out.println(mergeString);
  }
}
