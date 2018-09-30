package org.hut.kkorder.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by hutwanghui on 2018/9/19.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    private int id;
    private String msg;
    private LocalDateTime sendTime;
}
