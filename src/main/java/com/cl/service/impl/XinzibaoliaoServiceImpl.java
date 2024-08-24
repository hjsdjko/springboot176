package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.XinzibaoliaoDao;
import com.cl.entity.XinzibaoliaoEntity;
import com.cl.service.XinzibaoliaoService;
import com.cl.entity.view.XinzibaoliaoView;

@Service("xinzibaoliaoService")
public class XinzibaoliaoServiceImpl extends ServiceImpl<XinzibaoliaoDao, XinzibaoliaoEntity> implements XinzibaoliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinzibaoliaoEntity> page = this.selectPage(
                new Query<XinzibaoliaoEntity>(params).getPage(),
                new EntityWrapper<XinzibaoliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinzibaoliaoEntity> wrapper) {
		  Page<XinzibaoliaoView> page =new Query<XinzibaoliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XinzibaoliaoView> selectListView(Wrapper<XinzibaoliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinzibaoliaoView selectView(Wrapper<XinzibaoliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
