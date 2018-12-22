package org.myspring.beans.factory.support;

import org.myspring.beans.BeanDefinition;

/**
 * @Author: 武春阳
 * @Date: 2018/12/22
 */
public class GenericBeanDefinition implements BeanDefinition {

    private String id;
    private String beanClassName;

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    @Override
    public String getBeanClassName() {
        return beanClassName;
    }
}
