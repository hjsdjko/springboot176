package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZhaopinpiciEntity;
import com.cl.entity.view.ZhaopinpiciView;

import com.cl.service.ZhaopinpiciService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 招聘批次
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@RestController
@RequestMapping("/zhaopinpici")
public class ZhaopinpiciController {
    @Autowired
    private ZhaopinpiciService zhaopinpiciService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhaopinpiciEntity zhaopinpici,
		HttpServletRequest request){
        EntityWrapper<ZhaopinpiciEntity> ew = new EntityWrapper<ZhaopinpiciEntity>();

		PageUtils page = zhaopinpiciService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaopinpici), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhaopinpiciEntity zhaopinpici, 
		HttpServletRequest request){
        EntityWrapper<ZhaopinpiciEntity> ew = new EntityWrapper<ZhaopinpiciEntity>();

		PageUtils page = zhaopinpiciService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaopinpici), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhaopinpiciEntity zhaopinpici){
       	EntityWrapper<ZhaopinpiciEntity> ew = new EntityWrapper<ZhaopinpiciEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhaopinpici, "zhaopinpici")); 
        return R.ok().put("data", zhaopinpiciService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhaopinpiciEntity zhaopinpici){
        EntityWrapper< ZhaopinpiciEntity> ew = new EntityWrapper< ZhaopinpiciEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhaopinpici, "zhaopinpici")); 
		ZhaopinpiciView zhaopinpiciView =  zhaopinpiciService.selectView(ew);
		return R.ok("查询招聘批次成功").put("data", zhaopinpiciView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhaopinpiciEntity zhaopinpici = zhaopinpiciService.selectById(id);
		zhaopinpici = zhaopinpiciService.selectView(new EntityWrapper<ZhaopinpiciEntity>().eq("id", id));
        return R.ok().put("data", zhaopinpici);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhaopinpiciEntity zhaopinpici = zhaopinpiciService.selectById(id);
		zhaopinpici = zhaopinpiciService.selectView(new EntityWrapper<ZhaopinpiciEntity>().eq("id", id));
        return R.ok().put("data", zhaopinpici);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaopinpiciEntity zhaopinpici, HttpServletRequest request){
    	zhaopinpici.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaopinpici);
        zhaopinpiciService.insert(zhaopinpici);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaopinpiciEntity zhaopinpici, HttpServletRequest request){
    	zhaopinpici.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaopinpici);
        zhaopinpiciService.insert(zhaopinpici);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhaopinpiciEntity zhaopinpici, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhaopinpici);
        zhaopinpiciService.updateById(zhaopinpici);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhaopinpiciService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
