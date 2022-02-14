package dzien8.adontacje;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class AnnotationExamples {

    @MyAnnotation(name = "nazwa")
    private String field;

    public AnnotationExamples() {

    }

    @MyAnnotation(name = "cos")
    @Testowy(id = 1)
    private void method(int parameter) {
        double variable;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class<?> annotationExampleClass = Class.forName("dzien8.adontacje.AnnotationExamples");
        Field clssField = annotationExampleClass.getDeclaredField("field");
        System.out.println(clssField.getDeclaredAnnotation(MyAnnotation.class).name());
        Method classMethod = annotationExampleClass.getDeclaredMethods()[1];
        System.out.println(classMethod.getDeclaredAnnotation(Testowy.class).id());
        System.out.println(classMethod.getDeclaredAnnotation(MyAnnotation.class).name());


    }
}
