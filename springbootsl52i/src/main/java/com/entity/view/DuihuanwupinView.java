package com.entity.view;

import com.entity.DuihuanwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 兑换物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
@TableName("duihuanwupin")
public class DuihuanwupinView  extends DuihuanwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DuihuanwupinView(){
	}
 
 	public DuihuanwupinView(DuihuanwupinEntity duihuanwupinEntity){
 	try {
			BeanUtils.copyProperties(this, duihuanwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
