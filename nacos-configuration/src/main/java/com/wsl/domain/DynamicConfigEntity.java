package com.wsl.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author wsl
 * @date 2022/4/19 19:34
 * @description
 */
@Component
@Data
@RefreshScope
public class DynamicConfigEntity {

    @Value("${config.version}")
    private String version;

    private String name;

}
