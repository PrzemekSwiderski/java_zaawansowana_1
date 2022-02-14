package dzien8.generyki;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Refleksje {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> boxClass = Class.forName("dzien8.generyki.Box");
        Constructor<?>[] constructors = boxClass.getDeclaredConstructors();
        Field[] fields = boxClass.getDeclaredFields();
        Method[] methods = boxClass.getDeclaredMethods();

        for (Constructor<?> construktor : constructors) {
            System.out.println(construktor.getName());
            System.out.println(Arrays.toString(construktor.getParameterTypes()));
        }
        System.out.println("===============");
        for (Field field : fields) {
            System.out.println(Modifier.toString(field.getModifiers())
                    + " " + field.getType() + " " + field.getName());
        }
        System.out.println("===============");
        for (Method method : methods) {
            System.out.print(method.getName() + " ");
            System.out.println(Arrays.toString(method.getParameters()));

        }


    }
}

