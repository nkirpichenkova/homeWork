package data;

public enum AnimalTypeData {
    CAT ("кошка"),
    DOG ("собака"),
    DUCK ("утка");

    private String userName;
    AnimalTypeData (String userName) {
        this.userName = userName;
    }

    public String toString() {
        return userName;
    }

    //метод проверяет: есть ли введенное пользователем значение в enum
    public static boolean isCorrectType(String userName) {
         for(AnimalTypeData animal : AnimalTypeData.values()){
             if(animal.toString().equals(userName)){
                 return true;
             }
         }
         return false;
        }

        //метод ищет и возвращет по введенному пользователем значению, элемент enum
        public static String findTypeAnimal (String userName) {
         for(AnimalTypeData animal : AnimalTypeData.values()){
             if(animal.toString().equals(userName)){
                 return animal.name();
             }
         }
         return null;
     }
     }

