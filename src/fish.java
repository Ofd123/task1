public class fish extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("blub blub");
    }
    @Override
    public void move()
    {
        System.out.println("the fish is swimming");
    }
    @Override
    public void eat()
    {
        System.out.println("the the fish is eating a worm");
    }
}
