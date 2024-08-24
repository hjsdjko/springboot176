package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussxinzibaoliaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxinzibaoliaoView;


/**
 * 薪资爆料评论表
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface DiscussxinzibaoliaoService extends IService<DiscussxinzibaoliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinzibaoliaoView> selectListView(Wrapper<DiscussxinzibaoliaoEntity> wrapper);
   	
   	DiscussxinzibaoliaoView selectView(@Param("ew") Wrapper<DiscussxinzibaoliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinzibaoliaoEntity> wrapper);
   	

}

