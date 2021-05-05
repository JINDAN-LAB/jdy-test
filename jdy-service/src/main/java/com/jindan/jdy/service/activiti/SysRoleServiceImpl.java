package com.jindan.jdy.service.activiti;

import com.jindan.jdy.common.pojo.SysRole;
import com.jindan.jdy.common.mapper.SysRoleDao;
import com.jindan.jdy.service.activiti.SysRoleService;
import org.apache.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**   
 * @Description:TODO(流程控制服务实现)
 *
 * @version: V1.0
 * @author: kong
 * 
 */
@Service(version = "${service.version}")
@Component
public class SysRoleServiceImpl  extends ServiceImpl<SysRoleDao,SysRole> implements SysRoleService  {
	
}