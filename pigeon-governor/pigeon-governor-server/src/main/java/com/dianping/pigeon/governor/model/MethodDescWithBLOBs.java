package com.dianping.pigeon.governor.model;

public class MethodDescWithBLOBs extends MethodDesc {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column method_desc.method_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    private String methodDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column method_desc.method_return_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    private String methodReturnDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column method_desc.method_desc
     *
     * @return the value of method_desc.method_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public String getMethodDesc() {
        return methodDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column method_desc.method_desc
     *
     * @param methodDesc the value for method_desc.method_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc == null ? null : methodDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column method_desc.method_return_desc
     *
     * @return the value of method_desc.method_return_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public String getMethodReturnDesc() {
        return methodReturnDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column method_desc.method_return_desc
     *
     * @param methodReturnDesc the value for method_desc.method_return_desc
     *
     * @mbggenerated Mon Jun 27 14:46:12 CST 2016
     */
    public void setMethodReturnDesc(String methodReturnDesc) {
        this.methodReturnDesc = methodReturnDesc == null ? null : methodReturnDesc.trim();
    }
}