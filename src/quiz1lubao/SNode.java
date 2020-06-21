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
public class SNode<E> {

    private String element1, element2, element3;
    private SNode next;

    public SNode(String element1, String element2, String element3, SNode next) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.next = next;
    }

    /**
     * @return the element1
     */
    public String getElement1() {
        return element1;
    }

    /**
     * @param element1 the element1 to set
     */
    public void setElement1(String element1) {
        this.element1 = element1;
    }

    /**
     * @return the element2
     */
    public String getElement2() {
        return element2;
    }

    /**
     * @param element2 the element2 to set
     */
    public void setElement2(String element2) {
        this.element2 = element2;
    }

    /**
     * @return the element3
     */
    public String getElement3() {
        return element3;
    }

    /**
     * @param element3 the element3 to set
     */
    public void setElement3(String element3) {
        this.element3 = element3;
    }

    /**
     * @return the next
     */
    public SNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(SNode next) {
        this.next = next;
    }
}
