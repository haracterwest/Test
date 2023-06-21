package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){
    }


    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10 (all)");
    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforGetLoggingAdvice() {
//        System.out.println("beforGetLoggingAdvice: writing Log #1 (get)");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public  void beforReturnLoggingAdvice() {
//        System.out.println("beforReturnLoggingAdvice: writing Log #2 (return)");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforGetAndReturnLoggingAdvice() {
//        System.out.println("beforGetAndReturnLoggingAdvice: writing Log #3 (get and return)");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()") //pointcut - срез, точка соединения
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public  void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала ");
//    }

}
