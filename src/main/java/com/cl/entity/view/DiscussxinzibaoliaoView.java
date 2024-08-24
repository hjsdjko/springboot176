package com.cl.entity.view;

import com.cl.entity.DiscussxinzibaoliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 薪资爆料评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@TableName("discussxinzibaoliao")
public class DiscussxinzibaoliaoView  extends DiscussxinzibaoliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxinzibaoliaoView(){
	}
 
 	public DiscussxinzibaoliaoView(DiscussxinzibaoliaoEntity discussxinzibaoliaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussxinzibaoliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
