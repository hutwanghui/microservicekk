package org.hut.kkelasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * Created by hutwanghui on 2018/9/16.
 * email:zjjhwanhui@163.com
 * qq:472860892
 * a. City 属性名不支持驼峰式。
 * b. indexName 配置必须是全部小写，不然会出异常。
 * org.elasticsearch.indices.InvalidIndexNameException: Invalid index name [provinceIndex], must be lowercase
 */
@Document(indexName = "provice", type = "city")
@Data
public class City implements Serializable {
    private static final long serialVersionUID = -1L;
    /**
     * 城市编号
     */
    private Long id;
    /**
     * 城市名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 城市评分
     */
    private Integer score;
}
