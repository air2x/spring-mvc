//package ru.maxima.config;
//
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.filter.HiddenHttpMethodFilter;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import java.util.logging.Filter;
//
//public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return null;
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[0] {SpringConfig.class};
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[0];
//    }
//
//    @Override
//    protected jakarta.servlet.Filter[] getServletFilters() {
//        return new Filter[] {
//                new Filter(), new CharacterEncodingFilter() };
//    }
//}
