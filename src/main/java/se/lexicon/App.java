package se.lexicon;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ex15();
    }

    //1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
    public static void ex1() {
        List<String> weekDays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.println("Print days of the week as Arrays:" + weekDays);
    }

    //2. Create a new list and populate it with the days of the week. Lastly, iterate through the list and print out each element separately.
    public static void ex2() {
        List<String> weekDays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.println("Print days of the week using iterator:");
        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }
    }

    //3. Create a new list and populate it with the days of the week excluding THURSDAY.
    // Lastly, insert the weekday THURSDAY into the right position in the list.
    public static void ex3() {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        System.out.println(weekDays);
        weekDays.add(4, "Thursday");
        System.out.println(weekDays);
    }

    //4. Create a new list and populate it with the days of the week.
    // Then create a new list out of the first three elements of the first list using a subList.
    public static void ex4() {
        List<String> weekDays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.println("Print days of the week using iterator:" + weekDays);
        List<String> subList = weekDays.subList(0,3);
        System.out.println("Sublist: " + subList);
    }

    //5. Create a new hashset and populate it with the days of the week.
    // Lastly, print the set out and pay attention to the order of the elements.
    public static void ex5() {
        Set<String> weekDaysSet = new HashSet<>();
        List<String> weekDaysList = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        boolean isAdded = weekDaysSet.addAll(weekDaysList);
        System.out.println("Is List of collection added to the Set: " + isAdded);
        System.out.println("Elements of the Set:");
        for (String day : weekDaysSet) {
            System.out.println(day);
        }
//        HashSet<String> weekDaysSet1 = new HashSet<>();
//        weekDaysSet1.add("Sunday");
//        weekDaysSet1.add("Monday");
//        weekDaysSet1.add("Tuesday");
//        weekDaysSet1.add("Wednesday");
//        weekDaysSet1.add("Thursday");
//        weekDaysSet1.add("Friday");
//        weekDaysSet1.add("Saturday");
//        for(String day : weekDaysSet1) {
//            System.out.println(day);
//        }
    }

    //6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to an arrayList.
    public static void ex6() {
        Set<String> weekDaysSet = new HashSet<>();
        weekDaysSet.add("Sunday");
        weekDaysSet.add("Monday");
        weekDaysSet.add("Tuesday");
        weekDaysSet.add("Wednesday");
        weekDaysSet.add("Thursday");
        weekDaysSet.add("Friday");
        weekDaysSet.add("Saturday");
        System.out.println("Hashset contents: " + weekDaysSet);

        List<String> weekDaysList = new ArrayList<>(weekDaysSet);
        System.out.println("Hashset is converted into List...");
        System.out.println("Arraylist contents: " + weekDaysList);
    }

    //7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList.
    // Lastly, manually sort the list in alphabetical order and print it out.
    public static void ex7() {
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Alex");
        namesSet.add("alice");
        namesSet.add("Oscar");
        namesSet.add("George");
        namesSet.add("Peter");
        namesSet.add("Justin");
        System.out.println("Hashset contents: " + namesSet);

        List<String> namesList = new ArrayList<>(namesSet);
        System.out.println("ArrayList contents Before sorting: " + namesList);
        namesList.sort(null);
        namesList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("ArrayList contents After sorting: " + namesList);
    }

    //8. Create a new hashSet and populate it with random names.
    // Lastly, sort the names in alphabetical order using only a Set or a child of Set.
    public static void ex8() {
        Set<String> namesHashSet = new HashSet<>();
        namesHashSet.add("Alex");
        namesHashSet.add("alice");
        namesHashSet.add("Oscar");
        namesHashSet.add("George");
        namesHashSet.add("Peter");
        namesHashSet.add("Justin");
        System.out.println("Hashset contents: " + namesHashSet);

        Set<String> namesTreeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        namesTreeSet.addAll(namesHashSet);
        System.out.println("Sorted names set using child of Set(Tree set): " + namesTreeSet);
    }

    //9. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and
    // a car brand(String). Lastly, print out the entire hashMap.
    public static void ex9() {
        int id = 0;
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(++id, "Audi");
        carMap.put(++id, "BMW");
        carMap.put(++id, "Tesla");
        carMap.put(++id, "Volvo");
        carMap.put(++id, "Volkswagen");

        System.out.println("Car Id -- Car Name");
        for(Map.Entry<Integer, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
//        Iterator<Map.Entry<Integer, String>> iterator = carMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator.next();
//            System.out.println(entry.getKey() + " -- " + entry.getValue());
//        }
    }

    //10. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
    // Lastly, print out only the keys.
    public static void ex10() {
        int id = 0;
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(++id, "Audi");
        carMap.put(++id, "BMW");
        carMap.put(++id, "Tesla");
        carMap.put(++id, "Volvo");
        carMap.put(++id, "Volkswagen");

        System.out.println("Keys of Car Map:");
        for(Integer keyEntry : carMap.keySet()) {
            System.out.println(keyEntry);
        }
    }

    //11. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer) and a car brand(String).
    // Lastly, print out only the values.
    public static void ex11() {
        int id = 0;
        Map<Integer, String> carMap = new HashMap<>();
        carMap.put(++id, "Audi");
        carMap.put(++id, "BMW");
        carMap.put(++id, "Tesla");
        carMap.put(++id, "Volvo");
        carMap.put(++id, "Volkswagen");

        System.out.println("Values of Car Map:");
        for (String value : carMap.values()) {
            System.out.println(value);
        }
    }

    //12. Create a new class and call it Car. Add fields for ID,Brand and Model + getters and setters Create a new hashMap of type <Integer,Car>
    // and populate it with elements containing an id(Integer) and a car object(Car). Lastly, print out only the car's brand.
    public static void ex12() {
        Map<Integer, Car> carMap = new HashMap<>();
        carMap.put(1, new Car(10, "Audi", "A3"));
        carMap.put(2, new Car(12, "Audi", "A5"));
        carMap.put(3, new Car(14, "Audi", "A7"));
        carMap.put(4, new Car(20, "BMW", "X1"));
        carMap.put(5, new Car(22, "BMW", "X3"));
        carMap.put(6, new Car(24, "BMW", "X5"));
        carMap.put(7, new Car(30, "Tesla", "X"));
        carMap.put(8, new Car(31, "Tesla", "Y"));
        carMap.put(9, new Car(40, "Volvo", "S60"));
        carMap.put(10, new Car(44, "Volvo", "XC60"));

        System.out.println("Car brands:");
        Set<String> brandSet = new HashSet<>();
        for(Map.Entry<Integer, Car> entries : carMap.entrySet()) {
            brandSet.add(entries.getValue().getBrand());
        }
        for(String brand : brandSet) { // For printing unique brand name
            System.out.println(brand);
        }
    }

    //Challenges 1: Create an empty set and populate it with the all the days of the week.
    // Next create a second set and populate it with ONLY the weekend days (SATURDAY and SUNDAY).
    // Lastly, compare the two sets and retain in the first set only those days that are the same in both sets.
    public static void ex13() {
        List<String> list1 = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        Set<String> set1 = new TreeSet<>(list1);
        Set<String> set2 = new TreeSet<>();
        set2.add("Friday");
        set2.add("Saturday");
        set2.add("Sunday");

        System.out.println(set1);
        System.out.println(set2);
        set1.retainAll(set2);
        System.out.println("Set1 contents after retaining contents of set2: " + set1);
    }

    //Challenges 2: Create a new hashMap of types <String,String> and populate it with elements containing an email (String) and a name (String).
    // Next, create a new Set and populate it with the keys from the hashMap you created.
    public static void ex14() {
        Map<String, String> nameEmailMap = new HashMap<>();
        nameEmailMap.put("Alice", "alice@gmail.com");
        nameEmailMap.put("Peter", "peter@gmail.com");
        nameEmailMap.put("George", "george@gmail.com");
        nameEmailMap.put("Oscar", "oscar@gmail.com");
        System.out.println(nameEmailMap);

        Set<String> nameSet = new HashSet<>(nameEmailMap.keySet());
        System.out.println(nameSet);
    }

    //Challenges 3: Create a new class and call it SuperHero. Add fields for ID,Name and Age + getters and setters.
    // Have the class implement the Comparable interface. Implement the override method and have it compare the AGE of the superhero.
    // Next, create a new arrayList of type SuperHero. Sort the list by age and print out each element.
    public static void ex15() {
        List<SuperHero> superHeroesList = new ArrayList<>();
        superHeroesList.add(new SuperHero(1, "SpiderMan", 22));
        superHeroesList.add(new SuperHero(2, "SuperMan", 20));
        superHeroesList.add(new SuperHero(3, "BatMan", 18));
        superHeroesList.add(new SuperHero(4, "Hulk", 26));
        Collections.sort(superHeroesList);
        for (SuperHero superHero : superHeroesList) {
            System.out.println(superHero.toString());
        }
    }

    //Challenge 4: Create an array of type int with numbers: {1,4,4,2,6,7}. Next, create an appropriate Collection and populate it with
    // the content of the int array. Lastly, print out each element in the Collection without duplicates.
    public static void ex16() {
        Integer[] numbers = new Integer[]{1,4,4,2,6,7};
        System.out.println("Array of Integers: " + Arrays.toString(numbers));
        Set<Integer> numbersSet = new HashSet<>(List.of(numbers));
        System.out.println("Removed duplicates in Array after adding to Set: " + numbersSet);
    }
}