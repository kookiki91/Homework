package kr.eddi.demo.controller.rpgPractice.request;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Items {
    private Integer atk;
    private String description;
    private String name;
    private Integer price;
}
