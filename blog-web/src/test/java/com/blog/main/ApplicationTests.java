package com.blog.main;

import com.blog.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/***********************************************************************************************************************
 *                                       @author liangpeng
 *                                       create date 2018/01/18
 ***********************************************************************************************************************
 *> 概述
 *  对模块进行集成测试时，希望能够通过输入URL对Controller进行测试，如果通过启动服务器，建立http client进行测试，
 *  这样会使得测试变得很麻烦，比如，启动速度慢，测试验证不方便，依赖网络环境等，这样会导致测试无法进行，
 *  为了可以对Controller进行测试，可以通过引入MockMVC进行解决。
 *
 *  >简介
 * MockMvc实现了对Http请求的模拟，能够直接使用网络的形式，转换到Controller的调用，这样可以使得测试速度快、
 * 不依赖网络环境，而且提供了一套验证的工具，这样可以使得请求的验证统一而且很方便
 *
 *> 运行配置
 *> @RunWith(SpringJUnit4ClassRunner.class)
 *  表示使用Spring Test组件进行单元测试
 *
 *> @SpringBootTest(classes = MockServletContext.class)
 * 在高版本中@SpringApplicationConfiguration被@SpringBootTest取代
 *
 *> @WebAppConfiguration
 * 使用这个Annotate会在跑单元测试的时候真实的启一个web服务，然后开始调用Controller的Rest API，
 * 待单元测试跑完之后再将web服务停掉;
 *
 * > @ContextConfiguration("classpath*:**web-config.xml")
 * 指定Bean的配置文件信息，可以有多种方式，这个例子使用的是文件路径形式，如果有多个配置文件，
 * 可以将括号中的信息配置为一个字符串数组来表示;
 *
 * 来自 ：https://www.cnblogs.com/xiaohunshi/p/5706943.html ，https://www.cnblogs.com/0201zcr/p/5756642.html
 ***********************************************************************************************************************/
/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class ApplicationTests {
    private MockMvc mvc;

    //@Autowired
    private UserController userController;
   /* @Autowired
    private BlogProperties blogProperties;*/

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    /*******************************************************************************************************************
     *                                              方法描述
     * *****************************************************************************************************************
     * > perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
     * > get:声明发送一个get请求的方法。MockHttpServletRequestBuilder get(String urlTemplate, Object... urlVariables)：根据uri模板和uri变量值得到一个GET请求方式的。另外提供了其他的请求的方法，如：post、put、delete等。
     * > param：添加request的参数，如上面发送请求的时候带上了了pcode = root的参数。假如使用需要发送json数据格式的时将不能使用这种方式，可见后面被@ResponseBody注解参数的解决方法
     * > andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）；
     * > andDo：添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断）；
     * > andReturn：最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理（对返回的数据进行的判断）；
     *
     * @throws Exception
     */
    //@Test
    public void getHello() throws Exception {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");

       String data = mvc.perform(MockMvcRequestBuilders.get("/user/login/admin/admin").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串;
        System.out.println("返回结果：" + data);
    }



}