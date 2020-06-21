/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1lubao;

/**
 *
 * @author Jeo
 */
public class SinglyLinkedList {

    public static void main(String[] args) {
        //  Person person1 = new Person("Jeo", "Lubao", "Philippines");

        // In the Main class within the main method, declare an array of Person class with a size of five(5)
        Person[] persons = new Person[5];
        //Instantiate each element of the array with its proper instantiation. (10 points)
        persons[0] = new Person("Jeo", "Lubao", "Philippines");
        persons[1] = new Person("Donald", "Trump", "U.S.A");
        persons[2] = new Person("Xi", "Jinping", "China");
        persons[3] = new Person("Naruto", "Uzumaki", "Konoha");
        persons[4] = new Person("Felix", "Kjellberg", "Sweden");

        //Create five(5) nodes of SinglyLinkedList with Person as its data type. The element of each node is obviously the Person objects declared as an array in Item No. 2.
        SNode<String> node1 = new SNode<String>(persons[0].getFirstName(), persons[0].getLastName(), persons[0].getAddress(), null);
        SNode<String> node2 = new SNode<String>(persons[1].getFirstName(), persons[1].getLastName(), persons[1].getAddress(), null);
        SNode<String> node3 = new SNode<String>(persons[2].getFirstName(), persons[2].getLastName(), persons[2].getAddress(), null);
        SNode<String> node4 = new SNode<String>(persons[3].getFirstName(), persons[3].getLastName(), persons[3].getAddress(), null);
        SNode<String> node5 = new SNode<String>(persons[4].getFirstName(), persons[4].getLastName(), persons[4].getAddress(), null);

        SList<String> SinglyLinkedList = new SList<>();

        //Add each node into the SinglyLinkedList using the methods discussed during the session. 
        //Each add method must be utilized to test its functionality. 
        //These are the addFirst and addLast methods.
        SinglyLinkedList.addFirst(node1);
        SinglyLinkedList.addFirst(node2);
        SinglyLinkedList.addFirst(node3);
        SinglyLinkedList.addLast(node4); // INSERTS [Naruto, Uzumaki, Konoha] -> IN THE LAST PART OF THE SINGLYLINKEDLIST
        SinglyLinkedList.addFirst(node5);

        // THE LIST SHOULD PROBABLY LOOK LIKE THIS
        //[Felix, Kjellberg, Sweden] -> [Xi, Jinping, China] -> [Donald, Trump, U.S.A] -> [Jeo, Lubao, Philippines] -> [Naruto, Uzumaki, Konoha] ->
        // Display the list. The display of the list must be a method call of a method of SinglyLinkedList. 
        System.out.println("\n Before removeFirst()");
        SinglyLinkedList.SinglyLinkedList();

        // THE LIST SHOULD PROBABLY LOOK LIKE THIS
        //[Xi, Jinping, China] -> [Donald, Trump, U.S.A] -> [Jeo, Lubao, Philippines] -> [Naruto, Uzumaki, Konoha] ->
        // Shows the functionality of removeFirst method.
        System.out.println("\n After removeFirst()");
        SinglyLinkedList.removeFirst();
        SinglyLinkedList.SinglyLinkedList();

    }
}
