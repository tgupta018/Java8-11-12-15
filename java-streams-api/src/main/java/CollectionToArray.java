import java.util.*;


public class CollectionToArray {

    static class Country {
        String code;
        String name;
        Country(String code, String name) {
            this.code = code;
            this.name = name;
        }
        @Override
        public String toString(){
            return code+"--"+name;
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Doc", "Grumpy", "Happy", "Sleepy", "Dopey", "Bashful", "Sneezy");
        System.out.println("List to Array example in Java 8:");

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }

//    public static void toArrayInApproach1(){
//        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        Integer[] array1 = list.toArray(Integer[]::new);
//        System.out.println(Arrays.toString(array1));
//
//        Set<Integer> hset1 = new LinkedHashSet<>(list);
//        hset1.remove(1);
//        Integer[] array2 = hset1.toArray(Integer[]::new);
//        System.out.println(Arrays.toString(array2));
//
//        Set<Country> hset2 = new HashSet<>();
//        hset2.add(new Country("ID", "Indonesia"));
//        hset2.add(new Country("SG", "Singapore"));
//        hset2.add(new Country("MY", "Malaysia"));
//        Country[] array3 = hset2.toArray(Country[]::new);
//        System.out.println(Arrays.toString(array3));
//    }
}
