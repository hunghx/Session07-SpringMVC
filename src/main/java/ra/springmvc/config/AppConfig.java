package ra.springmvc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import ra.springmvc.controller.HomeController;

// cấu hình mvc
@Configuration // chú thích đây là lớp cấu hình
@EnableWebMvc  // hỗ trợ spring web mvc
@ComponentScan(basePackages = "ra.springmvc") // quét tất cả các lớp trong package đó để phát
// hiên cac component (@Component, @Controller, @Service, @Repository) và tạo Bean
public class AppConfig {
    // cấu hình view : ViewResolver
    // tự định nghĩa bean
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/"); // thư mục chứa các giao diện
        resolver.setSuffix(".jsp"); // đuôi file
        return resolver;
    }
}
