/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package edu.iuh.fit.backend.domain.dto;

import lombok.Getter;
import lombok.Setter;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
@Getter
@Setter
public class Meta {
    private int page;
    private int pageSize;
    private int pages;
    private long total;
}
