package com.cl.entity.view;

import com.cl.entity.GongzuorenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 工作人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@TableName("gongzuorenyuan")
public class GongzuorenyuanView  extends GongzuorenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuorenyuanView(){
	}
 
 	public GongzuorenyuanView(GongzuorenyuanEntity gongzuorenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuorenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
