package com.chat.webserver.user.dao;
import java.util.Map;

import com.chat.webserver.base.dao.BaseDao;
import com.chat.webserver.user.model.UserAccountEntity;

/**
 * 用户帐号
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-27 09:38:52
 */
public interface UserAccountDao extends BaseDao<UserAccountEntity> {
	public UserAccountEntity queryObjectByAccount(Map<String, Object> map);
}
