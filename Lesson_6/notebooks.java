package Lesson_6;
import java.util.ArrayList;
import Lesson_6.program.Notebook;

public class notebooks {
    public static void main(String[] args) {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Apple", "MacBook Pro", 199999, 5, 15.9, 16, 512));
        notebooks.add(new Notebook("Dell", "XPS 13", 39999, 1, 14.2, 16, 1024));
    
    for (Notebook notebook : notebooks) {
        System.out.println(notebook.getManufacturer() + " " + notebook.getModel() + ": " + notebook.getPrice());
    }
}
}
