package ra.springmvc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // cấu hình những thành phần ko liên quan tới mvc
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // cấu hình liên quan toi MVC
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
//    Cấu hình hỗ trợ utf-8

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("utf-8",true);
        return new Filter[]{filter};
    }
}
