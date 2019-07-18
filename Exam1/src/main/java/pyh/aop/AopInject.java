package pyh.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopInject {
    private final Logger logger = LoggerFactory.getLogger(AopInject.class);

    @Pointcut("execution(* pyh.dao.*.insert*(..))") //监测数据库所有插入方法
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeInsert(){
        logger.info("BeforeInsertFilmData");
    }

    @After("pointCut()")
    public void afterInsert(){
        logger.info("AfterInsertFilmData");
    }
}
