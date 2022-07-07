package com.github.emraxxor.ivip.timeline.entity;

import com.github.emraxxor.ivip.common.crud.BaseEntity;
import com.github.emraxxor.ivip.common.response.Result;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "photo")
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class PhotoEntity extends BaseEntity<Long> implements Result {

    String photoName;

    String description;
}
