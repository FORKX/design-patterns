package com.huan.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectTest {

	/**
	 * Class创建以及对象的创建
	 * Class 封装的为类的信息 属性、方法、构造方法等。
	 * 一个类只有一个Class对象并由系统建立
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test
	public void CreateClass() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 1.类名
		Class<Person> class1 = Person.class;
		System.out.println(class1);
		// 2.全类名
		Class<Person> class2 = (Class<Person>) Class.forName("com.huan.reflect.Person");
		System.out.println(class2);
		// 对象
		Person person = new Person();
		Class<Person> class3 = (Class<Person>) person.getClass();
		System.out.println(class3);

		// class创建对象  调用的为无参构造方法
		Person p1 = class1.newInstance();
		Person p2 = class2.newInstance();
		Person p3 =  class3.newInstance();
		System.out.println(p1+"\n"+p2+"\n"+p3);
	}

	/**
	 * 通过class获取方法
	 * @throws Exception 
	 */
	@Test
	public void getMethod() throws Exception {
		Class<Person> personClass = Person.class;
		//获取所有方法，包括父类 但是没有私有的方法
		Method[] methods = personClass.getMethods();
		for (int s = 0; s < methods.length; s++) {
			System.out.print(" "+methods[s].getName());
		}
		System.out.println();
		//获取本类的所有方法 包括私有方法
		Method[] selfMethods = personClass.getDeclaredMethods();
		for (int i = 0; i < selfMethods.length; i++) {
			System.out.print(" "+selfMethods[i].getName());
		}
		System.out.println();
		//获取指定方法
		Method say = personClass.getDeclaredMethod("say");
		System.out.println(say);
		Method setName = personClass.getDeclaredMethod("setName", String.class);
		System.out.println(setName);
		
		//运行方法 参数为：1，对象   2.参数
		Person person = personClass.newInstance();
		setName.invoke(person, "昊天");
		System.out.println(person.getName());
		
		//私有方法的执行前需要设置setAccessible(true)
		say.setAccessible(true);
		say.invoke(person);
		
		
	}
	
	/***
	 * 获取字段
	 * @throws Exception
	 */
	@Test
	public void getField() throws Exception {
		
		Class<Person> personClass = Person.class;
		//获取所有本类的字段 公有和私有
		Field[] fields = personClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(" "+fields[i]);
		}
		//获取指定字段
		Field name = personClass.getDeclaredField("name");
		System.out.println(name.getName());
		
		Person person = new Person("昊天",10000);
		//字段私有 必须设置
		name.setAccessible(true);
		Object object = name.get(person);
		System.out.println(object);
		name.set(person, "桑桑");
		System.out.println(person.getName());
	}
	
	/***	
	 * 获取构造方法
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	@Test
	public void getConstructor() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Person> personClass = Person.class;
		//获取所有的构造方法
		Constructor<Person>[] declaredConstructors = (Constructor<Person>[]) personClass.getConstructors();
		for (int i = 0; i < declaredConstructors.length; i++) {
			System.out.println(declaredConstructors[i]);
		}
		//获取指定的构造方法
		Constructor<Person> constructor = personClass.getConstructor(String.class,Integer.class);
		System.out.println(constructor);
		
		//执行构造方法
		Person person = constructor.newInstance("昊天",12000);
		System.out.println(person.getName()+"|"+person.getAge());
		
	}
	
	
	
}
