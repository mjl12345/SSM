package com.maiworld.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCorrectTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCorrectTableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFeedIdIsNull() {
            addCriterion("feed_id is null");
            return (Criteria) this;
        }

        public Criteria andFeedIdIsNotNull() {
            addCriterion("feed_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeedIdEqualTo(Long value) {
            addCriterion("feed_id =", value, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdNotEqualTo(Long value) {
            addCriterion("feed_id <>", value, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdGreaterThan(Long value) {
            addCriterion("feed_id >", value, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("feed_id >=", value, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdLessThan(Long value) {
            addCriterion("feed_id <", value, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdLessThanOrEqualTo(Long value) {
            addCriterion("feed_id <=", value, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdIn(List<Long> values) {
            addCriterion("feed_id in", values, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdNotIn(List<Long> values) {
            addCriterion("feed_id not in", values, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdBetween(Long value1, Long value2) {
            addCriterion("feed_id between", value1, value2, "feedId");
            return (Criteria) this;
        }

        public Criteria andFeedIdNotBetween(Long value1, Long value2) {
            addCriterion("feed_id not between", value1, value2, "feedId");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerIsNull() {
            addCriterion("student_answer is null");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerIsNotNull() {
            addCriterion("student_answer is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerEqualTo(String value) {
            addCriterion("student_answer =", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerNotEqualTo(String value) {
            addCriterion("student_answer <>", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerGreaterThan(String value) {
            addCriterion("student_answer >", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("student_answer >=", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerLessThan(String value) {
            addCriterion("student_answer <", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerLessThanOrEqualTo(String value) {
            addCriterion("student_answer <=", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerLike(String value) {
            addCriterion("student_answer like", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerNotLike(String value) {
            addCriterion("student_answer not like", value, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerIn(List<String> values) {
            addCriterion("student_answer in", values, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerNotIn(List<String> values) {
            addCriterion("student_answer not in", values, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerBetween(String value1, String value2) {
            addCriterion("student_answer between", value1, value2, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andStudentAnswerNotBetween(String value1, String value2) {
            addCriterion("student_answer not between", value1, value2, "studentAnswer");
            return (Criteria) this;
        }

        public Criteria andItem1IsNull() {
            addCriterion("item1 is null");
            return (Criteria) this;
        }

        public Criteria andItem1IsNotNull() {
            addCriterion("item1 is not null");
            return (Criteria) this;
        }

        public Criteria andItem1EqualTo(String value) {
            addCriterion("item1 =", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotEqualTo(String value) {
            addCriterion("item1 <>", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThan(String value) {
            addCriterion("item1 >", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThanOrEqualTo(String value) {
            addCriterion("item1 >=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThan(String value) {
            addCriterion("item1 <", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThanOrEqualTo(String value) {
            addCriterion("item1 <=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Like(String value) {
            addCriterion("item1 like", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotLike(String value) {
            addCriterion("item1 not like", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1In(List<String> values) {
            addCriterion("item1 in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotIn(List<String> values) {
            addCriterion("item1 not in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Between(String value1, String value2) {
            addCriterion("item1 between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotBetween(String value1, String value2) {
            addCriterion("item1 not between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem2IsNull() {
            addCriterion("item2 is null");
            return (Criteria) this;
        }

        public Criteria andItem2IsNotNull() {
            addCriterion("item2 is not null");
            return (Criteria) this;
        }

        public Criteria andItem2EqualTo(String value) {
            addCriterion("item2 =", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotEqualTo(String value) {
            addCriterion("item2 <>", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThan(String value) {
            addCriterion("item2 >", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThanOrEqualTo(String value) {
            addCriterion("item2 >=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThan(String value) {
            addCriterion("item2 <", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThanOrEqualTo(String value) {
            addCriterion("item2 <=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Like(String value) {
            addCriterion("item2 like", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotLike(String value) {
            addCriterion("item2 not like", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2In(List<String> values) {
            addCriterion("item2 in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotIn(List<String> values) {
            addCriterion("item2 not in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Between(String value1, String value2) {
            addCriterion("item2 between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotBetween(String value1, String value2) {
            addCriterion("item2 not between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItem3IsNull() {
            addCriterion("item3 is null");
            return (Criteria) this;
        }

        public Criteria andItem3IsNotNull() {
            addCriterion("item3 is not null");
            return (Criteria) this;
        }

        public Criteria andItem3EqualTo(String value) {
            addCriterion("item3 =", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotEqualTo(String value) {
            addCriterion("item3 <>", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThan(String value) {
            addCriterion("item3 >", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThanOrEqualTo(String value) {
            addCriterion("item3 >=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThan(String value) {
            addCriterion("item3 <", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThanOrEqualTo(String value) {
            addCriterion("item3 <=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3Like(String value) {
            addCriterion("item3 like", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotLike(String value) {
            addCriterion("item3 not like", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3In(List<String> values) {
            addCriterion("item3 in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotIn(List<String> values) {
            addCriterion("item3 not in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3Between(String value1, String value2) {
            addCriterion("item3 between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotBetween(String value1, String value2) {
            addCriterion("item3 not between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItem4IsNull() {
            addCriterion("item4 is null");
            return (Criteria) this;
        }

        public Criteria andItem4IsNotNull() {
            addCriterion("item4 is not null");
            return (Criteria) this;
        }

        public Criteria andItem4EqualTo(String value) {
            addCriterion("item4 =", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotEqualTo(String value) {
            addCriterion("item4 <>", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThan(String value) {
            addCriterion("item4 >", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThanOrEqualTo(String value) {
            addCriterion("item4 >=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThan(String value) {
            addCriterion("item4 <", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThanOrEqualTo(String value) {
            addCriterion("item4 <=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4Like(String value) {
            addCriterion("item4 like", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotLike(String value) {
            addCriterion("item4 not like", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4In(List<String> values) {
            addCriterion("item4 in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotIn(List<String> values) {
            addCriterion("item4 not in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4Between(String value1, String value2) {
            addCriterion("item4 between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotBetween(String value1, String value2) {
            addCriterion("item4 not between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andExplainsIsNull() {
            addCriterion("explains is null");
            return (Criteria) this;
        }

        public Criteria andExplainsIsNotNull() {
            addCriterion("explains is not null");
            return (Criteria) this;
        }

        public Criteria andExplainsEqualTo(String value) {
            addCriterion("explains =", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotEqualTo(String value) {
            addCriterion("explains <>", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThan(String value) {
            addCriterion("explains >", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsGreaterThanOrEqualTo(String value) {
            addCriterion("explains >=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThan(String value) {
            addCriterion("explains <", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLessThanOrEqualTo(String value) {
            addCriterion("explains <=", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsLike(String value) {
            addCriterion("explains like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotLike(String value) {
            addCriterion("explains not like", value, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsIn(List<String> values) {
            addCriterion("explains in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotIn(List<String> values) {
            addCriterion("explains not in", values, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsBetween(String value1, String value2) {
            addCriterion("explains between", value1, value2, "explains");
            return (Criteria) this;
        }

        public Criteria andExplainsNotBetween(String value1, String value2) {
            addCriterion("explains not between", value1, value2, "explains");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTopicTypesIsNull() {
            addCriterion("topic_types is null");
            return (Criteria) this;
        }

        public Criteria andTopicTypesIsNotNull() {
            addCriterion("topic_types is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTypesEqualTo(String value) {
            addCriterion("topic_types =", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesNotEqualTo(String value) {
            addCriterion("topic_types <>", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesGreaterThan(String value) {
            addCriterion("topic_types >", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesGreaterThanOrEqualTo(String value) {
            addCriterion("topic_types >=", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesLessThan(String value) {
            addCriterion("topic_types <", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesLessThanOrEqualTo(String value) {
            addCriterion("topic_types <=", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesLike(String value) {
            addCriterion("topic_types like", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesNotLike(String value) {
            addCriterion("topic_types not like", value, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesIn(List<String> values) {
            addCriterion("topic_types in", values, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesNotIn(List<String> values) {
            addCriterion("topic_types not in", values, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesBetween(String value1, String value2) {
            addCriterion("topic_types between", value1, value2, "topicTypes");
            return (Criteria) this;
        }

        public Criteria andTopicTypesNotBetween(String value1, String value2) {
            addCriterion("topic_types not between", value1, value2, "topicTypes");
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