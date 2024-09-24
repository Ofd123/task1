public class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("the dog barks");
    }
    @Override
    public void move()
    {
        System.out.println("the dog is running");
    }
    @Override
    public void eat()
    {
        System.out.println("the dog is eating a chicken");
    }
}
