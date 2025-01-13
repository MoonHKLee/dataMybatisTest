package moonhyuk.lee.mytest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("APP_USER")
@Getter
@Setter
public class User {
    @Id
    @Column("USER_ID")
    private Long id;

    @Column("NAME")
    private String name;

    @Column("EMAIL")
    private String email;

    @Embedded(onEmpty = Embedded.OnEmpty.USE_NULL)
    private Address address;

    @MappedCollection(idColumn = "USER_ID") // Foreign Key 매핑
    private List<Order> orders;
}
