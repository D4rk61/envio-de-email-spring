package com.spring.mail.sender.domain.dto;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmailDTO {

    private String[] toUser;
    private String subject;
    private String message;
}