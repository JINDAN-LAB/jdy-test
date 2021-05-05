package com.jindan.jdy.common.pojo;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**   
 * @Description:TODO(耗材管理实体类)
 * 
 * @version: V1.0
 * @author: kong
 * 
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StarchOrganizationAccessConsumable extends Model<StarchOrganizationAccessConsumable> {

	private static final long serialVersionUID = 1600052051426L;

	@TableId(value = "lid", type = IdType.UUID)
	@ApiModelProperty(name = "lid" , value = "")
	private String lid;
    
	@ApiModelProperty(name = "danhao" , value = "单号")
	private String danhao;
    
	@ApiModelProperty(name = "cangku" , value = "仓库")
	private String cangku;
    
	@ApiModelProperty(name = "yewutime" , value = "业务时间")
	private String yewutime;
    
	@ApiModelProperty(name = "suppliers" , value = "供应商")
	private String suppliers;
    
	@ApiModelProperty(name = "persons" , value = "业务员")
	private String persons;
    
	@ApiModelProperty(name = "personTime" , value = "业务时间")
	private String personTime;
    
	@ApiModelProperty(name = "remarks" , value = "备注")
	private String remarks;
    
	@ApiModelProperty(name = "gongsi" , value = "领用的公司")
	private String gongsi;
    
	@ApiModelProperty(name = "bumen" , value = "领用部门")
	private String bumen;
    
	@ApiModelProperty(name = "status" , value = "状态信息")
	private String status;

	@JsonIgnore
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "insertTime" , value = "插入时间  不要设置")
	@TableField(fill = FieldFill.INSERT)
	private Date insertTime;

	@JsonIgnore
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "updateTime" , value = "更新时间 不需要设置")
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;

	@JsonIgnore
	@TableLogic
	@ApiModelProperty(name = "deleteId" , value = "")
	private Integer deleteId;
    
	@ApiModelProperty(name = "ptypes" , value = "1出库 2入库")
	private String ptypes;
    
	@ApiModelProperty(name = "beiyong1" , value = "备用1")
	private String beiyong1;
    
	@ApiModelProperty(name = "jine" , value = "")
	private String jine;
    
	@ApiModelProperty(name = "num" , value = "")
	private Integer num;

	@ApiModelProperty(name = "lingyongren" , value = "")
	private String lingyongren;

	@ApiModelProperty(name = "ptype" , value = "")
	private String ptype;

	@ApiModelProperty(name = "departments" , value = "")
	private String departments;


}
