package com.zwl.backend.springdataesdemo.repository;

import com.zwl.backend.springdataesdemo.entity.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author zwl
 * @date 2020/12/28 13:42
 * @describe instructions...
 */
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {

    /**
     * 根据价格区间查询
     * @param price1
     * @param price2
     * @return
     */
    List<Item> findByPriceBetween(double price1, double price2);
}