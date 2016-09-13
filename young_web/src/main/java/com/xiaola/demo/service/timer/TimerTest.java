package com.xiaola.demo.service.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xiaola on 16/9/7.
 */
public class TimerTest {
    Timer timer;

    public TimerTest(){
        Date time  = getTime();
        System.out.println("指定时间time==" + time);
        timer = new Timer();
        timer.schedule(new TimerTestRun(),time);
    }

    public Date getTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,10);
        calendar.set(Calendar.MINUTE,30);
        calendar.set(Calendar.SECOND,00);

        Date time = calendar.getTime();

        return time;
    }

    public static void main(String[] args){
        new TimerTest();
    }
}
