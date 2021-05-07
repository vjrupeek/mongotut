package com.jk.micro.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "todo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

	@Id
    private String id;
    private String description;
    private int severity;
    private String assignee;
    private String status;
}
