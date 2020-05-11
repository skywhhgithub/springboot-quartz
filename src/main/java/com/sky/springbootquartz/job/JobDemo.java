package com.sky.springbootquartz.job;

import com.sky.springbootquartz.sevice.ServiceDemo;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class JobDemo implements Job {

    @Autowired
    ServiceDemo serviceDemo;
    @Override
    public void execute(JobExecutionContext context){
        System.out.println("job execute"+new Date());
        serviceDemo.doService();
    }
}
