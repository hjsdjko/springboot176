package com.cl.entity.view;

import com.cl.entity.DiscusszhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 招聘信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@TableName("discusszhaopinxinxi")
public class DiscusszhaopinxinxiView  extends DiscusszhaopinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhaopinxinxiView(){
	}
 
 	public DiscusszhaopinxinxiView(DiscusszhaopinxinxiEntity discusszhaopinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhaopinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
