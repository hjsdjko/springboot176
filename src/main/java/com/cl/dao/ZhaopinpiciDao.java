package com.cl.dao;

import com.cl.entity.ZhaopinpiciEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhaopinpiciView;


/**
 * 招聘批次
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface ZhaopinpiciDao extends BaseMapper<ZhaopinpiciEntity> {
	
	List<ZhaopinpiciView> selectListView(@Param("ew") Wrapper<ZhaopinpiciEntity> wrapper);

	List<ZhaopinpiciView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaopinpiciEntity> wrapper);
	
	ZhaopinpiciView selectView(@Param("ew") Wrapper<ZhaopinpiciEntity> wrapper);
	

}
