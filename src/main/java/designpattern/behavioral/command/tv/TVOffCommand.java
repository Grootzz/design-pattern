package designpattern.behavioral.command.tv;

public class TVOffCommand implements Command{
    private Televation televation;

    public TVOffCommand(Televation televation) {
        this.televation = televation;
    }

    @Override
    public void execute() {
        televation.off();
    }
}
