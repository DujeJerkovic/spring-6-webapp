package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String publisherName;
    private String adress;
    private String city;
    private String state;
    private String zipCode;

@OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}
