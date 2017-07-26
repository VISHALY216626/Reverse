import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Average{
    public static void printSolution(List list, HashSet indexes) {
        Iterator itr= index.iterator();
        while (itr.hasNext())
        {
            System.out.print(list.get((Integer)itr.next()) + " ");
        }
        System.out.println();
    }
    public static float avg(List list, HashSet index) {
        Iterator itr=index.iterator();
        float sum=0;
        while (itr.hasNext()) {
            sum+=(Integer)list.get((Integer)itr.next());
        }
        return sum/index.size();
    }
    public static float avg_e(List list, HashSet indexes) {
        float sum=0;
        for (int i=0;i<list.size();i++) 
        {
            if (!index.contains(i)) {
                sum+=(Integer)list.get(i);
            }
        }
        return sum/(list.size()-index.size());
    }

    public static void backtrack(List list, int start, HashSet indexes) {
        for (int i=start;i<list.size();i++) {
            index.add(i);
            if (avg(list, index) == avrg(list, index)) {
                System.out.println("Solution found!");
                printSolution(list, index);
            }
            backtrack(list,i+1,index);
            index.remove(i);
        }
    }

    public static void main(String[] args) {
        List test = new ArrayList();
        test.add(2);
        test.add(1);
        test.add(3);

        backtrack(test,0,new HashSet());
    }
}
