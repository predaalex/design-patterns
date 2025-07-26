package com.example.errorHandler;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Produces
@Singleton
public class IllegalArgumentExceptionHandler implements ExceptionHandler<IllegalArgumentException, HttpResponse<?>> {
    private final static Logger log = LoggerFactory.getLogger(IllegalArgumentExceptionHandler.class);

    @Override
    public HttpResponse<?> handle(HttpRequest request, IllegalArgumentException exception) {
        log.error(exception.getMessage());
        return HttpResponse.badRequest(new ErrorResponse("Bad Request", exception.getMessage()));
    }
}
