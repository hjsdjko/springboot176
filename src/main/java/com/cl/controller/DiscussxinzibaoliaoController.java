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

import com.cl.entity.DiscussxinzibaoliaoEntity;
import com.cl.entity.view.DiscussxinzibaoliaoView;

import com.cl.service.DiscussxinzibaoliaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 薪资爆料评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@RestController
@RequestMapping("/discussxinzibaoliao")
public class DiscussxinzibaoliaoController {
    @Autowired
    private DiscussxinzibaoliaoService discussxinzibaoliaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussxinzibaoliaoEntity discussxinzibaoliao,
		HttpServletRequest request){
        EntityWrapper<DiscussxinzibaoliaoEntity> ew = new EntityWrapper<DiscussxinzibaoliaoEntity>();

		PageUtils page = discussxinzibaoliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxinzibaoliao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussxinzibaoliaoEntity discussxinzibaoliao, 
		HttpServletRequest request){
        EntityWrapper<DiscussxinzibaoliaoEntity> ew = new EntityWrapper<DiscussxinzibaoliaoEntity>();

		PageUtils page = discussxinzibaoliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxinzibaoliao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussxinzibaoliaoEntity discussxinzibaoliao){
       	EntityWrapper<DiscussxinzibaoliaoEntity> ew = new EntityWrapper<DiscussxinzibaoliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussxinzibaoliao, "discussxinzibaoliao")); 
        return R.ok().put("data", discussxinzibaoliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussxinzibaoliaoEntity discussxinzibaoliao){
        EntityWrapper< DiscussxinzibaoliaoEntity> ew = new EntityWrapper< DiscussxinzibaoliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussxinzibaoliao, "discussxinzibaoliao")); 
		DiscussxinzibaoliaoView discussxinzibaoliaoView =  discussxinzibaoliaoService.selectView(ew);
		return R.ok("查询薪资爆料评论表成功").put("data", discussxinzibaoliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussxinzibaoliaoEntity discussxinzibaoliao = discussxinzibaoliaoService.selectById(id);
		discussxinzibaoliao = discussxinzibaoliaoService.selectView(new EntityWrapper<DiscussxinzibaoliaoEntity>().eq("id", id));
        return R.ok().put("data", discussxinzibaoliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussxinzibaoliaoEntity discussxinzibaoliao = discussxinzibaoliaoService.selectById(id);
		discussxinzibaoliao = discussxinzibaoliaoService.selectView(new EntityWrapper<DiscussxinzibaoliaoEntity>().eq("id", id));
        return R.ok().put("data", discussxinzibaoliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussxinzibaoliaoEntity discussxinzibaoliao, HttpServletRequest request){
    	discussxinzibaoliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussxinzibaoliao);
        discussxinzibaoliaoService.insert(discussxinzibaoliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussxinzibaoliaoEntity discussxinzibaoliao, HttpServletRequest request){
    	discussxinzibaoliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussxinzibaoliao);
        discussxinzibaoliaoService.insert(discussxinzibaoliao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussxinzibaoliaoEntity discussxinzibaoliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussxinzibaoliao);
        discussxinzibaoliaoService.updateById(discussxinzibaoliao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussxinzibaoliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussxinzibaoliaoEntity discussxinzibaoliao, HttpServletRequest request,String pre){
        EntityWrapper<DiscussxinzibaoliaoEntity> ew = new EntityWrapper<DiscussxinzibaoliaoEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discussxinzibaoliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxinzibaoliao), params), params));
        return R.ok().put("data", page);
    }








}
