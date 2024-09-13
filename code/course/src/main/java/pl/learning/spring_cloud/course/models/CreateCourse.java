package pl.learning.spring_cloud.course.models;

import jakarta.validation.constraints.NotBlank;

public record CreateCourse(

    @NotBlank(message = "Name is required")
    String name
){}
