/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST;

/**
 *
 * @author Noc
 */
public class Book {
    private int CodeName;
    private String Name;

    public Book(int CodeName, String Name) {
        this.CodeName = CodeName;
        this.Name = Name;
    }

    public Book() {
    }

    public int getCodeName() {
        return CodeName;
    }

    public void setCodeName(int CodeName) {
        this.CodeName = CodeName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void show()
    {
        System.out.println(this.getCodeName()+" : "+this.getName());
    }
}
