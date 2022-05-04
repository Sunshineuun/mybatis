package com.qiusm.mybatis.entity.oracle;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qiushengming
 */
@EqualsAndHashCode(callSuper = false)
@Data
@TableName("CK10_CFMX")
public class CfmxEntity extends Model<CfmxEntity> implements Serializable {
    @TableId
    private String id;
    private String zfbz;

    private BigDecimal cxjzf;

    private BigDecimal ggzf;

    private String scrq;
    private String yl;

    private BigDecimal xmYpts00;

    private String xmJbypjb;
    private String xmSjsfrq;
    private String xmSffcfy;
    private String xmYplb00;
    private String xmSfybxm;
    private String yl10;
    private String yl09;
    private String yl08;
    private String yl07;
    private String yl06;
    private String yl05;
    private String yl04;
    private String yl03;
    private String yl02;
    private String yl01;

    private BigDecimal seqId;

    private String pcdm;
    private String xgd;
    private String zxdlx;

    private BigDecimal zxd;
    private Date tbsj;
    private String cfybz;
    private String syyybz;
    private String tsbyybz;
    private String fhbzbz;
    private String tcbz;
    private String tsxmbz;
    private String qjfybz;
    private String zzypbz;
    private String xzyybz;
    private String gsyybz;
    private String gbyybz;
    private String ettcbz;
    private String jylx;
    private BigDecimal zfbl;
    private BigDecimal zfje;
    private BigDecimal zlje;
    private BigDecimal ylts;
    private BigDecimal yyts;
    private String dw;
    private String yf;
    private String pc;
    private String yl2;
    private String jx;
    private String gg;
    private BigDecimal je;
    private BigDecimal dj;
    private BigDecimal sl;
    private BigDecimal zddj;
    private String jsbz;
    private String bxbz;
    private String cflsh;
    private String cfh;
    private String ysmc;
    private String ysdm;
    private String ysid;
    private String ksmc;
    private String ksdm;
    private String ksid;
    private String ypdj;
    private String sflb;
    private String xmlb;
    private String tymc;
    private String xmmc;
    private String xmdm;
    private String yyxmmc;
    private String yyxmdm;
    private String djh;
    private String jzlsh;
    private String dwmc;
    private String dwdm;
    private String dwid;
    private String hzkh;
    private String zjhm;
    private String hzxm;
    private String grdm;
    private String grid;
    private String yyjb;
    private String jgdj;
    private String jgmc;
    private String jgdm;
    private String jgid;
    private String cfdjid;
    private String ghdjid;
    private String tcqdm;
    private Date jbrq;
    private Date jsrq;
    private Date cfrq;
}

