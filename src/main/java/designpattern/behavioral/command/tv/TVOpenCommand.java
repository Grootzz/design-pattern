package designpattern.behavioral.command.tv;

public class TVOpenCommand implements Command{
    private Televation televation;

    public TVOpenCommand(Televation televation) {
        this.televation = televation;
    }

    @Override
    public void execute() {
        televation.open();
    }
}
