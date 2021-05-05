package com.jindan.jdy.service.purchase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jindan.jdy.common.pojo.JdyPurchase;
import com.jindan.jdy.common.pojo.JdyPutCheck;
import com.jindan.jdy.common.mapper.JdyPutCheckDao;
import com.jindan.jdy.service.purchase.JdyPutCheckService;
import org.apache.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**   
 * @Description:TODO(风险控制任务超期服务实现)
 *
 * @version: V1.0
 * @author: kong
 * 
 */
@Service(version = "${service.version}")
@Component
public class JdyPutCheckServiceImpl  extends ServiceImpl<JdyPutCheckDao,JdyPutCheck> implements JdyPutCheckService  {

    @Autowired
    JdyPutCheckDao  jdyPutCheckDao;

    @Override
    public boolean insertSave(JdyPutCheck jdyPurchaseDto) {
        return jdyPutCheckDao.insert(jdyPurchaseDto) > 0;
    }


    @Override
    public List<JdyPutCheck> seletelist(JdyPutCheck jdyPurchaseDto) {

        QueryWrapper<JdyPutCheck> queryWrapper =new QueryWrapper<>();
        if(jdyPurchaseDto.getKid() !=null && !jdyPurchaseDto.getKid().isEmpty()){
            queryWrapper.eq("kid",jdyPurchaseDto.getKid());
        }
        if(jdyPurchaseDto.getKtime() !=null && !jdyPurchaseDto.getKtime().isEmpty()){
            queryWrapper.eq("ktime",jdyPurchaseDto.getKtime());
        }
        if(jdyPurchaseDto.getKpersons() !=null && !jdyPurchaseDto.getKpersons().isEmpty()){
            queryWrapper.eq("kpersons",jdyPurchaseDto.getKpersons());
        }
        if(jdyPurchaseDto.getParentId() !=null && !jdyPurchaseDto.getParentId().isEmpty()){
            queryWrapper.eq("parent_id",jdyPurchaseDto.getParentId());
        }
        List<JdyPutCheck> jdyPurchases = jdyPutCheckDao.selectList(queryWrapper);
        return jdyPurchases;
    }



}