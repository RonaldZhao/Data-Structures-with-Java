import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class TestPrint {
    public static void main(String[] args) {
        args = new String[]{"CA", "US", "MX", "HN", "GT"};
        print(args);
        Set<String> set = new HashSet<String>();
        for(String s : args) {
            set.add(s);
        }
        print2(set);
    }

    static<E> void print(E[] a) {
        for(E ae:a) {   // 可以根据接受的参数a自动判断ae应该是什么类型
            System.out.printf("%s ", ae);
        }
        System.out.println();
    }

    /**
     *
     * ? 为泛型通配符
     *
     * 此方法可以输出任何类型的集合
     *
     */
    static void print2(Collection<?>c) {
        for(Object o : c) {
            System.out.printf("%s ", o);
        }
        System.out.println();
    }
}
