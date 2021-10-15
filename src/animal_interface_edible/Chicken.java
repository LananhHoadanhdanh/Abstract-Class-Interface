package animal_interface_edible;

public class Chicken extends Animal implements Edible{
    public String makeSound() {
        return "Chiken: Ò ó o";
    }
    public String howtoEat() {
        return "Nấu rồi ăn.";
    }

}
