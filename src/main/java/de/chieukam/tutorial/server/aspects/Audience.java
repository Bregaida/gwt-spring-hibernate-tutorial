package de.chieukam.tutorial.server.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

  @Pointcut("execution(** de.chieukam.tutorial.server.concert.Performance.perform(..))")
  public void perform() {}
  
  @Before("perform()")
  public void takeSeats() {
    System.out.println("Taking seat.............");
  }

  @Before("perform()")
  public void turnOffCells() {
    System.out.println("Turning off cells...........");
  }

  @AfterReturning("perform()")
  public void applause() {
    System.out.println("CLAP CLAP CLAP CLAP");
  }

  @AfterThrowing("perform()")
  public void demandRefund() {
    System.out.println("Demending refund...........");
  }
}
