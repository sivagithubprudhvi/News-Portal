package com.gofortrainings.newsportal.core.models;




import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables=Resource.class)
public class AboutUs {
 @ValueMapValue
 private String image;
 @ValueMapValue
 private String text;
 @ValueMapValue
 private String text1;
 @ValueMapValue
 private String desc;
 @ValueMapValue
 private String msg1;
 @ValueMapValue
 private String msg2;
 @ValueMapValue
 private String msg3;
 @ValueMapValue
 private String msg4;
 @ValueMapValue
 private String text2;
public String getImage() {
	return image;
}
public String getText() {
	return text;
}
public String getText1() {
	return text1;
}
public String getDesc() {
	return desc;
}
public String getMsg1() {
	return msg1;
}
public String getMsg2() {
	return msg2;
}
public String getMsg3() {
	return msg3;
}
public String getMsg4() {
	return msg4;
}
public String getText2() {
	return text2;
}


 
 
}
