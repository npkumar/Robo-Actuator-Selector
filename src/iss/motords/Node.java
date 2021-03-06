/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iss.motords;

/**
 *
 * @author nitinpkumar
 */
public class Node {
    
    private int id;

    private String question;
    
    private Node yes;
    private Node no;
    private Node back;

    public Node(String question){
        this.question = question;
        this.id = 100;
    }
    
    public Node(String question, int id){
        this.question = question;
        this.id = id;
    }
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Node getYes() {
        return yes;
    }

    public void setYes(Node yes) {
        this.yes = yes;
    }

    public Node getNo() {
        return no;
    }

    public void setNo(Node no) {
        this.no = no;
    }

    public Node getBack() {
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Node{" + "question=" + question + ", yes=" + yes + ", no=" + no + ", back=" + back + '}';
    }
}
