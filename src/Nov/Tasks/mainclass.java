package Nov.Tasks;

public class mainclass extends Dog {
    public static void main(String[] args) {
        // Create object
        Dog dog1 = new Dog();
        dog1.name = "Blacky";
        dog1.color = "Balck";
        dog1.age = 2;
        dog1.breed = "Pitbull";
        dog1.weight = 10.5;

        Dog dog2 = new Dog();
        dog2.name = "Whity";
        dog2.color = "White";
        dog2.age = 2;
        dog2.breed = "Pitbull";
        dog2.weight = 15.5;

        Dog dog3 = new Dog();
        dog3.name = "Susy";
        dog3.color = "Grey";
        dog3.age = 5;
        dog3.breed= "pub";
        dog3.weight = 20.5;

        Dog dog4 = new Dog();
        dog4.name = "Sandy";
        dog4.color = "Brown";
        dog4.age = 4;
        dog4.breed = "pub1";
        dog4.weight = 25.5;

        Dog dog5 = new Dog();
        dog5.name = "Mandy";
        dog5.color = "Black";
        dog5.age = 3;
        dog5.breed = "German Shepherd";
        dog5.weight = 30.5;




        // Call Display method
        dog1.display();
        dog2.display();
        dog3.display();
        dog4.display();
        dog5.display();



    }
}
