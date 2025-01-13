package moonhyuk.lee.mytest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Table("ORDERS")
@Getter
@Setter
public class Order {
    @Id
    @Column("ORDER_ID") // 별칭과 매핑
    private Long id;

    @Column("ORDER_DATE")
    private LocalDate orderDate;

    @Column("TOTAL_AMOUNT")
    private BigDecimal totalAmount;

    @MappedCollection(idColumn = "ORDER_ID") // Foreign Key 매핑
    private List<OrderItem> items;
}
