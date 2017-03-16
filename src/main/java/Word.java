/**
 * Created by yian on 2017/3/16.
 */
public class Word implements Comparable{

    private String name;

    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
