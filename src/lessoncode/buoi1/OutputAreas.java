package lessoncode.buoi1;

public class OutputAreas {
    double areas = 0;

    public OutputAreas(double areas) {
        this.areas = areas;
    }

    public void console(){
        System.out.println("Total of all areas = "+areas);
    }

    public void HTML(){
        System.out.println("<HTML>");
        System.out.println("Total of all all areas = "+areas);
        System.out.println("</HTML>");
    }
    
}
