package duke_exception;
public class DukeUnknownException extends DukeException {
    public DukeUnknownException() {
        super("OOPS!!! I'm sorry, but I don't know what that means.");
    }
}