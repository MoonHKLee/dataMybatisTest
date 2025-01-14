package moonhyuk.lee.mytest;

import moonhyuk.lee.resultmap.generator.Embeddable;
import org.springframework.data.relational.core.mapping.Column;

@Embeddable
public class Address {
    @Column("STREET")
    private String street;

    @Column("CITY")
    private String city;

    @Column("ZIP_CODE")
    private String zipCode;
}
