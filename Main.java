package datastructureprogram;

public class Main {
    public static void main(String[] args){
        HashTable1 hashTable = new HashTable1();
           
        hashTable.addValue(10);  hashTable.addValue(20);
        hashTable.addValue(11);    hashTable.addValue(21);
        hashTable.addValue(12);    hashTable.addValue(22);
        hashTable.addValue(13);    hashTable.addValue(23);
        hashTable.addValue(14);    hashTable.addValue(24);
        hashTable.addValue(15);    hashTable.addValue(25);
        hashTable.addValue(16);    hashTable.addValue(26);
        hashTable.addValue(17);    hashTable.addValue(27);
        hashTable.addValue(18);    hashTable.addValue(28);
        hashTable.addValue(19);    hashTable.addValue(29);
       
        hashTable.printHashTable(hashTable.HashTable);
    }
}
