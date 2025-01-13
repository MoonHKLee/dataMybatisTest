package moonhyuk.lee.mytest;

import lombok.Getter;
import lombok.Setter;
import moonhyuk.lee.resultmap.generator.Embeddable;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
@Embeddable
public class Address {
    @Column("STREET")
    private String street;

    @Column("CITY")
    private String city;

    @Column("ZIP_CODE")
    private String zipCode;
}
