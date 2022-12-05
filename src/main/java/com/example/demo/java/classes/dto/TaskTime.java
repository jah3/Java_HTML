package com.example.demo.java.classes.dto;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
public class TaskTime {
    String CurrentTime =  new SimpleDateFormat("HH.mm").format(new Date());;
}
