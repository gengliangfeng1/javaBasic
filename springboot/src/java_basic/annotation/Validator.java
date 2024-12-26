package java_basic.annotation;

import java.lang.reflect.Field;

class Validator {
    public static boolean validate(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ValidateNotNull.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(object);
                    if (value == null) {
                        ValidateNotNull annotation = field.getAnnotation(ValidateNotNull.class);
                        System.out.println(annotation.message());
                        return false;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }
}
