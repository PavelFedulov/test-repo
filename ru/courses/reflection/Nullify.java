import java.lang.reflect.Field;

public class Nullify {
    public static void nullify(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (!field.getType().isPrimitive()) {
                field.set(obj, null);
            }
        }
    }
}
