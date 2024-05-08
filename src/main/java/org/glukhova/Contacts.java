package org.glukhova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Contacts {

    ArrayList<String> phonesArrayList = new ArrayList<>();
    String fio ;
    public Contacts (String fio){
        this.fio = fio;
    }

    /*public Contacts (String fio, ArrayList phonesArrayList ){
        this.fio = fio;
        this.phonesArrayList = phonesArrayList;
    }*/

    public void printContacts (){
        System.out.println(" ФИО: " + this.fio);
        for (int i = 0; i <this.phonesArrayList.size(); i++) {
            System.out.println(this.phonesArrayList.get(i));
        }
    }

    public void addPhone(List phones) {
           for (int i = 0; i < phones.size(); i++) {
              this.phonesArrayList.add((String) phones.get(i));
        }
    }
}

