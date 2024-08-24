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
 * 薪资爆料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 17:06:37
 */
@TableName("xinzibaoliao")
public class XinzibaoliaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinzibaoliaoEntity() {
		
	}
	
	public XinzibaoliaoEntity(T t) {
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
	 * 爆料公司名称
	 */
					
	private String baoliaogongsimingcheng;
	
	/**
	 * 公司账号
	 */
					
	private String zhanghao;
	
	/**
	 * 公司负责人
	 */
					
	private String xingming;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 公司岗位
	 */
					
	private String gongsigangwei;
	
	/**
	 * 行业类型
	 */
					
	private String xingyeleixing;
	
	/**
	 * 所在城市
	 */
					
	private String suozaichengshi;
	
	/**
	 * 薪资构成
	 */
					
	private String xinzigoucheng;
	
	/**
	 * 年薪/万
	 */
					
	private String nianxin;
	
	/**
	 * 招聘类别
	 */
					
	private String zhaopinleibie;
	
	/**
	 * 学历要求
	 */
					
	private String xueliyaoqiu;
	
	/**
	 * 行业
	 */
					
	private String xingye;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	/**
	 * 爆料详情
	 */
					
	private String baoliaoxiangqing;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
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
	 * 设置：爆料公司名称
	 */
	public void setBaoliaogongsimingcheng(String baoliaogongsimingcheng) {
		this.baoliaogongsimingcheng = baoliaogongsimingcheng;
	}
	/**
	 * 获取：爆料公司名称
	 */
	public String getBaoliaogongsimingcheng() {
		return baoliaogongsimingcheng;
	}
	/**
	 * 设置：公司账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：公司账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：公司负责人
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：公司负责人
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：公司岗位
	 */
	public void setGongsigangwei(String gongsigangwei) {
		this.gongsigangwei = gongsigangwei;
	}
	/**
	 * 获取：公司岗位
	 */
	public String getGongsigangwei() {
		return gongsigangwei;
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
	 * 设置：所在城市
	 */
	public void setSuozaichengshi(String suozaichengshi) {
		this.suozaichengshi = suozaichengshi;
	}
	/**
	 * 获取：所在城市
	 */
	public String getSuozaichengshi() {
		return suozaichengshi;
	}
	/**
	 * 设置：薪资构成
	 */
	public void setXinzigoucheng(String xinzigoucheng) {
		this.xinzigoucheng = xinzigoucheng;
	}
	/**
	 * 获取：薪资构成
	 */
	public String getXinzigoucheng() {
		return xinzigoucheng;
	}
	/**
	 * 设置：年薪/万
	 */
	public void setNianxin(String nianxin) {
		this.nianxin = nianxin;
	}
	/**
	 * 获取：年薪/万
	 */
	public String getNianxin() {
		return nianxin;
	}
	/**
	 * 设置：招聘类别
	 */
	public void setZhaopinleibie(String zhaopinleibie) {
		this.zhaopinleibie = zhaopinleibie;
	}
	/**
	 * 获取：招聘类别
	 */
	public String getZhaopinleibie() {
		return zhaopinleibie;
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
	 * 设置：行业
	 */
	public void setXingye(String xingye) {
		this.xingye = xingye;
	}
	/**
	 * 获取：行业
	 */
	public String getXingye() {
		return xingye;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：爆料详情
	 */
	public void setBaoliaoxiangqing(String baoliaoxiangqing) {
		this.baoliaoxiangqing = baoliaoxiangqing;
	}
	/**
	 * 获取：爆料详情
	 */
	public String getBaoliaoxiangqing() {
		return baoliaoxiangqing;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
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
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}

}
