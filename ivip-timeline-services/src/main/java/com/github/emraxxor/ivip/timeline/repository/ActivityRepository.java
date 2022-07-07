package com.github.emraxxor.ivip.timeline.repository;

import com.github.emraxxor.ivip.common.crud.DocumentRepository;
import com.github.emraxxor.ivip.timeline.index.ActivityPostEntity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<ActivityPostEntity, String>, DocumentRepository<ActivityPostEntity>  {
}
