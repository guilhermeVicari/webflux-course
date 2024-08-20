package br.com.vicas.webflux_course.model.request;

public record UserRequest(
    String name,
    String email,
    String password
) { }
