package com.jindan.jdy.common.pojo;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/**   
 * @Description:TODO(规则实体类)
 * 
 * @version: V1.0
 * @author: kong
 * 
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WaimaoHuikuan extends Model<WaimaoHuikuan> {

	private static final long serialVersionUID = 1589518541688L;
	
	@TableId(value = "id", type = IdType.AUTO)
	@ApiModelProperty(name = "id" , value = "")
	private Integer id;
    
	@ApiModelProperty(name = "fapiaohao" , value = "")
	private String fapiaohao;
    
	@ApiModelProperty(name = "huikuanriqi" , value = "")
	private String huikuanriqi;
    
	@ApiModelProperty(name = "huikuanjine" , value = "")
	private String huikuanjine;
    
	@ApiModelProperty(name = "jiehuiyinhang" , value = "")
	private String jiehuiyinhang;
    
	@ApiModelProperty(name = "zhoubie" , value = "")
	private String zhoubie;
    
	@ApiModelProperty(name = "jine" , value = "")
	private String jine;
    
	@ApiModelProperty(name = "xiaoshouren" , value = "")
	private String xiaoshouren;
    
	@ApiModelProperty(name = "shouhuokehu" , value = "")
	private String shouhuokehu;
    
	@ApiModelProperty(name = "shijishiyong" , value = "")
	private String shijishiyong;

	@ApiModelProperty(name = "bizhong" , value = "")
	private String bizhong;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "insertTime" , value = "插入时间 不需要填入")
	@TableField(fill = FieldFill.INSERT)
	private Date insertTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@ApiModelProperty(name = "updateTime" , value = "修改日期 不需要填入")
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
    
	@ApiModelProperty(name = "deleteId" , value = "")
	private Integer deleteId;



    

}
