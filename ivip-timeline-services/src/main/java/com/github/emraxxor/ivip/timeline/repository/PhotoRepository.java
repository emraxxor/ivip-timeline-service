package com.github.emraxxor.ivip.timeline.repository;

import com.github.emraxxor.ivip.timeline.entity.PhotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepository extends CrudRepository<PhotoEntity, Long>,
                                JpaRepository<PhotoEntity,Long>, JpaSpecificationExecutor<PhotoEntity> {
}
