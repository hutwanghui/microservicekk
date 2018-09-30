package org.hut.kkelasticsearch.dao;

import org.hut.kkelasticsearch.entity.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * Created by hutwanghui on 2018/9/16.
 * email:zjjhwanhui@163.com
 * qq:472860892
 * 接口只要继承 ElasticsearchRepository 接口类即可，具体使用的是该接口的方法：
 * <p>
 * Iterable<T> search(QueryBuilder query);
 * Page<T> search(QueryBuilder query, Pageable pageable);
 * Page<T> search(SearchQuery searchQuery);
 * Page<T> searchSimilar(T entity, String[] fields, Pageable pageable);
 * <p>
 * 如果要进行增删改则需要实现ElasticsearchCrudRepository
 */
@Component
public interface CityRepository extends ElasticsearchRepository<City, Long> {
}