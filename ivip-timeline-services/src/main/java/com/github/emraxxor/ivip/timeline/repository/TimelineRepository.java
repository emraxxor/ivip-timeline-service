package com.github.emraxxor.ivip.timeline.repository;

import com.github.emraxxor.ivip.common.crud.DocumentRepository;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import org.springframework.data.repository.CrudRepository;

public interface TimelineRepository extends CrudRepository<TimelineIndexEntity, String>, DocumentRepository<TimelineIndexEntity> {
}
