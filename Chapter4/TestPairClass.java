public class TestPairClass {
    public static void main(String[] args) {
        Pair<Month, Integer> chrismas = new Pair<Month, Integer>(Month.DEC, 25);
        System.out.println(chrismas);
        Month month = chrismas.getFirst();
        int day = chrismas.getSecond();
        System.out.printf("%d %s%n", day, month);
    }
}

enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

/** 泛型类
 * S、T 为两个类型参数
 * 如果使用非JCF泛型类（即没有指定元素类型的类型参数）编译程序，则可能会获得如下编译器消息：
 * 
 * uses unchecked or unsafe operations.
 * Note: Recompile with-Xlint:unchecked for details.
 *
 * 指定元素类型就可以避免这个问题，哪怕是Object本身，如下：
 *
 * List<Object> list = new ArrayList<Object>();
 *
 */
class Pair<S, T> {
    private S first;
    private T second;
    public Pair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
