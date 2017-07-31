package com.postbox.model;

import com.postbox.enums.BoxGroupStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hanzhdy.web.bean.Page;

public class BoxGroupExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public BoxGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBoxGroupIdIsNull() {
            addCriterion("BOX_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdIsNotNull() {
            addCriterion("BOX_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdEqualTo(Long value) {
            addCriterion("BOX_GROUP_ID =", value, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdNotEqualTo(Long value) {
            addCriterion("BOX_GROUP_ID <>", value, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdGreaterThan(Long value) {
            addCriterion("BOX_GROUP_ID >", value, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BOX_GROUP_ID >=", value, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdLessThan(Long value) {
            addCriterion("BOX_GROUP_ID <", value, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("BOX_GROUP_ID <=", value, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdIn(List<Long> values) {
            addCriterion("BOX_GROUP_ID in", values, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdNotIn(List<Long> values) {
            addCriterion("BOX_GROUP_ID not in", values, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdBetween(Long value1, Long value2) {
            addCriterion("BOX_GROUP_ID between", value1, value2, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andBoxGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("BOX_GROUP_ID not between", value1, value2, "boxGroupId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdIsNull() {
            addCriterion("COMPANY_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdIsNotNull() {
            addCriterion("COMPANY_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdEqualTo(Long value) {
            addCriterion("COMPANY_INFO_ID =", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdNotEqualTo(Long value) {
            addCriterion("COMPANY_INFO_ID <>", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdGreaterThan(Long value) {
            addCriterion("COMPANY_INFO_ID >", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_INFO_ID >=", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdLessThan(Long value) {
            addCriterion("COMPANY_INFO_ID <", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_INFO_ID <=", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdIn(List<Long> values) {
            addCriterion("COMPANY_INFO_ID in", values, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdNotIn(List<Long> values) {
            addCriterion("COMPANY_INFO_ID not in", values, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdBetween(Long value1, Long value2) {
            addCriterion("COMPANY_INFO_ID between", value1, value2, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_INFO_ID not between", value1, value2, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIsNull() {
            addCriterion("GROUP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIsNotNull() {
            addCriterion("GROUP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCodeEqualTo(String value) {
            addCriterion("GROUP_CODE =", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotEqualTo(String value) {
            addCriterion("GROUP_CODE <>", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeGreaterThan(String value) {
            addCriterion("GROUP_CODE >", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_CODE >=", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLessThan(String value) {
            addCriterion("GROUP_CODE <", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_CODE <=", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLike(String value) {
            addCriterion("GROUP_CODE like", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotLike(String value) {
            addCriterion("GROUP_CODE not like", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIn(List<String> values) {
            addCriterion("GROUP_CODE in", values, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotIn(List<String> values) {
            addCriterion("GROUP_CODE not in", values, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeBetween(String value1, String value2) {
            addCriterion("GROUP_CODE between", value1, value2, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotBetween(String value1, String value2) {
            addCriterion("GROUP_CODE not between", value1, value2, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("LATITUDE like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("LATITUDE not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdIsNull() {
            addCriterion("REPAIRER_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdIsNotNull() {
            addCriterion("REPAIRER_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdEqualTo(Long value) {
            addCriterion("REPAIRER_INFO_ID =", value, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdNotEqualTo(Long value) {
            addCriterion("REPAIRER_INFO_ID <>", value, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdGreaterThan(Long value) {
            addCriterion("REPAIRER_INFO_ID >", value, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REPAIRER_INFO_ID >=", value, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdLessThan(Long value) {
            addCriterion("REPAIRER_INFO_ID <", value, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("REPAIRER_INFO_ID <=", value, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdIn(List<Long> values) {
            addCriterion("REPAIRER_INFO_ID in", values, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdNotIn(List<Long> values) {
            addCriterion("REPAIRER_INFO_ID not in", values, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdBetween(Long value1, Long value2) {
            addCriterion("REPAIRER_INFO_ID between", value1, value2, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andRepairerInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("REPAIRER_INFO_ID not between", value1, value2, "repairerInfoId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BoxGroupStatus value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BoxGroupStatus value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BoxGroupStatus value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BoxGroupStatus value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BoxGroupStatus value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BoxGroupStatus value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(BoxGroupStatus value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(BoxGroupStatus value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BoxGroupStatus> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BoxGroupStatus> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BoxGroupStatus value1, BoxGroupStatus value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BoxGroupStatus value1, BoxGroupStatus value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andActivetimeIsNull() {
            addCriterion("ACTIVETIME is null");
            return (Criteria) this;
        }

        public Criteria andActivetimeIsNotNull() {
            addCriterion("ACTIVETIME is not null");
            return (Criteria) this;
        }

        public Criteria andActivetimeEqualTo(Date value) {
            addCriterion("ACTIVETIME =", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotEqualTo(Date value) {
            addCriterion("ACTIVETIME <>", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeGreaterThan(Date value) {
            addCriterion("ACTIVETIME >", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTIVETIME >=", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeLessThan(Date value) {
            addCriterion("ACTIVETIME <", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTIVETIME <=", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeIn(List<Date> values) {
            addCriterion("ACTIVETIME in", values, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotIn(List<Date> values) {
            addCriterion("ACTIVETIME not in", values, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeBetween(Date value1, Date value2) {
            addCriterion("ACTIVETIME between", value1, value2, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTIVETIME not between", value1, value2, "activetime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeIsNull() {
            addCriterion("FROZENTIME is null");
            return (Criteria) this;
        }

        public Criteria andFrozentimeIsNotNull() {
            addCriterion("FROZENTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFrozentimeEqualTo(Date value) {
            addCriterion("FROZENTIME =", value, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeNotEqualTo(Date value) {
            addCriterion("FROZENTIME <>", value, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeGreaterThan(Date value) {
            addCriterion("FROZENTIME >", value, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FROZENTIME >=", value, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeLessThan(Date value) {
            addCriterion("FROZENTIME <", value, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeLessThanOrEqualTo(Date value) {
            addCriterion("FROZENTIME <=", value, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeIn(List<Date> values) {
            addCriterion("FROZENTIME in", values, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeNotIn(List<Date> values) {
            addCriterion("FROZENTIME not in", values, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeBetween(Date value1, Date value2) {
            addCriterion("FROZENTIME between", value1, value2, "frozentime");
            return (Criteria) this;
        }

        public Criteria andFrozentimeNotBetween(Date value1, Date value2) {
            addCriterion("FROZENTIME not between", value1, value2, "frozentime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeIsNull() {
            addCriterion("DEMISETIME is null");
            return (Criteria) this;
        }

        public Criteria andDemisetimeIsNotNull() {
            addCriterion("DEMISETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDemisetimeEqualTo(Date value) {
            addCriterion("DEMISETIME =", value, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeNotEqualTo(Date value) {
            addCriterion("DEMISETIME <>", value, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeGreaterThan(Date value) {
            addCriterion("DEMISETIME >", value, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DEMISETIME >=", value, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeLessThan(Date value) {
            addCriterion("DEMISETIME <", value, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeLessThanOrEqualTo(Date value) {
            addCriterion("DEMISETIME <=", value, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeIn(List<Date> values) {
            addCriterion("DEMISETIME in", values, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeNotIn(List<Date> values) {
            addCriterion("DEMISETIME not in", values, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeBetween(Date value1, Date value2) {
            addCriterion("DEMISETIME between", value1, value2, "demisetime");
            return (Criteria) this;
        }

        public Criteria andDemisetimeNotBetween(Date value1, Date value2) {
            addCriterion("DEMISETIME not between", value1, value2, "demisetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_box_group
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: t_box_group
     * @author MyBatis Generator
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}