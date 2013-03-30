package com.hr.dao;
import java.util.List;
import com.hr.vo.CommerUser;
public interface CommerUserDao {
	/**
	 * 加载commerUser实例
	 * 
	 * @param user_id
	 *            需要加载的commerUser实例的主键值
	 * @return 返回加载的commerUser实例
	 */
	CommerUser get(String user_id);
	/**
	 * 保存commerUser实例
	 * 
	 * @param User
	 *            需要保存的commerUser实例
	 * @return 刚刚保存的commerUser实例的标识属性值
	 */
	Integer save(CommerUser User);
	/**
	 * 保存commerUser实例，是否有重复的名字
	 * 
	 * @param User
	 *            需要保存的commerUser实例
	 * @return 刚刚保存的commerUser实例的标识属性值
	 */
	Integer isDuplicateCommerUser(CommerUser User);
	/**
	 * 修改commerUser实例
	 * 
	 * @param User
	 *            需要修改的commerUser实例
	 */
    Integer update(CommerUser User);
    /**
	 * 删除commerUserUser实例
	 * 
	 * @param user_id
	 *            需要删除的commerUserUser实例的标识属性值
	 */
    Integer delete(String user_id);
    /**
	 * 删除commerUserUser实例
	 * 
	 * @param User
	 *            需要删除的commerUserUser实例
	 */
    Integer delete(CommerUser User);
    /**
	 * 根据主题名查找commerUserUser
	 * 
	 * @param user_id
	 *            查询的人名
	 * @return 指定用户名对应的全部commerUserUser
	 */
    CommerUser findByUserName(String name);
    /**
	 * 查询全部commerUserUser实例
	 * 
	 * @return 全部commerUserUser实例
	 */
     List findAllCommerUser();
     /**
	 * 查询数据表中commerUserUser实例的总数
	 * 
	 * @return 数据表中commerUserUser实例的总数
	 */
     long getCommerUserNumber();
    /**
	 * 檢查commerUser实例
	 * 
	 * @paramUser
	 *           
	 * @return 刚刚檢查的commerUser实例的标识属性值
	 */
	Integer checkCommerUser(CommerUser user);
}
