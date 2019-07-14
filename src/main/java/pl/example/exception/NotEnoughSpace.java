package pl.example.exception;

public class NotEnoughSpace extends RuntimeException
{
    public NotEnoughSpace(String message)
    {
        super(message);
    }
}
