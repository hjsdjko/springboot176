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

import com.cl.entity.XinzibaoliaoEntity;
import com.cl.entity.view.XinzibaoliaoView;

import com.cl.service.XinzibaoliaoService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 薪资爆料
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@RestController
@RequestMapping("/xinzibaoliao")
public class XinzibaoliaoController {
    @Autowired
    private XinzibaoliaoService xinzibaoliaoService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinzibaoliaoEntity xinzibaoliao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gongzuorenyuan")) {
			xinzibaoliao.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			xinzibaoliao.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinzibaoliaoEntity> ew = new EntityWrapper<XinzibaoliaoEntity>();

		PageUtils page = xinzibaoliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinzibaoliao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinzibaoliaoEntity xinzibaoliao, 
		HttpServletRequest request){
        EntityWrapper<XinzibaoliaoEntity> ew = new EntityWrapper<XinzibaoliaoEntity>();

		PageUtils page = xinzibaoliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinzibaoliao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinzibaoliaoEntity xinzibaoliao){
       	EntityWrapper<XinzibaoliaoEntity> ew = new EntityWrapper<XinzibaoliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinzibaoliao, "xinzibaoliao")); 
        return R.ok().put("data", xinzibaoliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinzibaoliaoEntity xinzibaoliao){
        EntityWrapper< XinzibaoliaoEntity> ew = new EntityWrapper< XinzibaoliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinzibaoliao, "xinzibaoliao")); 
		XinzibaoliaoView xinzibaoliaoView =  xinzibaoliaoService.selectView(ew);
		return R.ok("查询薪资爆料成功").put("data", xinzibaoliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinzibaoliaoEntity xinzibaoliao = xinzibaoliaoService.selectById(id);
		xinzibaoliao.setClicktime(new Date());
		xinzibaoliaoService.updateById(xinzibaoliao);
		xinzibaoliao = xinzibaoliaoService.selectView(new EntityWrapper<XinzibaoliaoEntity>().eq("id", id));
        return R.ok().put("data", xinzibaoliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinzibaoliaoEntity xinzibaoliao = xinzibaoliaoService.selectById(id);
		xinzibaoliao.setClicktime(new Date());
		xinzibaoliaoService.updateById(xinzibaoliao);
		xinzibaoliao = xinzibaoliaoService.selectView(new EntityWrapper<XinzibaoliaoEntity>().eq("id", id));
        return R.ok().put("data", xinzibaoliao);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        XinzibaoliaoEntity xinzibaoliao = xinzibaoliaoService.selectById(id);
        if(type.equals("1")) {
        	xinzibaoliao.setThumbsupnum(xinzibaoliao.getThumbsupnum()+1);
        } else {
        	xinzibaoliao.setCrazilynum(xinzibaoliao.getCrazilynum()+1);
        }
        xinzibaoliaoService.updateById(xinzibaoliao);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinzibaoliaoEntity xinzibaoliao, HttpServletRequest request){
    	xinzibaoliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinzibaoliao);
        xinzibaoliaoService.insert(xinzibaoliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinzibaoliaoEntity xinzibaoliao, HttpServletRequest request){
    	xinzibaoliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinzibaoliao);
        xinzibaoliaoService.insert(xinzibaoliao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinzibaoliaoEntity xinzibaoliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinzibaoliao);
        xinzibaoliaoService.updateById(xinzibaoliao);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<XinzibaoliaoEntity> list = new ArrayList<XinzibaoliaoEntity>();
        for(Long id : ids) {
            XinzibaoliaoEntity xinzibaoliao = xinzibaoliaoService.selectById(id);
            xinzibaoliao.setSfsh(sfsh);
            xinzibaoliao.setShhf(shhf);
            list.add(xinzibaoliao);
        }
        xinzibaoliaoService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinzibaoliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XinzibaoliaoEntity xinzibaoliao, HttpServletRequest request,String pre){
        EntityWrapper<XinzibaoliaoEntity> ew = new EntityWrapper<XinzibaoliaoEntity>();
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
		PageUtils page = xinzibaoliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinzibaoliao), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 按收藏推荐
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,XinzibaoliaoEntity xinzibaoliao, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "xingyeleixing";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "xinzibaoliao").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<XinzibaoliaoEntity> xinzibaoliaoList = new ArrayList<XinzibaoliaoEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                xinzibaoliaoList.addAll(xinzibaoliaoService.selectList(new EntityWrapper<XinzibaoliaoEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<XinzibaoliaoEntity> ew = new EntityWrapper<XinzibaoliaoEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = xinzibaoliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinzibaoliao), params), params));
        List<XinzibaoliaoEntity> pageList = (List<XinzibaoliaoEntity>)page.getList();
        if(xinzibaoliaoList.size()<limit) {
            int toAddNum = (limit-xinzibaoliaoList.size())<=pageList.size()?(limit-xinzibaoliaoList.size()):pageList.size();
            for(XinzibaoliaoEntity o1 : pageList) {
                boolean addFlag = true;
                for(XinzibaoliaoEntity o2 : xinzibaoliaoList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    xinzibaoliaoList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(xinzibaoliaoList.size()>limit) {
            xinzibaoliaoList = xinzibaoliaoList.subList(0, limit);
        }
        page.setList(xinzibaoliaoList);
        return R.ok().put("data", page);
    }







}
