package yalco.sec13reflectionAndAnnotation.chap02.ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

@CustomAnnt
public class MyClass {

	@TargConstr
	public MyClass() { }

	@TargField
	@TargMulti
	//@TargConstr ⚠️ 사용 불가
	int targField;

	@TargMulti
	public void targMethod () {}

	@CustomAnnt
	int field;

	//  아래에 이후의 코드들 작성

	@RetSource
	int retSource;

	@RetClass
	int retClass;

	@RetRuntime
	int retRuntime;

	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> myClass = Class.forName("sec13.chap02.ex02.MyClass");
		for (Field f : myClass.getDeclaredFields()) {
			if (f.getAnnotations().length > 0) {
				System.out.printf(
						"%s : %s%n",
						f.getName(),
						Arrays.stream(f.getAnnotations())
								.map(Annotation::toString)
								.collect(Collectors.joining(","))
				);
			}
		}

		@TargMulti
		boolean targMulti = true;

		//

		System.out.println("\n- - - - -\n");

		Class<?> mySubclass = Class.forName("sec13.chap02.ex02.MySubclass");
		System.out.println(
				"MySubclass의 어노테이션 : " +
						Arrays.stream(mySubclass
										.getAnnotations())
								.map(Annotation::toString)
								.collect(Collectors.joining(","))
		);
	}
}