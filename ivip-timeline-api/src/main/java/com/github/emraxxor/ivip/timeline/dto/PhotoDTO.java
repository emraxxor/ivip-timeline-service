package com.github.emraxxor.ivip.timeline.dto;


import com.github.emraxxor.ivip.common.response.Response;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PhotoDTO implements Response {

    String photoName;

    String description;

}
