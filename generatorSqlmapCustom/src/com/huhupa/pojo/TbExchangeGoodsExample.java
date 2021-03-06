package com.huhupa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbExchangeGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbExchangeGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andExchangeGoodsIdIsNull() {
            addCriterion("exchange_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdIsNotNull() {
            addCriterion("exchange_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdEqualTo(Integer value) {
            addCriterion("exchange_goods_id =", value, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdNotEqualTo(Integer value) {
            addCriterion("exchange_goods_id <>", value, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdGreaterThan(Integer value) {
            addCriterion("exchange_goods_id >", value, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_goods_id >=", value, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdLessThan(Integer value) {
            addCriterion("exchange_goods_id <", value, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_goods_id <=", value, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdIn(List<Integer> values) {
            addCriterion("exchange_goods_id in", values, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdNotIn(List<Integer> values) {
            addCriterion("exchange_goods_id not in", values, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("exchange_goods_id between", value1, value2, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_goods_id not between", value1, value2, "exchangeGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdIsNull() {
            addCriterion("ordersub_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdIsNotNull() {
            addCriterion("ordersub_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdEqualTo(String value) {
            addCriterion("ordersub_id =", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdNotEqualTo(String value) {
            addCriterion("ordersub_id <>", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdGreaterThan(String value) {
            addCriterion("ordersub_id >", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdGreaterThanOrEqualTo(String value) {
            addCriterion("ordersub_id >=", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdLessThan(String value) {
            addCriterion("ordersub_id <", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdLessThanOrEqualTo(String value) {
            addCriterion("ordersub_id <=", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdLike(String value) {
            addCriterion("ordersub_id like", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdNotLike(String value) {
            addCriterion("ordersub_id not like", value, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdIn(List<String> values) {
            addCriterion("ordersub_id in", values, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdNotIn(List<String> values) {
            addCriterion("ordersub_id not in", values, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdBetween(String value1, String value2) {
            addCriterion("ordersub_id between", value1, value2, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andOrdersubIdNotBetween(String value1, String value2) {
            addCriterion("ordersub_id not between", value1, value2, "ordersubId");
            return (Criteria) this;
        }

        public Criteria andTbOrderIsNull() {
            addCriterion("tb_order is null");
            return (Criteria) this;
        }

        public Criteria andTbOrderIsNotNull() {
            addCriterion("tb_order is not null");
            return (Criteria) this;
        }

        public Criteria andTbOrderEqualTo(String value) {
            addCriterion("tb_order =", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderNotEqualTo(String value) {
            addCriterion("tb_order <>", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderGreaterThan(String value) {
            addCriterion("tb_order >", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderGreaterThanOrEqualTo(String value) {
            addCriterion("tb_order >=", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderLessThan(String value) {
            addCriterion("tb_order <", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderLessThanOrEqualTo(String value) {
            addCriterion("tb_order <=", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderLike(String value) {
            addCriterion("tb_order like", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderNotLike(String value) {
            addCriterion("tb_order not like", value, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderIn(List<String> values) {
            addCriterion("tb_order in", values, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderNotIn(List<String> values) {
            addCriterion("tb_order not in", values, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderBetween(String value1, String value2) {
            addCriterion("tb_order between", value1, value2, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andTbOrderNotBetween(String value1, String value2) {
            addCriterion("tb_order not between", value1, value2, "tbOrder");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNull() {
            addCriterion("exchange_reason is null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNotNull() {
            addCriterion("exchange_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonEqualTo(String value) {
            addCriterion("exchange_reason =", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotEqualTo(String value) {
            addCriterion("exchange_reason <>", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThan(String value) {
            addCriterion("exchange_reason >", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_reason >=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThan(String value) {
            addCriterion("exchange_reason <", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThanOrEqualTo(String value) {
            addCriterion("exchange_reason <=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLike(String value) {
            addCriterion("exchange_reason like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotLike(String value) {
            addCriterion("exchange_reason not like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIn(List<String> values) {
            addCriterion("exchange_reason in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotIn(List<String> values) {
            addCriterion("exchange_reason not in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonBetween(String value1, String value2) {
            addCriterion("exchange_reason between", value1, value2, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotBetween(String value1, String value2) {
            addCriterion("exchange_reason not between", value1, value2, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusIsNull() {
            addCriterion("exchange_goods_status is null");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusIsNotNull() {
            addCriterion("exchange_goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusEqualTo(String value) {
            addCriterion("exchange_goods_status =", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusNotEqualTo(String value) {
            addCriterion("exchange_goods_status <>", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusGreaterThan(String value) {
            addCriterion("exchange_goods_status >", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_goods_status >=", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusLessThan(String value) {
            addCriterion("exchange_goods_status <", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("exchange_goods_status <=", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusLike(String value) {
            addCriterion("exchange_goods_status like", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusNotLike(String value) {
            addCriterion("exchange_goods_status not like", value, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusIn(List<String> values) {
            addCriterion("exchange_goods_status in", values, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusNotIn(List<String> values) {
            addCriterion("exchange_goods_status not in", values, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusBetween(String value1, String value2) {
            addCriterion("exchange_goods_status between", value1, value2, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("exchange_goods_status not between", value1, value2, "exchangeGoodsStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeIsNull() {
            addCriterion("exchange_goods_time is null");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeIsNotNull() {
            addCriterion("exchange_goods_time is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeEqualTo(Date value) {
            addCriterion("exchange_goods_time =", value, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeNotEqualTo(Date value) {
            addCriterion("exchange_goods_time <>", value, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeGreaterThan(Date value) {
            addCriterion("exchange_goods_time >", value, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exchange_goods_time >=", value, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeLessThan(Date value) {
            addCriterion("exchange_goods_time <", value, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeLessThanOrEqualTo(Date value) {
            addCriterion("exchange_goods_time <=", value, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeIn(List<Date> values) {
            addCriterion("exchange_goods_time in", values, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeNotIn(List<Date> values) {
            addCriterion("exchange_goods_time not in", values, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeBetween(Date value1, Date value2) {
            addCriterion("exchange_goods_time between", value1, value2, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andExchangeGoodsTimeNotBetween(Date value1, Date value2) {
            addCriterion("exchange_goods_time not between", value1, value2, "exchangeGoodsTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Integer value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Integer value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Integer value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Integer value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Integer> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Integer> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Integer value1, Integer value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusIsNull() {
            addCriterion("exchange_status is null");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusIsNotNull() {
            addCriterion("exchange_status is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusEqualTo(String value) {
            addCriterion("exchange_status =", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusNotEqualTo(String value) {
            addCriterion("exchange_status <>", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusGreaterThan(String value) {
            addCriterion("exchange_status >", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_status >=", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusLessThan(String value) {
            addCriterion("exchange_status <", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusLessThanOrEqualTo(String value) {
            addCriterion("exchange_status <=", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusLike(String value) {
            addCriterion("exchange_status like", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusNotLike(String value) {
            addCriterion("exchange_status not like", value, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusIn(List<String> values) {
            addCriterion("exchange_status in", values, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusNotIn(List<String> values) {
            addCriterion("exchange_status not in", values, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusBetween(String value1, String value2) {
            addCriterion("exchange_status between", value1, value2, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeStatusNotBetween(String value1, String value2) {
            addCriterion("exchange_status not between", value1, value2, "exchangeStatus");
            return (Criteria) this;
        }

        public Criteria andBak2IsNull() {
            addCriterion("bak2 is null");
            return (Criteria) this;
        }

        public Criteria andBak2IsNotNull() {
            addCriterion("bak2 is not null");
            return (Criteria) this;
        }

        public Criteria andBak2EqualTo(String value) {
            addCriterion("bak2 =", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotEqualTo(String value) {
            addCriterion("bak2 <>", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThan(String value) {
            addCriterion("bak2 >", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2GreaterThanOrEqualTo(String value) {
            addCriterion("bak2 >=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThan(String value) {
            addCriterion("bak2 <", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2LessThanOrEqualTo(String value) {
            addCriterion("bak2 <=", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Like(String value) {
            addCriterion("bak2 like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotLike(String value) {
            addCriterion("bak2 not like", value, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2In(List<String> values) {
            addCriterion("bak2 in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotIn(List<String> values) {
            addCriterion("bak2 not in", values, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2Between(String value1, String value2) {
            addCriterion("bak2 between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak2NotBetween(String value1, String value2) {
            addCriterion("bak2 not between", value1, value2, "bak2");
            return (Criteria) this;
        }

        public Criteria andBak3IsNull() {
            addCriterion("bak3 is null");
            return (Criteria) this;
        }

        public Criteria andBak3IsNotNull() {
            addCriterion("bak3 is not null");
            return (Criteria) this;
        }

        public Criteria andBak3EqualTo(String value) {
            addCriterion("bak3 =", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotEqualTo(String value) {
            addCriterion("bak3 <>", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThan(String value) {
            addCriterion("bak3 >", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3GreaterThanOrEqualTo(String value) {
            addCriterion("bak3 >=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThan(String value) {
            addCriterion("bak3 <", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3LessThanOrEqualTo(String value) {
            addCriterion("bak3 <=", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Like(String value) {
            addCriterion("bak3 like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotLike(String value) {
            addCriterion("bak3 not like", value, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3In(List<String> values) {
            addCriterion("bak3 in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotIn(List<String> values) {
            addCriterion("bak3 not in", values, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3Between(String value1, String value2) {
            addCriterion("bak3 between", value1, value2, "bak3");
            return (Criteria) this;
        }

        public Criteria andBak3NotBetween(String value1, String value2) {
            addCriterion("bak3 not between", value1, value2, "bak3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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