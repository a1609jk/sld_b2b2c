package com.slodon.b2b2c.vo.system;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: pc&mobile邮件修改方案2追加
 * @Description 封装地区VO对象
 * @Author Chen
 */
@Data
public class PostInfoVO implements Serializable {

    private static final long serialVersionUID = 2888069396815951441L;
    @ApiModelProperty("郵政番号")
    private String postCode;

    @ApiModelProperty("都道府県コード")
    private String proviceCode;

    @ApiModelProperty("都道府県名")
    private String proviceName;

    @ApiModelProperty("市区町村コード")
    private String cityCode;

    @ApiModelProperty("市区町村名")
    private String cityName;

    @ApiModelProperty("町域名")
    private String addressLine;
}
