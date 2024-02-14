import com.sun.source.tree.Tree;

public class Trees {
    public int height;
    public int age;
    public String view;
    public String season;
    public String colorList;
    public int maxHeight;
    public Trees(int height, int age, String view, String season, String colorList,int maxHeight){
        this.height = height;
        this.age = age;
        this.view = view;
        this.colorList = colorList;
        this.season = season;
        this.maxHeight = maxHeight;
    }
    public int Growup(int height){
        boolean wasRain = true;
        if (wasRain && (height + 1 <= maxHeight)) {
            height += 1;
        } if (height <= maxHeight){
            return height;
        } else {
            return height = 0;
        }
    }
    public String changeColorList(String season){
        switch (season) {
            case "Spring" -> colorList = "Листьев нет(";
            case "Summer" -> colorList = "green";
            case "Autumn" -> colorList = "yellow";
            default -> colorList = "Листьев нет(";
        }
        return colorList;
    }
}
