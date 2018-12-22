package org.myspring.beans.factory.support;

import org.myspring.beans.BeanDefinition;
import org.myspring.beans.BeansException;
import org.myspring.beans.factory.BeanFactory;
import org.myspring.util.ClassUtils;

import java.io.InputStream;

/**
 * @Author: 武春阳
 * @Date: 2018/12/22
 */
public class DefaultBeanFactory implements BeanFactory {
    private static final String ID_ATTRIBUTE = "id";
    private static final String CLASS_ATTRIBUTE = "class";

    public DefaultBeanFactory(String configFile) {

    }

    private void loadBeanDefinition(String configFile) {
        InputStream inputStream = null;

        try {
            ClassLoader classLoader = ClassUtils.getDefaultClassLoader();
            inputStream = classLoader.getResourceAsStream(configFile);
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanId) {
        return null;
    }

    @Override
    public Object getBean(String beanId) {
        return null;
    }
}
