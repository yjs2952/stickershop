/*
package com.stickershop.stickershop.helper;

import com.github.jknack.handlebars.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.view.AbstractTemplateView;
import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;

import java.io.IOException;
import java.util.Locale;

@HandlebarsHelper
public class HandleBarHelper {
    private static final Logger log = LoggerFactory.getLogger(HandleBarHelper.class);

    @Autowired
    private MessageSource messageSource;

    public CharSequence code(final String code, final Options options) throws IOException {
        log.debug("code : {}", code);
        Object[] args = options.params;
        String defaultMessage = options.hash("default");
        return messageSource.getMessage(code, args, defaultMessage, currentLocale());
    }

    public CharSequence url(final String url, final Options options) throws IOException {
        log.debug("url : {}", url);
        RequestContext requestContext = (RequestContext)options.get(AbstractTemplateView.SPRING_MACRO_REQUEST_CONTEXT_ATTRIBUTE);
        Object[] params = options.params;
        return requestContext.getContextPath() + String.format(url, params);
    }

    protected Locale currentLocale() {
        return LocaleContextHolder.getLocale();
    }
}*/
