package moonhyuk.lee.mytest;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table("ORDER_ITEM")
public class OrderItem {
    @Id
    @Column("ORDER_ITEM_ID") // 별칭과 매핑
    private Long id;

    @Column("PRODUCT_NAME")
    private String productName;

    @Column("QUANTITY")
    private Integer quantity;

    @Column("PRICE")
    private BigDecimal price;
}
