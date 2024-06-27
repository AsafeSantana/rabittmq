package com.ms.user.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class EmailDto {

    private UUID userId;
    private String emailto;
    private String subject;
    private String text;
}
