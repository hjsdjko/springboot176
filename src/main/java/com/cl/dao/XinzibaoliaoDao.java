package com.cl.dao;

import com.cl.entity.XinzibaoliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinzibaoliaoView;


/**
 * 薪资爆料
 * 
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface XinzibaoliaoDao extends BaseMapper<XinzibaoliaoEntity> {
	
	List<XinzibaoliaoView> selectListView(@Param("ew") Wrapper<XinzibaoliaoEntity> wrapper);

	List<XinzibaoliaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinzibaoliaoEntity> wrapper);
	
	XinzibaoliaoView selectView(@Param("ew") Wrapper<XinzibaoliaoEntity> wrapper);
	

}
