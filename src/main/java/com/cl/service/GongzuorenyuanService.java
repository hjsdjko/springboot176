package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GongzuorenyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GongzuorenyuanView;


/**
 * 工作人员
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface GongzuorenyuanService extends IService<GongzuorenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuorenyuanView> selectListView(Wrapper<GongzuorenyuanEntity> wrapper);
   	
   	GongzuorenyuanView selectView(@Param("ew") Wrapper<GongzuorenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuorenyuanEntity> wrapper);
   	

}

