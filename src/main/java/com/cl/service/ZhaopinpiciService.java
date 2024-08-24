package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZhaopinpiciEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZhaopinpiciView;


/**
 * 招聘批次
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface ZhaopinpiciService extends IService<ZhaopinpiciEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaopinpiciView> selectListView(Wrapper<ZhaopinpiciEntity> wrapper);
   	
   	ZhaopinpiciView selectView(@Param("ew") Wrapper<ZhaopinpiciEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaopinpiciEntity> wrapper);
   	

}

