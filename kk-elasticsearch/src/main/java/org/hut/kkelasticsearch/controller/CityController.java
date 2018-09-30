package org.hut.kkelasticsearch.controller;

import org.hut.kkelasticsearch.entity.City;
import org.hut.kkelasticsearch.service.CityESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hutwanghui on 2018/9/17.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@RestController
@RequestMapping(value = "/city/v1")
public class CityController {
    @Autowired
    private CityESService cityESService;

    /**
     * 插入 ES 新城市
     *
     * @param city
     * @return
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public Long createCity(@RequestBody City city) {
        return cityESService.saveCity(city);
    }

    /**
     * 搜索返回分页结果
     *
     * @param pageNumber    当前页码
     * @param pageSize      每页大小
     * @param searchContent 搜索内容
     * @return
     */
    @RequestMapping(value = "/api/city/search", method = RequestMethod.GET)
    public List<City> searchCity(@RequestParam(value = "pageNumber") Integer pageNumber,
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent) {
        return cityESService.searchCity(pageNumber, pageSize, searchContent);
    }
}
