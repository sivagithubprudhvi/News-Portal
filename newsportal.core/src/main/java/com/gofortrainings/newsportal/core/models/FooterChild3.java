package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables=Resource.class)
public class FooterChild3 {
@ValueMapValue
private String text3;

public String getText3() {
	return text3;
}
}