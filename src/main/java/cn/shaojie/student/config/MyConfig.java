package cn.shaojie.student.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author 少杰
 * @create 2019/6/27  21:16
 */
@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**","/static/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/","classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
    }
}
