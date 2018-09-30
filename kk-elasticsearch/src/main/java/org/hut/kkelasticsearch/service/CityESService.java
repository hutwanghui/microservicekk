package org.hut.kkelasticsearch.service;

import org.hut.kkelasticsearch.entity.City;

import java.util.List;

/**
 * Created by hutwanghui on 2018/9/16.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
public interface CityESService {
    public List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);

    public Long saveCity(City city);
}
