package com.example.psh_test.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data

public class Board {
    private Long boardId;
    private String title;
    private String content;
    private String name;
    private LocalDateTime createDate;
    private int read;
    private Long memberId;

}
