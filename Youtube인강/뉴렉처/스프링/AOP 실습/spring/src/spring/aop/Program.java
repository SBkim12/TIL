package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");	 
		
		// Java Configuration 설정 적용(단일)
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		
		Exam proxy = (Exam) context.getBean("proxy");
		
		//Spring에 올려서 AOP 동작 시키기
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
		
//		Exam exam = new NewlecExam(1,1,1,1);
		
		//곁다리 업무를 갖고있는 proxy
//		Exam proxy = (Exam) Proxy.newProxyInstance(
//				NewlecExam.class.getClassLoader(), 
//				new Class[] {Exam.class}, 
//				new InvocationHandler() {
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						
//						//서브 업무
//						long start = System.currentTimeMillis();
//						
//						//invoke(업무객체, 업무 객체의 파라미터)
//						Object result = method.invoke(exam, args);
//						
//						//강제 시간 경과
//						try {
//							Thread.sleep(200);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						
//						//서브 업무
//						long end = System.currentTimeMillis();
//						
//						String message = (end - start) + "ms 시간 걸렸습니다." ;
//						System.out.println(message);
//						
//						return result;
//					}
//				});
		//AOP 사용 전
		//System.out.printf("total is %d\n", exam.total());
		
		//AOP(Aspect Oriented Programming) 사용 후 
//		System.out.printf("total is %d\n", proxy.total());
//		System.out.printf("avg is %f\n", proxy.avg());
	}

}
