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

    public String toString() {

        return name;
    }

    //метод проверяет, есть ли введенное пользователем значение в enum
    public static boolean isCorrectColor(String userColor) {
        for(ColorData color : ColorData.values()){
            if(color.toString().equals(userColor)){
                return true;
            }
        }
        return false;
    }

    //метод ищет элемент в enum по значению, введенному пользователем
    public static ColorData findColorAnimal (String userColor) {
        for(ColorData color : ColorData.values()){
            if(color.toString().equals(userColor)){
                return color;
            }
        }
        return null;
    }
}
