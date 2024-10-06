package com.roman.sports_info.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Commentary {
    private int id;
    private String commText;
    private Timestamp timestamp;
    private int ballNbr;
    private double overNumber;
    private int inningsId;
    private String event;
    private String batTeamName;
}
