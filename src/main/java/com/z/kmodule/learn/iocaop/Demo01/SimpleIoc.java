package com.z.kmodule.learn.iocaop.Demo01;

import com.google.common.collect.Maps;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

public class SimpleIoc {

    private Map<String, Object> beanMap = Maps.newConcurrentMap();

    public SimpleIoc(String configLocation) throws Exception {
        loadConfiguration(configLocation);
    }

    private void loadConfiguration(String configLocation) throws Exception {
        InputStream inputStream = new FileInputStream(configLocation);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(inputStream);
        Element rootElement = document.getDocumentElement();
        NodeList childNodes = rootElement.getChildNodes();

        for (int i = 0 ; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element = (Element) item;
                String id = element.getAttribute("id");
                String className = element.getAttribute("class");

                Class beanClass = null;
                try {
                    beanClass = Class.forName(className);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    return;
                }

                Object bean = beanClass.newInstance();
                NodeList propertyNodeList = element.getElementsByTagName("property");
                for (int j = 0; j < propertyNodeList.getLength(); j++) {
                    Node propertyItem = propertyNodeList.item(j);
                    if (propertyItem instanceof Element) {
                        Element propertyElement = (Element) propertyItem;
                        String name = propertyElement.getAttribute("name");
                        String value = propertyElement.getAttribute("value");

                        Field field = bean.getClass().getDeclaredField(name);
                        field.setAccessible(true);

                        if (value != null && value.length() > 0) {
                            field.set(bean, value);
                        } else {
                            String ref = propertyElement.getAttribute("ref");
                            if (ref == null || ref.length() == 0) {
                                throw new IllegalArgumentException("ref config error");
                            }

                            field.set(bean, getBean(ref));
                        }

                        registerBean(id, bean);
                    }
                }
            }
        }
    }

    public void registerBean(String id, Object bean) {
        beanMap.put(id, bean);
    }

    public Object getBean(String name) {
        Object bean = beanMap.get(name);
        if (bean == null) {
            throw new IllegalArgumentException("there is no bean with name " + name);
        }
        return bean;
    }
}
