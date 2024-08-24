package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XingyeleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XingyeleixingView;


/**
 * 行业类型
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface XingyeleixingService extends IService<XingyeleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingyeleixingView> selectListView(Wrapper<XingyeleixingEntity> wrapper);
   	
   	XingyeleixingView selectView(@Param("ew") Wrapper<XingyeleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingyeleixingEntity> wrapper);
   	

}

