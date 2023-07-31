package com.mfino.digilinq.scheduler.enitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**	
 * @author Chamith
 */
@Getter
@Setter
@Entity
@Table( name = "dgl_qrtz_scheduler_job_info")
public class SchedulerJobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name ="job_name")
    private String jobName;
    @Column(name ="job_group")
    private String jobGroup;
    @Column(name ="job_class")
    private String jobClass;
    @Column(name ="cron_expression")
    private String cronExpression;
    @Column(name ="repeat_time")
    private Long repeatTime;
    @Column(name ="cron_job")
    private Boolean cronJob;
}