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

import com.cl.entity.XingyeleixingEntity;
import com.cl.entity.view.XingyeleixingView;

import com.cl.service.XingyeleixingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 行业类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@RestController
@RequestMapping("/xingyeleixing")
public class XingyeleixingController {
    @Autowired
    private XingyeleixingService xingyeleixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XingyeleixingEntity xingyeleixing,
		HttpServletRequest request){
        EntityWrapper<XingyeleixingEntity> ew = new EntityWrapper<XingyeleixingEntity>();

		PageUtils page = xingyeleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xingyeleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XingyeleixingEntity xingyeleixing, 
		HttpServletRequest request){
        EntityWrapper<XingyeleixingEntity> ew = new EntityWrapper<XingyeleixingEntity>();

		PageUtils page = xingyeleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xingyeleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XingyeleixingEntity xingyeleixing){
       	EntityWrapper<XingyeleixingEntity> ew = new EntityWrapper<XingyeleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xingyeleixing, "xingyeleixing")); 
        return R.ok().put("data", xingyeleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XingyeleixingEntity xingyeleixing){
        EntityWrapper< XingyeleixingEntity> ew = new EntityWrapper< XingyeleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xingyeleixing, "xingyeleixing")); 
		XingyeleixingView xingyeleixingView =  xingyeleixingService.selectView(ew);
		return R.ok("查询行业类型成功").put("data", xingyeleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XingyeleixingEntity xingyeleixing = xingyeleixingService.selectById(id);
		xingyeleixing = xingyeleixingService.selectView(new EntityWrapper<XingyeleixingEntity>().eq("id", id));
        return R.ok().put("data", xingyeleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XingyeleixingEntity xingyeleixing = xingyeleixingService.selectById(id);
		xingyeleixing = xingyeleixingService.selectView(new EntityWrapper<XingyeleixingEntity>().eq("id", id));
        return R.ok().put("data", xingyeleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XingyeleixingEntity xingyeleixing, HttpServletRequest request){
    	xingyeleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xingyeleixing);
        xingyeleixingService.insert(xingyeleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XingyeleixingEntity xingyeleixing, HttpServletRequest request){
    	xingyeleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xingyeleixing);
        xingyeleixingService.insert(xingyeleixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XingyeleixingEntity xingyeleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xingyeleixing);
        xingyeleixingService.updateById(xingyeleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xingyeleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
