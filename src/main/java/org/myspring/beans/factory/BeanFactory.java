package org.myspring.beans.factory;

import org.myspring.beans.BeanDefinition;

/**
 * @Author: 武春阳
 * @Date: 2018/12/22
 */
public interface BeanFactory {

    BeanDefinition getBeanDefinition(String beanId);

    Object getBean(String beanId);
}
