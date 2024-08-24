package com.cl.dao;

import com.cl.entity.DiscussxinzibaoliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxinzibaoliaoView;


/**
 * 薪资爆料评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface DiscussxinzibaoliaoDao extends BaseMapper<DiscussxinzibaoliaoEntity> {
	
	List<DiscussxinzibaoliaoView> selectListView(@Param("ew") Wrapper<DiscussxinzibaoliaoEntity> wrapper);

	List<DiscussxinzibaoliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinzibaoliaoEntity> wrapper);
	
	DiscussxinzibaoliaoView selectView(@Param("ew") Wrapper<DiscussxinzibaoliaoEntity> wrapper);
	

}
