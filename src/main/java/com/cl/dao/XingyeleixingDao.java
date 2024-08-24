package com.cl.dao;

import com.cl.entity.XingyeleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XingyeleixingView;


/**
 * 行业类型
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface XingyeleixingDao extends BaseMapper<XingyeleixingEntity> {
	
	List<XingyeleixingView> selectListView(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);

	List<XingyeleixingView> selectListView(Pagination page,@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
	
	XingyeleixingView selectView(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
	

}
