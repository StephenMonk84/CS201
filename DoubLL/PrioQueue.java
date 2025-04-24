public class PrioQueue implements Comparable<PrioQueue> {
    private int priority;
    private String name;
    private String condition;

    public PrioQueue(int priority, String name, String condition) {
        this.priority = priority;
        this.name = name;
        this.condition = condition;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }
    public String getCondition() {
        return condition;
    }

    @Override
    public int compareTo(PrioQueue other) {
        return Integer.compare(this.priority, other.priority);
    }

    public String toString(){
        return "Next Patient (" + getPriority() + "): " + getName() + " (" + getCondition() + ")";
    }
}
