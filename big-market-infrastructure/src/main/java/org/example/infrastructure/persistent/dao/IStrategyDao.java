package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Strategy;

import java.util.List;

/**
 * 抽奖策略的Dao
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();
}
