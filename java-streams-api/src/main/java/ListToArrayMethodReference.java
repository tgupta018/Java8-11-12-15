import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToArrayMethodReference {

    public static void main(String[] args) {
//        removeDuplicateFromListAndReturnArray();
//        findDuplicateStringFromList();
//        findDuplicateByGrouping();
        findDuplicateByCollectionFrequency();
    }

    public static void removeDuplicateFromListAndReturnArray(){
        String[] strArray ={"Martin","Brayan","Sam","Mala","Martin","Joel","Sam","Martin","Mala"};
        Arrays.stream(strArray).forEach(System.out::println);
        List<String> strList = Arrays.asList(strArray)
                .stream()
                .distinct()
                .sorted().collect(Collectors.toList());
        String[] strNewArr =strList.toArray(new String[strList.size()]);
        System.out.printf(Arrays.toString(strNewArr));
    }

    public static void findDuplicateStringFromList(){
        String[] strArray ={"Martin","Brayan","Sam","Mala","Martin","Joel","Sam","Martin","Mala"};
        Set<String> strSet = new HashSet<>();
        Set<String> stringSet = Arrays.asList(strArray).stream()
                .filter(k->!strSet.add(k))
                .collect(Collectors.toSet());
        stringSet.forEach(System.out::println);
    }
    public static void findDuplicateByGrouping(){
        int[] intArr = {5,4,3,2,1,8,9,8,9,8,4,3};
        Map<Integer,Long> countIntMap =Arrays.stream(intArr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //countIntMap.forEach((k,v)->System.out.println("k::"+k+"v::"+v));
        Set<Integer> setInt= countIntMap.entrySet()
                .stream()
                .filter(k-> k.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        setInt.forEach(System.out::println);
    }

    public static void findDuplicateByCollectionFrequency(){
        int[] intArr = {5,4,3,2,1,8,9,8,9,8,4,3};
        List<Integer> intgList = Arrays.stream(intArr).boxed().collect(Collectors.toList());
        Set<Integer> countIntSet =intgList.stream()
                .filter(i->Collections.frequency(intgList,i)>1)
                .collect(Collectors.toSet());
        countIntSet.forEach(System.out::println);
    }

}
