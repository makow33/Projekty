package pl.sda.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Main {

    public static void main(String[] args) {


//        arrays1();
//        arrays2();
//        arrayList();
//        arrayList1();
//        hashSet();
//        hashSet2();
        hashMap();
//        hashMap2();

    }


    static void arrays1() {
        String[] names = new String[3];
        names[0] = "Julian";
        names[1] = "Kornel";
        names[2] = "Krzysztof";
        for (String name : names) {
            System.out.println(name);
        }


    }

    static void arrays2() {
        String[] names = {"Julian", "Kornel", "Krzysztof"};
        for (String name : names) {
            System.out.println(name);
        }
    }

    static void arrayList() {
        ArrayList<String> grocery = new ArrayList<>();

        //Dodawanie elementów
        grocery.add("Apple");
        grocery.add("Orange");
        grocery.add("Bread");

        System.out.println(grocery);
        System.out.println("----");

        //Dodawanie elementów pod konkretnym indeksem
        grocery.add(0, "Butter");
        grocery.add(1, "Cereal");

        System.out.println(grocery);
        System.out.println("----");

        //Usuwanie elementów (na konkretnej pozycji)
        grocery.remove("Orange");
        grocery.remove(0);

        System.out.println(grocery);
        System.out.println("----");


        grocery.set(2, "Banana"); // Nadpisanie

        System.out.println(grocery);
        System.out.println("----");

        if (grocery.contains("Banana"))
            System.out.println("Bananananananana!");

        System.out.println(grocery.get(2));

    }


    private static void arrayList1() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.addAll(0, list1);

        System.out.println(list2);


    }

    static void hashSet() {

        HashSet<Integer> set = new HashSet<>();

        // zbiór musi być unikalny

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(3);
        set.add(6);

        set.remove(3);


//        Iterator<Integer> iterator = set.iterator();  // Przejscie przez wszystkie elementy zbioru // rzadko wykorzystywany
//        while (iterator.hasNext()) {                  // czesciej zamiast interatora uzywamy "for each "
//            System.out.println(iterator.next());
//        }

        if (set.contains(4)) {                // set to jest nazwa tego zbioru
            System.out.println("4 is here");
        }
    }

    static void hashSet2() {

        HashSet<String> subjects = new HashSet<>();

        subjects.add("Math");
        subjects.add("English");
        subjects.add("French");
        subjects.add("French");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("French");

        for (String subject : subjects) {
            System.out.println(subject);
        }

        System.out.println("Rozmiar zbioru " + subjects.size());
    }

    static void hashMap() {

        HashMap<String, Boolean> attendance = new HashMap<>();

        attendance.put("Jurec", true);
        attendance.put("Juruć", false);
        attendance.put("Buchoń", false);
        attendance.put("Konfanty", true);
        attendance.put("Białkowksa", true);


        // ponieżej jest pętla for each
        for (Map.Entry<String, Boolean> entry : attendance.entrySet()) {  // .Entry to interfejs wewnętrzny(klasa
            // wewnętrzna)
            if (entry.getValue() == true) //można pominąć == true. Napisałem dla widoczności
                System.out.println(entry.getKey() + " here!");
            else
                System.out.println("Absent!");
        }

//        System.out.println(attendance.get("Jurec"));
//        System.out.println(attendance.get("Buchoń"));

    }

    static void hashMap2() {

        HashMap<String, Boolean> attendance = new HashMap<>();

        attendance.put("Jurec", true);
        attendance.put("Juruć", false);
        attendance.put("Buchoń", false);
        attendance.put("Konfanty", true);
        attendance.put("Białkowksa", true);

        attendance.remove("Juruć");

        System.out.println(attendance);
    }


}
