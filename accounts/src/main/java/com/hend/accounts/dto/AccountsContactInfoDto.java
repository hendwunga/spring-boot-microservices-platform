package com.hend.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @author : hend wunga
 */
@ConfigurationProperties(prefix="accounts")
public record AccountsContactInfoDto(String message, Map<String,String> contactDetails, List<String> onCallSupport) {

}
