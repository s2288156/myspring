# document

## 1 - DefaultBeanFactory

### 1.1 loadBeanDefinition

1. 获取类加载器，根据文件路径读取InputStream
2. 使用SAXReader解析文件流，获取Document
3. 获取Document根节点Element，以及其迭代器`Iterator<Element>`
4. 遍历迭代器，获取标签内信息`id`和`class`，并初始化BeanDefinition，放入集合`ConcurrentHashMap`