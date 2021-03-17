package com.huanhai;

import com.huanhai.utils.GSonUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
           User user=new User();
           user.setName("张三");
           user.setAge(18);
        System.out.println(GSonUtils.serialise(user));
        assertTrue( true );
        String json="{\"name\":\"张三\",\"age\":18}";
        User u=GSonUtils.deSerialise(json,User.class);
        System.out.println(u.age);

    }

    class  User{
        private String name;
        private Integer age;
        public User(){}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
