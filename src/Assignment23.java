import java.util.*;
import java.io.*:


public class Assignment23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> gemlist = new ArrayList<>();
        gemlist.add("Emarald");
        gemlist.add("Ruby");
        gemlist.add("Jasper");
        gemlist.add("Ivory");
        gemlist.add("Garnet");
        ArrayList<Integer> price = new ArrayList<>();
        price.add(1760);
        price.add(2119);
        price.add(1599);
        price.add(3920);
        price.add(3999);
        ArrayList<String> reqgem = new ArrayList<>();
        reqgem.add("Ivory");
        reqgem.add("Eramald");
        reqgem.add("Garnet");
        ArrayList<Integer> reqq= new ArrayList<>();
        reqq.add(3);
        reqq.add(10);
        reqq.add(12);
        int tot=0;
        if(gemlist.size()<reqgem.size()) {
            System.out.println("remquired gem not present");
            System.out.println(-1);

        }else {
            for (int i = 0; i < reqgem.size(); i++) {
                for (int j = 0; j < gemlist.size(); j++) {
                    if (reqgem.get(i) == gemlist.get(j))
                        tot += reqq.get(i) * price.get(i);
                }
            }

            if (tot > 30000)
                tot = tot - ((tot * 5) / 100);
            System.out.println("total discounted price is="+tot);
        }

    }
    }