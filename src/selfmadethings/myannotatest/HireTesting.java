package selfmadethings.myannotatest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class HireTesting {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            Class<?> wCl = Class.forName("selfmadethings.myannotatest.Worker");
            Method[] methods = wCl.getDeclaredMethods();
            Constructor<?> c = wCl.getConstructor();
            Worker worker = (Worker) c.newInstance();

            //выполнение методов в порядке приоритетности
            //определяемой аннотацией
            for (Method m : methods)
                if (m.isAnnotationPresent(RunThisNow.class)) {
                    m.invoke(worker, 4);
                }
            for (Method m : methods)
                if (m.isAnnotationPresent(RunThisSecond.class))
                    sb.append(m.invoke(worker)).append(" ");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
        } catch (Exception e) {
            System.err.println("Перехвачено: " + e);
            throw new RuntimeException(e);
        }
        System.out.println(sb);
        sb.delete(0, sb.toString().length());
    }
}
