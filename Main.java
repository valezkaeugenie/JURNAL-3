package com.company;

import java.util.Scanner;

 class Main {

    public static void main(String[] args) {

        SinglyLinkedList<pegawai> linkedList =
                new SinglyLinkedList<>();
        Scanner scan = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi){
                                menu();
                                int input = scan.nextInt();
                                switch (input){
                                    case 1:
                                        String nip = scan.next();

                                        String nama = scan.next();

                                        String divisi = scan.next();

                                        System.out.println("Tambahkan data diawal list? (y/n)");

                                        if(scan.next().equals("y")){ //JIKA INPUTAN Y MAKA NODE DEPAN
                                                                        // JIKA NIPUTAN N MAKA NODE BELAKANG
                                            linkedList.insertAtFront(new pegawai(nip, nama, divisi));
                                        }else {
                                            linkedList.insertAtBack(new pegawai(nip, nama, divisi));
                                        }
                                        break;

                case 2:
                    System.out.println("Hapus data diawal list? (y/n)");
                    
                    if(scan.next().equals("y")){
                        linkedList.removeFromFront();
                    }else {
                        linkedList.removeFromBack();
                    }
                    break;

                                            case 3:
                                                linkedList.print();
                                                break;
                                            default:
                                                kondisi = false;
                                                break;

                                        }
                                    }
                                }

    public static void menu(){
        System.out.println("Pilihlah menu:");
         System.out.println("1. Input data");
             System.out.println("2. Hapus data");
                 System.out.println("3. Cetak list pegawai");
                     System.out.println("4. keluar");
    }

}

