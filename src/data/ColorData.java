package data;

public enum ColorData {

    GREY ("серый"),
    YELLOW ("жёлтый"),
    ORANGE ("рыжий"),
    BROWN ("коричневый"),
    WHITE("белый"),
    BLACK ("черный");
    private String name;
    ColorData (String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return name;
    }

    public static boolean isCorrectColor(String userColor) {
        for(ColorData color : ColorData.values()){
            if(color.toString().equals(userColor)){
                return true;
            }
        }
        return false;
    }
    public static ColorData findColorAnimal (String userColor) {
        for(ColorData color : ColorData.values()){
            if(color.toString().equals(userColor)){
                return color;
            }
        }
        return null;
    }
}
