package combinatorpattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class Customer {
    private final String name;
    private final String phoneNumber;
    private final String email;
    private final LocalDate dob;
}
