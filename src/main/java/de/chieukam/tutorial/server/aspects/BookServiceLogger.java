package de.chieukam.tutorial.server.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookServiceLogger {

  @Around("execution(** de.chieukam.tutorial.server.BookServiceImpl.saveOrUpdate(..))")
  public void logging(ProceedingJoinPoint jp) {
    Log log = LogFactory.getLog(jp.getClass());
    log.info("Saving a book: ");
    try {
      jp.proceed();
    } catch (Throwable exc) {
      log.error("Erro ao salvar book: "+exc);
    }
  }
}
