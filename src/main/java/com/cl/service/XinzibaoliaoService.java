package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XinzibaoliaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XinzibaoliaoView;


/**
 * 薪资爆料
 *
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
public interface XinzibaoliaoService extends IService<XinzibaoliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinzibaoliaoView> selectListView(Wrapper<XinzibaoliaoEntity> wrapper);
   	
   	XinzibaoliaoView selectView(@Param("ew") Wrapper<XinzibaoliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinzibaoliaoEntity> wrapper);
   	

}

