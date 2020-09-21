#### 项目创建过程tips
◇创建空的maven项目；

◇pom.xml添加Spring相关依赖；

◇bean的xml配置需要存放到"src/main/java/resources"目录下才能被ClassPathXmlApplicationContext找到；


#### IoC机制测试
◆运行Application中的main方法，可以正常获取到IoC实例和调用其方法；

◆UserServiceImpl依赖了UserDao，UserDao实例通过xml配置以及setter方式注入；


#### Spring注解
◇UserServiceImpl依赖了Logger，Logger实例通过Spring注解方式注入；

◇使用Spring注解需要为xml配置增加"context"的schema；

◇Logger读取项目配置文件"application.properties"信息并在初始化完毕后打印；

◇Value注解获取项目配置文件需要定义名为"propertyConfigurer"的bean；


#### AOP
●对service包下所有类的say()方法的before和after做了切面处理；