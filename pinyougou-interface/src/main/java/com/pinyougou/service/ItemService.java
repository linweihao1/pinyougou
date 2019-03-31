package com.pinyougou.service;

import com.pinyougou.pojo.Item;
import com.pinyougou.pojo.ItemCat;

import java.util.List;
import java.io.Serializable;
/**
 * ItemService 服务接口
 * @date 2019-03-28 18:37:20
 * @version 1.0
 */
public interface ItemService {

	/** 添加方法 */
	void save(Item item);

	/** 修改方法 */
	void update(Item item);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	Item findOne(Serializable id);

	/** 查询全部 */
	List<Item> findAll();

	/** 多条件分页查询 */
	List<Item> findByPage(Item item, int page, int rows);

	/**
	 * 根据父级id查询商品分类
	 * @param parentId 父级id
	 * @return  商品分类集合
	 */
	List<ItemCat> findItemCatByParentId(Long parentId);
}