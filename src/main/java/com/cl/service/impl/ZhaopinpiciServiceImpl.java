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


import com.cl.dao.ZhaopinpiciDao;
import com.cl.entity.ZhaopinpiciEntity;
import com.cl.service.ZhaopinpiciService;
import com.cl.entity.view.ZhaopinpiciView;

@Service("zhaopinpiciService")
public class ZhaopinpiciServiceImpl extends ServiceImpl<ZhaopinpiciDao, ZhaopinpiciEntity> implements ZhaopinpiciService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaopinpiciEntity> page = this.selectPage(
                new Query<ZhaopinpiciEntity>(params).getPage(),
                new EntityWrapper<ZhaopinpiciEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaopinpiciEntity> wrapper) {
		  Page<ZhaopinpiciView> page =new Query<ZhaopinpiciView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZhaopinpiciView> selectListView(Wrapper<ZhaopinpiciEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaopinpiciView selectView(Wrapper<ZhaopinpiciEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
