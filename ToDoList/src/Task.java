public class Task {
    // atributos
    private String description;
    private boolean done;
    // construtor
    public Task(String description) {
        this.description = description;
        this.done = false;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    
}
