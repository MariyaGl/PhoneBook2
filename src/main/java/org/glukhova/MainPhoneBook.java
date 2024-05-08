package org.glukhova;

import java.util.*;

/**
 * Hello world!
 *
 */
public class MainPhoneBook
{
    public static void main( String[] args ) {
        HashMap<String, ArrayList> phoneHashMap = new HashMap<>();

       // ArrayList<String> phonesArrayList1 = new ArrayList<>();
        String fio1 = "Иванов И.И.";
        /*phonesArrayList1.add("+8 800 2000 500");
        phonesArrayList1.add("+8 800 2000 600");*/
        Contacts Contact1 = new Contacts(fio1);
        Contact1.addPhone(Arrays.asList("+8 800 2000 500","+8 800 2000 600"));
        Contact1.printContacts();

     //   ArrayList<String> phonesArrayList2 = new ArrayList<>();
        String fio2 = "Петров П.П.";
        Contacts Contact2 = new Contacts(fio2);
        Contact2.addPhone(Arrays.asList("+8 800 2000 700"));
       // Contact2.printContacts();

       // ArrayList<String> phonesArrayList3 = new ArrayList<>();
        String fio3 = "Сидоров С.С.";
        Contacts Contact3 = new Contacts(fio3);      // Contact3.printContacts();
        Contact3.addPhone(Arrays.asList("+8 800 2000 800","+8 800 2000 900","+8 800 2000 000"));
      //  Contact3.printContacts();

        //contactsHashMap.put(fio3,Arrays.asList("+8 800 2000 800","+8 800 2000 900","+8 800 2000 000"))
        phoneHashMap.put(fio1 , Contact1.phonesArrayList);
        phoneHashMap.put(fio2 , Contact2.phonesArrayList);
        phoneHashMap.put(fio3 , Contact3.phonesArrayList);
       // System.out.println(" phoneHashMap= " + phoneHashMap);

        ArrayList<String> phonesArrayList = new ArrayList<>();
        boolean existsFio = false;

        try {
            while (!existsFio) {
                System.out.println("Введите ФИО ");
                Scanner scannerEntered = new Scanner(System.in);
                String enteredFio = "";
                enteredFio = scannerEntered.nextLine();
                existsFio = phoneHashMap.containsKey(enteredFio);
               // System.out.println("existsFio =" + existsFio);
                phonesArrayList = phoneHashMap.get(enteredFio/*"Сидоров С.С."*/);
            }
        } catch (Exception e) {
            System.out.println("Что-то пошло не так" + e);
        }

        printPhone(phonesArrayList);
    }

    public static void printPhone (ArrayList phones){
        int nomerPP = 0;
        for (int i = 0; i <phones.size(); i++) {
            nomerPP = i+1;
            System.out.println(nomerPP +". "+phones.get(i));
        }
    }
}

