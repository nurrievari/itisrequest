package ru.itis.itisrequestproject.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PostTemplate {
    private String what = "➢ ЧТО:";
    private String place = "➢ ГДЕ:";
    private String eventTime = "➢ КОГДА:";
    private String actions = "➢ ЧТО НУЖНО ДЕЛАТЬ:";
    private String people = "➢ КОЛИЧЕСТВО ЧЕЛОВЕК:";
    private String profit = "➢ ЗА УЧАСТИЕ:";
    private String control = "➢ ЗАПИСЬ:";
}
