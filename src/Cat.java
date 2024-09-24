public class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("the cat meows");
    }
    @Override
    public void move()
    {
        System.out.println("the cat is walking quietly");
    }
    @Override
    public void eat()
    {
        System.out.println("the cat is eating a fish");
    }
}
