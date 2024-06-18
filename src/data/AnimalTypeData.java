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
     public static boolean isCorrectType(String userName) {
         for(AnimalTypeData animal : AnimalTypeData.values()){
             if(animal.toString().equals(userName)){
                 return true;
             }
         }
         return false;
        }
     public static String findTypeAnimal (String userName) {
         for(AnimalTypeData animal : AnimalTypeData.values()){
             if(animal.toString().equals(userName)){
                 return animal.name();
             }
         }
         return null;
     }
     }

