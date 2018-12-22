package org.myspring.beans;

/**
 * @Author: 武春阳
 * @Date: 2018/12/22
 */
public class BeansException extends RuntimeException {
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
