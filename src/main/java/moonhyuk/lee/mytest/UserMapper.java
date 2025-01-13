package moonhyuk.lee.mytest;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findUserWithOrders(@Param("id") Long id);
}
