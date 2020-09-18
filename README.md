#### 项目创建过程tips
◇创建空的maven项目；
◇pom.xml添加Spring相关依赖；
◇bean的xml配置需要存放到"src/main/java/resources"目录下才能被ClassPathXmlApplicationContext找到；


#### IoC机制测试
◆运行Application中的main方法，可以正常获取到IoC实例和调用其方法；