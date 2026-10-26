// from: https://www.youtube.com/watch?v=bhhMJSKNCQY
//       Java Reflection Explained (Coding with John)

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTutorial {

	public static void main(String[] args) throws Exception {
	
		Cat myCat = new Cat("Stella", 6);

		/* list of declared fields */
		Field[] catFields = myCat.getClass().getDeclaredFields();

		for (Field field : catFields) {
			System.out.println(field.getName());
		}
		System.out.println("---");

		/* attempt 1
		for (Field field : catFields) {
			if (field.getName().equals("name")) {
				field.set(myCat, "Jimmy McGill");
			}
		}
		*/
		// compile and run output:
		// Exception in thread "main" java.lang.IllegalAccessException: class ReflectionTutorial cannot access a member of class Cat with modifiers "private final"
        // at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:361)
        // at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:591)
        // at java.base/java.lang.reflect.Field.checkAccess(Field.java:1075)
        // at java.base/java.lang.reflect.Field.set(Field.java:778)
        // at ReflectionTutorial.main(ReflectionTutorial.java:19)


		/* attempt 2 */
		for (Field field : catFields) {
			if (field.getName().equals("name")) {
				field.setAccessible(true); // !!!
				field.set(myCat, "Jimmy McGill");
			}
		}

		System.out.println("Cat's name: " + myCat.getName());
		System.out.println("---");
		// compile and run output:
		// name
		// age
		// Cat's name: Jimmy McGill

		/* list of declared methods */
		Method[] catMethods = myCat.getClass().getDeclaredMethods();

		/* test 1: list of declared methods
		for (Method method : catMethods) {
			System.out.println(method.getName());
		}
		System.out.println("---");
		*/
		// compile and run output:
		// getName
		// thisIsAPrivateStaticMethod
		// thisIsAPublicStaticMethod
		// meow
		// heyThisIsPrivate
		// getAge
		// setAge
		// ---


		/* test 2: invoking public method */
		for (Method method : catMethods) {
			if (method.getName().equals("meow")) {
				method.invoke(myCat); // same as myCat.meow() since it's public method
			}
		}
		System.out.println("---");
		// compile and run output:
		// Meow!
		// ---

		/* test 3: invoking PRIVATE method -- attempt 1
		for (Method method : catMethods) {
			if (method.getName().equals("heyThisIsPrivate")) {
				method.invoke(myCat);
			}
		}
		System.out.println("---");
		// compile and run output:
		// Exception in thread "main" java.lang.IllegalAccessException: class ReflectionTutorial cannot access a member of class Cat with modifiers "private"
        // at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:361)
        // at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:591)
        // at java.base/java.lang.reflect.Method.invoke(Method.java:558)
        // at ReflectionTutorial.main(ReflectionTutorial.java:86)
		*/
		
		/* test 3: invoking PRIVATE method -- attempt 2 */
		for (Method method : catMethods) {
			if (method.getName().equals("heyThisIsPrivate")) {
				method.setAccessible(true); // !!!
				method.invoke(myCat);
			}
		}
		System.out.println("---");

		/* invoking public static methods */
		for (Method method : catMethods) {
			if (method.getName().equals("thisIsAPublicStaticMethod")) {
				method.setAccessible(true); // !!!
				method.invoke(null);
			}
		}
		System.out.println("---");

		/* invoking private static methods */
		for (Method method : catMethods) {
			if (method.getName().equals("thisIsAPrivateStaticMethod")) {
				method.setAccessible(true); // !!!
				method.invoke(null);
			}
		}
		System.out.println("---");



	} // end main

}

