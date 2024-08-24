package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 招聘信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@TableName("zhaopinxinxi")
public class ZhaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhaopinxinxiEntity() {
		
	}
	
	public ZhaopinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 公司名称
	 */
					
	private String gongsimingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 工作岗位
	 */
					
	private String gongzuogangwei;
	
	/**
	 * 行业类型
	 */
					
	private String xingyeleixing;
	
	/**
	 * 工作城市
	 */
					
	private String gongzuochengshi;
	
	/**
	 * 招聘批次
	 */
					
	private String zhaopinpici;
	
	/**
	 * 招聘时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhaopinshijian;
	
	/**
	 * 招聘届数
	 */
					
	private String zhaopinjieshu;
	
	/**
	 * 学历要求
	 */
					
	private String xueliyaoqiu;
	
	/**
	 * 专业要求
	 */
					
	private String zhuanyeyaoqiu;
	
	/**
	 * 岗位要求
	 */
					
	private String gangweiyaoqiu;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：公司名称
	 */
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：工作岗位
	 */
	public void setGongzuogangwei(String gongzuogangwei) {
		this.gongzuogangwei = gongzuogangwei;
	}
	/**
	 * 获取：工作岗位
	 */
	public String getGongzuogangwei() {
		return gongzuogangwei;
	}
	/**
	 * 设置：行业类型
	 */
	public void setXingyeleixing(String xingyeleixing) {
		this.xingyeleixing = xingyeleixing;
	}
	/**
	 * 获取：行业类型
	 */
	public String getXingyeleixing() {
		return xingyeleixing;
	}
	/**
	 * 设置：工作城市
	 */
	public void setGongzuochengshi(String gongzuochengshi) {
		this.gongzuochengshi = gongzuochengshi;
	}
	/**
	 * 获取：工作城市
	 */
	public String getGongzuochengshi() {
		return gongzuochengshi;
	}
	/**
	 * 设置：招聘批次
	 */
	public void setZhaopinpici(String zhaopinpici) {
		this.zhaopinpici = zhaopinpici;
	}
	/**
	 * 获取：招聘批次
	 */
	public String getZhaopinpici() {
		return zhaopinpici;
	}
	/**
	 * 设置：招聘时间
	 */
	public void setZhaopinshijian(Date zhaopinshijian) {
		this.zhaopinshijian = zhaopinshijian;
	}
	/**
	 * 获取：招聘时间
	 */
	public Date getZhaopinshijian() {
		return zhaopinshijian;
	}
	/**
	 * 设置：招聘届数
	 */
	public void setZhaopinjieshu(String zhaopinjieshu) {
		this.zhaopinjieshu = zhaopinjieshu;
	}
	/**
	 * 获取：招聘届数
	 */
	public String getZhaopinjieshu() {
		return zhaopinjieshu;
	}
	/**
	 * 设置：学历要求
	 */
	public void setXueliyaoqiu(String xueliyaoqiu) {
		this.xueliyaoqiu = xueliyaoqiu;
	}
	/**
	 * 获取：学历要求
	 */
	public String getXueliyaoqiu() {
		return xueliyaoqiu;
	}
	/**
	 * 设置：专业要求
	 */
	public void setZhuanyeyaoqiu(String zhuanyeyaoqiu) {
		this.zhuanyeyaoqiu = zhuanyeyaoqiu;
	}
	/**
	 * 获取：专业要求
	 */
	public String getZhuanyeyaoqiu() {
		return zhuanyeyaoqiu;
	}
	/**
	 * 设置：岗位要求
	 */
	public void setGangweiyaoqiu(String gangweiyaoqiu) {
		this.gangweiyaoqiu = gangweiyaoqiu;
	}
	/**
	 * 获取：岗位要求
	 */
	public String getGangweiyaoqiu() {
		return gangweiyaoqiu;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
