package moonhyuk.lee.mytest;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.CrudRepository;

@Mapper
public interface UserMapper extends CrudRepository<User, Long> {
    User findUserWithOrders(Long id);
}
