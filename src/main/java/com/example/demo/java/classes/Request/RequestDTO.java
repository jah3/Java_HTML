package com.example.demo.java.classes.request;

import com.example.demo.java.classes.dto.HumanDTO;
import com.example.demo.java.classes.dto.TaskTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDTO {
    TaskTime taskTime = new TaskTime();
    HumanDTO user = new HumanDTO();
}
