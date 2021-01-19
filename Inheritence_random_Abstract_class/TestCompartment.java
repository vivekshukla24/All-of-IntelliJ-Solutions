package Inheritence_random_Abstract_class;
import java.util.Random;
abstract class Compartment{
    abstract int notice();
}
class  FirstClass extends Compartment{
int notice(){
        System.out.println("This is the First Class");
        return 0;
    }
}
class Ladies extends Compartment{
int notice(){
    System.out.println("This is the Ladies Section");
    return 0;
}
}
class General extends Compartment{
int notice(){
    System.out.println("This is the General Section");
    return 0;
}
}
class Luggage extends Compartment{
    int notice(){
        System.out.println("This is the luggage Section");
        return 0;
    }
}
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt((4 - 1) + 1) + 1;

            if (randomNum == 1)
                compartments[i] = new FirstClass();
            else if (randomNum == 2)
                compartments[i] = new Ladies();
            else if (randomNum == 3)
                compartments[i] = new General();
            else if (randomNum == 4)
                compartments[i] = new Luggage();
            compartments[i].notice();
        }
    }
}
