package com.mmall.common;

/**
 * 枚举类
 */
public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    /**
     * 这个构造方法的参数是和上面的每个枚举括号里的参数对应的
     * 调用的时候就直接
     * ResponseCode.SUCCESS.getCode()
     * @param code
     * @param desc
     */
    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
