package com.cl.dao;

import com.cl.entity.GongzuorenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GongzuorenyuanView;


/**
 * 工作人员
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface GongzuorenyuanDao extends BaseMapper<GongzuorenyuanEntity> {
	
	List<GongzuorenyuanView> selectListView(@Param("ew") Wrapper<GongzuorenyuanEntity> wrapper);

	List<GongzuorenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuorenyuanEntity> wrapper);
	
	GongzuorenyuanView selectView(@Param("ew") Wrapper<GongzuorenyuanEntity> wrapper);
	

}
