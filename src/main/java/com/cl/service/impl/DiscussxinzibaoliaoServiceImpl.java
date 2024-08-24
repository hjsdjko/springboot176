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


import com.cl.dao.DiscussxinzibaoliaoDao;
import com.cl.entity.DiscussxinzibaoliaoEntity;
import com.cl.service.DiscussxinzibaoliaoService;
import com.cl.entity.view.DiscussxinzibaoliaoView;

@Service("discussxinzibaoliaoService")
public class DiscussxinzibaoliaoServiceImpl extends ServiceImpl<DiscussxinzibaoliaoDao, DiscussxinzibaoliaoEntity> implements DiscussxinzibaoliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxinzibaoliaoEntity> page = this.selectPage(
                new Query<DiscussxinzibaoliaoEntity>(params).getPage(),
                new EntityWrapper<DiscussxinzibaoliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxinzibaoliaoEntity> wrapper) {
		  Page<DiscussxinzibaoliaoView> page =new Query<DiscussxinzibaoliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussxinzibaoliaoView> selectListView(Wrapper<DiscussxinzibaoliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxinzibaoliaoView selectView(Wrapper<DiscussxinzibaoliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
