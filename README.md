Spring XML-Based Configuration – How It Works
1. Create POJO (Normal Java Class)
public class Student {
    public void display() {
        System.out.println("Hello Student");
    }
}
This is a plain Java class.
Spring does not automatically create objects from it unless configured.

2. Define Bean in XML Configuration
Create applicationContext.xml (inside src/main/resources):

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="stdId" class="com.example.Student"/>
</beans>

This XML file tells Spring:
Which class to convert into a bean
Bean ID to access it
Dependencies (if any)

3. Start the Spring IoC Container
ApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
4. Retrieve Bean from the Container
Student std = context.getBean("stdId", Student.class);

5. Use the Bean
std.display();
At this point the bean is ready to use—lifecycle, creation, and injection are already handled by Spring.



POJO Class (Java)
       ↓
XML Configuration (applicationContext.xml)
       ↓
Spring Container Starts
       ↓
Reads <bean> Definitions
       ↓
Creates Objects (Beans)
       ↓
Stores Beans in IoC Container
       ↓
getBean("id")
       ↓
Use the Bean

