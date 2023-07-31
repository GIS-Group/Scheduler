package com.mfino.digilinq.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.scheduler.enitiy.SchedulerJobInfo;

/**
 * @author Chamith
 */
@Repository
public interface SchedulerRepository extends JpaRepository<SchedulerJobInfo, Long> {

}
