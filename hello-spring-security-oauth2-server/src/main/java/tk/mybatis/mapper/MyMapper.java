package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description TODO
 * @ClassName MyMapper
 * @Author DingZuoHeng
 * @Date
 * @Version 1.0
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
