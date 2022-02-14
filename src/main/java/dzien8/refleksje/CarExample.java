package dzien8.refleksje;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CarExample {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        try {
            Class<?> carsClass = Class.forName("dzien8.refleksje.Car");
            Field[] fields = carsClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
            }
            System.out.println("----------------");
            Method[] methods = carsClass.getMethods();
            for (Method method : methods
            ) {
                System.out.println(method.getName());
            }
            System.out.println("----------------");
            Constructor<?>[] constructors = carsClass.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.getName());
                System.out.println(Arrays.toString(constructor.getParameterTypes()));

            }

            System.out.println("----------------");

            System.out.println(carsClass.getSuperclass().getName());

        } catch (ClassNotFoundException e) {
            System.out.println("nie ma takiej klasy");
        }

        Class<?> carsClass = Class.forName("dzien8.refleksje.Car");
        Car car = (Car) carsClass.getDeclaredConstructor().newInstance();
        Method[] methods = carsClass.getDeclaredMethods();
        Method[] methods1 = carsClass.getMethods();
        for (Method method : methods) {
            method.invoke(car);
        }


    }

}
