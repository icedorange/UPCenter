package com.postbox.model;

import com.postbox.enums.BoxGroupStatus;
import java.io.Serializable;
import java.util.Date;

public class BoxGroup implements Serializable {
    public static final long serialVersionUID = -427635991L;

    /**
     * 箱子组ID: t_box_group.BOX_GROUP_ID
     * @author MyBatis Generator
     */
    private Long boxGroupId;

    /**
     * 所属企业: t_box_group.COMPANY_INFO_ID
     * @author MyBatis Generator
     */
    private Long companyInfoId;

    /**
     * 箱子组编码,全局唯一: t_box_group.GROUP_CODE
     * @author MyBatis Generator
     */
    private String groupCode;

    /**
     * 名称: t_box_group.GROUP_NAME
     * @author MyBatis Generator
     */
    private String groupName;

    /**
     * 国家: t_box_group.COUNTRY
     * @author MyBatis Generator
     */
    private String country;

    /**
     * 省份: t_box_group.PROVINCE
     * @author MyBatis Generator
     */
    private String province;

    /**
     * 城市: t_box_group.CITY
     * @author MyBatis Generator
     */
    private String city;

    /**
     * 详细地址: t_box_group.ADDRESS
     * @author MyBatis Generator
     */
    private String address;

    /**
     * 经度: t_box_group.LONGITUDE
     * @author MyBatis Generator
     */
    private String longitude;

    /**
     * 纬度: t_box_group.LATITUDE
     * @author MyBatis Generator
     */
    private String latitude;

    /**
     * 维修人员ID: t_box_group.REPAIRER_INFO_ID
     * @author MyBatis Generator
     */
    private Long repairerInfoId;

    /**
     * 状态,NOACTIVE未激活,NORMAL正常,FROZEN冻结,DEMISE销户: t_box_group.STATUS
     * @author MyBatis Generator
     */
    private BoxGroupStatus status;

    /**
     * 创建时间: t_box_group.CREATETIME
     * @author MyBatis Generator
     */
    private Date createtime;

    /**
     * 激活时间: t_box_group.ACTIVETIME
     * @author MyBatis Generator
     */
    private Date activetime;

    /**
     * 冻结时间: t_box_group.FROZENTIME
     * @author MyBatis Generator
     */
    private Date frozentime;

    /**
     * 注销时间: t_box_group.DEMISETIME
     * @author MyBatis Generator
     */
    private Date demisetime;

    /**
     * 获取箱子组ID: t_box_group.BOX_GROUP_ID
     * @return 箱子组ID: t_box_group.BOX_GROUP_ID
     * @author MyBatis Generator
     */
    public Long getBoxGroupId() {
        return boxGroupId;
    }

    /**
     * 设置箱子组ID: t_box_group.BOX_GROUP_ID
     * @param boxGroupId 映射数据库字段: t_box_group.BOX_GROUP_ID
     * @author MyBatis Generator
     */
    public void setBoxGroupId(Long boxGroupId) {
        this.boxGroupId = boxGroupId;
    }

    /**
     * 获取所属企业: t_box_group.COMPANY_INFO_ID
     * @return 所属企业: t_box_group.COMPANY_INFO_ID
     * @author MyBatis Generator
     */
    public Long getCompanyInfoId() {
        return companyInfoId;
    }

    /**
     * 设置所属企业: t_box_group.COMPANY_INFO_ID
     * @param companyInfoId 映射数据库字段: t_box_group.COMPANY_INFO_ID
     * @author MyBatis Generator
     */
    public void setCompanyInfoId(Long companyInfoId) {
        this.companyInfoId = companyInfoId;
    }

    /**
     * 获取箱子组编码,全局唯一: t_box_group.GROUP_CODE
     * @return 箱子组编码,全局唯一: t_box_group.GROUP_CODE
     * @author MyBatis Generator
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 设置箱子组编码,全局唯一: t_box_group.GROUP_CODE
     * @param groupCode 映射数据库字段: t_box_group.GROUP_CODE
     * @author MyBatis Generator
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    /**
     * 获取名称: t_box_group.GROUP_NAME
     * @return 名称: t_box_group.GROUP_NAME
     * @author MyBatis Generator
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置名称: t_box_group.GROUP_NAME
     * @param groupName 映射数据库字段: t_box_group.GROUP_NAME
     * @author MyBatis Generator
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 获取国家: t_box_group.COUNTRY
     * @return 国家: t_box_group.COUNTRY
     * @author MyBatis Generator
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家: t_box_group.COUNTRY
     * @param country 映射数据库字段: t_box_group.COUNTRY
     * @author MyBatis Generator
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取省份: t_box_group.PROVINCE
     * @return 省份: t_box_group.PROVINCE
     * @author MyBatis Generator
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份: t_box_group.PROVINCE
     * @param province 映射数据库字段: t_box_group.PROVINCE
     * @author MyBatis Generator
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市: t_box_group.CITY
     * @return 城市: t_box_group.CITY
     * @author MyBatis Generator
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市: t_box_group.CITY
     * @param city 映射数据库字段: t_box_group.CITY
     * @author MyBatis Generator
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取详细地址: t_box_group.ADDRESS
     * @return 详细地址: t_box_group.ADDRESS
     * @author MyBatis Generator
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址: t_box_group.ADDRESS
     * @param address 映射数据库字段: t_box_group.ADDRESS
     * @author MyBatis Generator
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取经度: t_box_group.LONGITUDE
     * @return 经度: t_box_group.LONGITUDE
     * @author MyBatis Generator
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度: t_box_group.LONGITUDE
     * @param longitude 映射数据库字段: t_box_group.LONGITUDE
     * @author MyBatis Generator
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * 获取纬度: t_box_group.LATITUDE
     * @return 纬度: t_box_group.LATITUDE
     * @author MyBatis Generator
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度: t_box_group.LATITUDE
     * @param latitude 映射数据库字段: t_box_group.LATITUDE
     * @author MyBatis Generator
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * 获取维修人员ID: t_box_group.REPAIRER_INFO_ID
     * @return 维修人员ID: t_box_group.REPAIRER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getRepairerInfoId() {
        return repairerInfoId;
    }

    /**
     * 设置维修人员ID: t_box_group.REPAIRER_INFO_ID
     * @param repairerInfoId 映射数据库字段: t_box_group.REPAIRER_INFO_ID
     * @author MyBatis Generator
     */
    public void setRepairerInfoId(Long repairerInfoId) {
        this.repairerInfoId = repairerInfoId;
    }

    /**
     * 获取状态,NOACTIVE未激活,NORMAL正常,FROZEN冻结,DEMISE销户: t_box_group.STATUS
     * @return 状态,NOACTIVE未激活,NORMAL正常,FROZEN冻结,DEMISE销户: t_box_group.STATUS
     * @author MyBatis Generator
     */
    public BoxGroupStatus getStatus() {
        return status;
    }

    /**
     * 设置状态,NOACTIVE未激活,NORMAL正常,FROZEN冻结,DEMISE销户: t_box_group.STATUS
     * @param status 映射数据库字段: t_box_group.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(BoxGroupStatus status) {
        this.status = status;
    }

    /**
     * 获取创建时间: t_box_group.CREATETIME
     * @return 创建时间: t_box_group.CREATETIME
     * @author MyBatis Generator
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间: t_box_group.CREATETIME
     * @param createtime 映射数据库字段: t_box_group.CREATETIME
     * @author MyBatis Generator
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取激活时间: t_box_group.ACTIVETIME
     * @return 激活时间: t_box_group.ACTIVETIME
     * @author MyBatis Generator
     */
    public Date getActivetime() {
        return activetime;
    }

    /**
     * 设置激活时间: t_box_group.ACTIVETIME
     * @param activetime 映射数据库字段: t_box_group.ACTIVETIME
     * @author MyBatis Generator
     */
    public void setActivetime(Date activetime) {
        this.activetime = activetime;
    }

    /**
     * 获取冻结时间: t_box_group.FROZENTIME
     * @return 冻结时间: t_box_group.FROZENTIME
     * @author MyBatis Generator
     */
    public Date getFrozentime() {
        return frozentime;
    }

    /**
     * 设置冻结时间: t_box_group.FROZENTIME
     * @param frozentime 映射数据库字段: t_box_group.FROZENTIME
     * @author MyBatis Generator
     */
    public void setFrozentime(Date frozentime) {
        this.frozentime = frozentime;
    }

    /**
     * 获取注销时间: t_box_group.DEMISETIME
     * @return 注销时间: t_box_group.DEMISETIME
     * @author MyBatis Generator
     */
    public Date getDemisetime() {
        return demisetime;
    }

    /**
     * 设置注销时间: t_box_group.DEMISETIME
     * @param demisetime 映射数据库字段: t_box_group.DEMISETIME
     * @author MyBatis Generator
     */
    public void setDemisetime(Date demisetime) {
        this.demisetime = demisetime;
    }
}