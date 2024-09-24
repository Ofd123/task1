public class Bird extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("the bird twits");
    }
    @Override
    public void move()
    {
        System.out.println("the bird is flying");
    }
    @Override
    public void eat()
    {
        System.out.println("the bird is eating seeds");
    }
}
